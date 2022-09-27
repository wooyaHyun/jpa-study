package hellojpa;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * packageName : hellojpa
 * fileName : BaseEntity
 * author : SHW
 * date : 2022-09-20
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-09-20   SHW     최초 생성
 */
@MappedSuperclass
public abstract class BaseEntity {

    private String createdBy;
    private LocalDateTime createdDate;
    private String lastModifieddBy;
    private LocalDateTime lastModifiedDate;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifieddBy() {
        return lastModifieddBy;
    }

    public void setLastModifieddBy(String lastModifieddBy) {
        this.lastModifieddBy = lastModifieddBy;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
