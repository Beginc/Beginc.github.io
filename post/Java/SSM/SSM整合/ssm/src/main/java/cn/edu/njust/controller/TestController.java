package cn.edu.njust.controller;

import cn.edu.njust.pojo.TestAccount;
import cn.edu.njust.service.TestService;
import cn.edu.njust.service.impl.TestServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @Resource(name = "testService")
    private TestService testService;

    public void setTestService(TestServiceImpl testService) {
        this.testService = testService;
    }

    @RequestMapping("/findall")
    public String testFindAll(){
        System.out.println(123);
        List<TestAccount> accounts = testService.findAll();
        for (TestAccount account : accounts) {
            System.out.println(account);
        }

        return "/index.jsp";
    }
}
