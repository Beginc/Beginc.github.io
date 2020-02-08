package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pojo.People;
import pojo.Phone;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/bind")
@SessionAttributes({"date"})
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

    @RequestMapping(path = "/servlet")
    public void servletView(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("success");
    }

    @RequestMapping(path = "/json")
    public String jsonView(@RequestBody Phone phone){
        System.out.println(phone);
        return "success";
    }

    @RequestMapping(path = "/path/{id}")
    public String pathView(@PathVariable(name = "id", required = true) Integer id){
        System.out.println(id);
        return "success";
    }

    @RequestMapping(path = "/header")
    public String headerView(@RequestHeader(name = "Accept", required = true) String contentType){
        System.out.println(contentType);
        return "success";
    }

    @RequestMapping(path = "/cookie")
    public String cookieView(@CookieValue(name = "JSESSIONID", required = true) String jsessionId){
        System.out.println(jsessionId);
        return "success";
    }

    @RequestMapping(path = "/modelmap")
    public String modelMapView(ModelMap map) throws IOException {
        map.addAttribute("date", new Date());
        return "success";
    }
}
