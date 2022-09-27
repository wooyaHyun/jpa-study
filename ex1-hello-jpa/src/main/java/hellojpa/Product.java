package hellojpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * packageName : hellojpa
 * fileName : Product
 * author : SHW
 * date : 2022-09-19
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-09-19   SHW     최초 생성
 */

@Entity
public class Product {
    @Id @GeneratedValue
    private Long id;

    private String name;


}
