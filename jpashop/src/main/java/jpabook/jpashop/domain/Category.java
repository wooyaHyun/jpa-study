package jpabook.jpashop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.*;

/**
 * packageName : jpabook.jpashop.domain
 * fileName : Category
 * author : SHW
 * date : 2022-09-19
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-09-19   SHW     최초 생성
 */
@Entity
public class Category extends BaseEntity{

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "PARENT_ID")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<>();

    //사용하면 안됨
//    @ManyToMany
//    @JoinTable(name="CATEGORY_ID",
//            joinColumns = @JoinColumn(name = "CATEGORY_ID"),
//            inverseJoinColumns = @JoinColumn(name = "ITEM_ID")
//    )
//    private List<Item> items = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<CategoryItem> categoryItems = new ArrayList<>();

}
