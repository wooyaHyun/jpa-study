package hellojpa;

import javax.persistence.AttributeOverrides;
import javax.persistence.Embeddable;
import java.time.LocalDateTime;

/**
 * packageName : hellojpa
 * fileName : Period
 * author : SHW
 * date : 2022-09-25
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-09-25   SHW     최초 생성
 */

@Embeddable
public class Period {

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
