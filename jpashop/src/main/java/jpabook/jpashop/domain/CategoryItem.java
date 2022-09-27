package jpabook.jpashop.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * packageName : jpabook.jpashop.domain
 * fileName : CategoryItem
 * author : SHW
 * date : 2022-09-20
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-09-20   SHW     최초 생성
 */
@Entity
public class CategoryItem {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    private int orderAmount;
    private LocalDateTime orderDateTime;
}
