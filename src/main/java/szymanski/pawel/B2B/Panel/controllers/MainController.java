package szymanski.pawel.B2B.Panel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


    @RequestMapping(name = "/")
    public String loadMainWeb(){
        return "index";
    }


}
