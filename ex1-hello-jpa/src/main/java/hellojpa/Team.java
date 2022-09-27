package hellojpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName : hellojpa
 * fileName : Team
 * author : SHW
 * date : 2022-09-13
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-09-13   SHW     최초 생성
 */

@Entity
public class Team extends  BaseEntity{
    @Id @GeneratedValue
    @Column(name="TEAM_ID")
    private  Long id;

    private String name;

    //다:1
//    @OneToMany(mappedBy = "team")
//    private List<Member> members = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "TEAM_ID")
    private List<Member> members = new ArrayList<>();

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

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }


}
