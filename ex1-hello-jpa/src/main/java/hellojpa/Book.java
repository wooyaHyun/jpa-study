package hellojpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * packageName : hellojpa
 * fileName : Book
 * author : SHW
 * date : 2022-09-20
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-09-20   SHW     최초 생성
 */
@Entity
@DiscriminatorValue("B")
public class Book extends Item{

    private String author;
    private String isbn;
}
