package jpql;

import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName : jpql
 * fileName : Team
 * author : SHW
 * date : 2022-09-25
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-09-25   SHW     최초 생성
 */
@Entity
public class Team {

    @Id @GeneratedValue
    private Long id;

    private String name;

    //@BatchSize(size = 100) // size의 크기만큼 in 쿼리로 team에 해당하는 Member를 조회해온다.
    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
