package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Controller
@RequestMapping("/response")
public class ResponseController {

    @RequestMapping("defaultString")
    public String defaultStringResponse(){
        System.out.println("defaultStringResponse");
        return "success";
    }

    @RequestMapping("forwardString")
    public String forwardStringResponse(){
        System.out.println("forwardStringResponse");
        return "forward:/success.jsp";
    }
    @RequestMapping("redirectString")
    public String redirectStringResponse(){
        System.out.println("redirectStringResponse");
        return "redirect:/success.jsp";
    }

    @RequestMapping("modelAndView")
    public ModelAndView modelAndViewResponse(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("now", new Date());
        mv.setViewName("success");

        return mv;
    }

    @RequestMapping("void")
    public void voidResponse(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("success");
    }
}
