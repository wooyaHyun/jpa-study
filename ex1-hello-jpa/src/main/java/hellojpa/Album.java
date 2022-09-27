package hellojpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * packageName : hellojpa
 * fileName : Album
 * author : SHW
 * date : 2022-09-20
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-09-20   SHW     최초 생성
 */

@Entity
@DiscriminatorValue("A")
public class Album extends Item{

    private String artist;
}
