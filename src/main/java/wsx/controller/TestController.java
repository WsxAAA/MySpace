package wsx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA
 *
 * @author xxxxx
 * @Date: 2023/02/17/10:24
 * @Description:
 */
@Controller
@RequestMapping(value = "test")
public class TestController {
    @RequestMapping(value = "/")
    public String index(Model m){
        m.addAttribute("testScope","Model");
        return "index";
    }
}
