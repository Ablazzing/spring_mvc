package com.molodyko.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/mol")
    public String showPage(){
        return "first_view";
    }
}
