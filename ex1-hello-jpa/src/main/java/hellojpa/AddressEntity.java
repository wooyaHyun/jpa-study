package hellojpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * packageName : hellojpa
 * fileName : AddressEntity
 * author : SHW
 * date : 2022-09-25
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-09-25   SHW     최초 생성
 */
@Entity
@Table(name = "ADDRESS")
public class AddressEntity {
    @Id
    @GeneratedValue
    private Long id;

    private Address address;

    public AddressEntity(String city, String street, String zipcode) {
        this.address = new Address(city, street, zipcode);
    }


    public Long getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

}
