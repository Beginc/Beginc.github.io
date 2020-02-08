package controller;

import service.UserService;

public class UserController {
    private UserService userService;

    public void save(){
        userService.save();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void init(){
        System.out.println("Init User Controller...");
    }

    public void destroy(){
        System.out.println("Destroy User Controller...");
    }
}
