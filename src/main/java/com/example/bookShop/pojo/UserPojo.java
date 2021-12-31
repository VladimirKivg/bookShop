package com.example.bookShop.pojo;

import lombok.*;

import javax.persistence.*;
import java.util.Iterator;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user")
public class UserPojo  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String firstName;


}
