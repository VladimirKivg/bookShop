package com.example.bookShop.repositories;

import antlr.collections.impl.IntRange;
import com.example.bookShop.pojo.UserPojo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepositories extends CrudRepository<UserPojo, IntRange> {
List<UserPojo> findAll();
}
