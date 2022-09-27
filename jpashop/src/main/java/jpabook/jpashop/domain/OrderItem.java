package jpabook.jpashop.domain;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

/**
 * packageName : jpabook.jpashop.domain
 * fileName : OrderItem
 * author : SHW
 * date : 2022-09-13
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-09-13   SHW     최초 생성
 */
@Entity
public class OrderItem extends BaseEntity{
    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name="ORDER_ID")
    private Order order;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name="ITEM_ID")
    private Item item;

    private int orderPirce;

    private int count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getOrderPirce() {
        return orderPirce;
    }

    public void setOrderPirce(int orderPirce) {
        this.orderPirce = orderPirce;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
