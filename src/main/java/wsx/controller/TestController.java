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
        System.out.println("git version");
        System.out.println("second commit");
        System.out.println("hot-fix branch");
        System.out.println("冲突合并---master");
        System.out.println("冲突合并");
        return "index";
    }
}
