package practice.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody 
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/lx")
    public ModelAndView getName() {
        ModelAndView view = new ModelAndView();
        view.setViewName("name"); 
        view.addObject("date",LocalDate.now().toString());
        return view;
    }

    @RequestMapping("/time")
    @ResponseBody
    public String getTime() {
        return LocalDate.now().toString();
    }
}
