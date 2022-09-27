package jpql;

import javax.persistence.*;
import java.util.List;

/**
 * packageName : jpql
 * fileName : JpaMain
 * author : SHW
 * date : 2022-09-25
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-09-25   SHW     최초 생성
 */

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();   // 간단하게 커넥션 가져오는 것

        EntityTransaction tx = em.getTransaction();     //트렌젝션 가져오는 것
        tx.begin();

        try{

//            Member member = new Member();
//            member.setUsername("member1");
//            member.setAge(10);
//            em.persist(member);

            //TypedQuery : 반환형을 알때, Query : 반환형을 모를때
//            TypedQuery<Member> query1 = em.createQuery("select m from Member m", Member.class);
//            TypedQuery<String> query2 = em.createQuery("select m.username from Member m", String.class);
//            Query query3 = em.createQuery("select m.username, m.age from Member m");

//            TypedQuery<Member> query = em.createQuery("select m from Member m", Member.class);
//            List<Member> resultList = query.getResultList();

//            TypedQuery<Member> query = em.createQuery("select m from Member m where m.id = 10", Member.class);
//            Member result = query.getSingleResult();
//            //Spring Data Jpa ->
//            System.out.println("result = " + result);

            //이거를 Chaining으로 묶음
            /*TypedQuery<Member> query = em.createQuery("select m from Member m where m.username = :username", Member.class);
            query.setParameter("username", "member1");
            Member singleResult = query.getSingleResult();
            System.out.println("singleResult = " + singleResult.getUsername());*/
//            Member result = em.createQuery("select m from Member m where m.username = :username", Member.class)
//                    .setParameter("username", "member1")
//                    .getSingleResult();
//            System.out.println("result = " + result.getUsername());

            /*프로젝션 여러값 조회
            Member member = new Member();
            member.setUsername("member1");
            member.setAge(10);
            em.persist(member);

            List<MemberDTO> result = em.createQuery("select new jpql.MemberDTO(m.username, m.age) from Member m", MemberDTO.class)
                    .getResultList();

            MemberDTO memberDTO = result.get(0);
            System.out.println("memberDTO = " + memberDTO.getUsername());
            System.out.println("memberDTO = " + memberDTO.getAge());*/

            /* 페이징처리
            for (int i = 0; i < 100; i++) {
                Member member = new Member();
                member.setUsername("member"+i);
                member.setAge(i);
                em.persist(member);
            }
            em.flush();
            em.clear();

            List<Member> result = em.createQuery("select m from Member m order by m.age desc", Member.class)
                    .setFirstResult(1)
                    .setMaxResults(10)
                    .getResultList();

            System.out.println("result.size() = " + result.size());
            for (Member member1 : result) {
                System.out.println("member1 = " + member1);
            }*/

            /*
            Team team = new Team();
            team.setName("teamA");
            em.persist(team);


            Member member = new Member();
            //member.setUsername("member1");
            member.setUsername(null);
            member.setAge(10);
            member.setType(MemberType.ADMIN);
            member.setTeam(team);

            em.persist(member);

            em.flush();
            em.clear();*/

            /* join
            String query = "select m from Member m left join m.team t";
            List<Member> result = em.createQuery(query, Member.class)
                    .getResultList();

            String query = "select m from Member m left join Team t on m.username = t.name";
            List<Member> result = em.createQuery(query, Member.class)
                    .getResultList();*/

            /*
            String query = "select m.username, 'HELLO', true From Member m "
                        + "where m.type = :userType";
;
            List<Object[]> result = em.createQuery(query)
                    .setParameter("userType", MemberType.ADMIN)
                    .getResultList();

            for (Object[] objects : result) {
                System.out.println("objects = " + objects[0]);
                System.out.println("objects = " + objects[1]);
                System.out.println("objects = " + objects[2]);
            }*/
            /* CASE
            member.setUsername(null);
            String query = "select coalesce(m.username, '이름없는 회원') from Member m ";
                    *//*"select " +
                        "case when m.age <= 10  then '학생요금' "+
                             "when m.age >= 60  then '경로요금' "+
                             "else '일반요금' " +
                        "end " +
                    "from Member m";*//*
            List<String> result = em.createQuery(query, String.class).getResultList();

            for (String s : result) {
                System.out.println("s = " + s);
            }*/

            //FETCH 조인***중요
            Team teamA = new Team();
            teamA.setName("팀A");
            em.persist(teamA);

            Team teamB = new Team();
            teamB.setName("팀B");
            em.persist(teamB);

            Member member1 = new Member();
            member1.setUsername("회원1");
            member1.setTeam(teamA);
            em.persist(member1);

            Member member2 = new Member();
            member2.setUsername("회원2");
            member2.setTeam(teamA);
            em.persist(member2);

            Member member3 = new Member();
            member3.setUsername("회원3");
            member3.setTeam(teamB);
            em.persist(member3);

            em.flush();
            em.clear();

            String query = "select m From Member m join fetch m.team";
            //String query = "select distinct t From Team t join fetch t.members";

            List<Member> result = em.createQuery(query, Member.class).getResultList();

            for (Member member : result) {
                System.out.println("member = " + member.getUsername() + ", " + member.getTeam().getName());

            }


            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }

        emf.close();

    }
}
