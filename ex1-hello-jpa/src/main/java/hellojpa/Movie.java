package hellojpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * packageName : hellojpa
 * fileName : Movie
 * author : SHW
 * date : 2022-09-20
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-09-20   SHW     최초 생성
 */
@Entity
@DiscriminatorValue("M")
public class Movie extends Item{

    private String director;
    private String actor;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
