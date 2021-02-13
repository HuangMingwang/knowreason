package top.wl9939.knowreason.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public @ResponseBody
    String index() {

        return "heee";
    }
}
