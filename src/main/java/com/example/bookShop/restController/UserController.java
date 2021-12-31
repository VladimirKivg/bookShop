package com.example.bookShop.restController;

import com.example.bookShop.pojo.UserPojo;
import com.example.bookShop.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepositories userRepositories;

    @GetMapping("/getUser")
    public List<UserPojo> getAllUser(){
        List<UserPojo> all = userRepositories.findAll();
        return all;
    }

    @RequestMapping("/putUser")
    public List<UserPojo> putUser(@RequestBody UserPojo userPojo){
        userRepositories.save(userPojo);
       return getAllUser();
    }

}
