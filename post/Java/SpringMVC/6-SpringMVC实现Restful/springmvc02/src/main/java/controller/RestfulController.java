package controller;

import exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pojo.User;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestfulController {

    @GetMapping("/rest/users/")
    @ResponseStatus(HttpStatus.OK)
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            List<String> hobbies = new ArrayList<>();
            hobbies.add("打球");
            hobbies.add("吃火锅");
            user.setHobbies(hobbies);
            user.setId(i);
            user.setName("罗浩文");

            users.add(user);
        }
        return users;
    }

    @GetMapping("/rest/users/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public User findById(@PathVariable(name = "id", required = true) int id) {
        User user = new User();
        List<String> hobbies = new ArrayList<>();
        hobbies.add("打球");
        hobbies.add("吃火锅");
        user.setHobbies(hobbies);
        user.setId(id);
        user.setName("罗浩文");

        return user;
    }

    @PostMapping("/rest/users/")
    @ResponseStatus(HttpStatus.OK)
    public void add(@RequestBody User user) {
        System.out.println(user);
    }

    @DeleteMapping("/rest/users/")
    @ResponseStatus(HttpStatus.OK)
    public void deleteAll() {
        System.out.println("delete all");
    }

    @DeleteMapping("/rest/users/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable(name = "id", required = true) int id) {
        System.out.println("delete user " + id);
    }

    @PutMapping("/rest/users/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public void updateById(@PathVariable(name = "id", required = true) int id, @RequestBody User user) {
        System.out.println("update user " + id + "  " + user);
    }

    @GetMapping("/rest/error")
    @ResponseStatus(HttpStatus.OK)
    public void error() {
        throw new CustomException("custom exception");
    }
}
