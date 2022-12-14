package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Set;

/**
 * packageName : hellojpa
 * fileName : JpaMain
 * author : SHW
 * date : 2022-09-04
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-09-04   SHW     최초 생성
 */

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();   // 간단하게 커넥션 가져오는 것

        EntityTransaction tx = em.getTransaction();     //트렌젝션 가져오는 것
        tx.begin();

        try{

            List<Member> result = em.createQuery(
                    "select m from Member m where m.username like '%kim%'",
                    Member.class
            ).getResultList();

            for (Member member : result) {
                System.out.println("member = " + member);
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
