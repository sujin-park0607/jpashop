package jpabook.jpashop.domain;

import javax.persistence.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_ID")
    private Long id;
    private String name;
    private int price;
    private int stockQuantity;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();
}
