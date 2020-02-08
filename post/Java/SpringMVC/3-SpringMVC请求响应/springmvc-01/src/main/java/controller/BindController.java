package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.People;

import java.util.*;

@Controller
@RequestMapping("/bind")
public class BindController {

    @RequestMapping(path = "/int")
    public String intView(int var){
        System.out.println(var);

        return "success";
    }

    @RequestMapping(path = "/string")
    public String stringView(String var){
        System.out.println(var);
        return "success";
    }

    @RequestMapping(path = "/array")
    public String arrayView(int[] var){
        System.out.println(Arrays.toString(var));
        return "success";
    }

    @RequestMapping(path = "/list")
    public String listView(@RequestParam("var") List<Integer> var){
        for (Integer integer : var) {
            System.out.println(integer);
        }
        return "success";
    }

    @RequestMapping(path = "/set")
    public String setView(@RequestParam("var") Set<Integer> var){
        for (Integer integer : var) {
            System.out.println(integer);
        }
        return "success";
    }


    @RequestMapping(path = "/object")
    public String objectView(People people){
        System.out.println(people);
        return "success";
    }

    @RequestMapping(path = "/conversion")
    public String objectView(Date date){
        System.out.println(date);
        return "success";
    }
}
