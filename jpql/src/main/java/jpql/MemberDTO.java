package jpql;

/**
 * packageName : jpql
 * fileName : MemberDTO
 * author : SHW
 * date : 2022-09-26
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-09-26   SHW     최초 생성
 */

public class MemberDTO {

    private String username;
    private int age;

    public MemberDTO(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
