package com.molodyko.mvc;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("controller")
public class MyController {

    @RequestMapping("/mol")
    public String showPage(){
        return "first_view";
    }

    @RequestMapping("askDetail")
    public String askDetail(){
        return "ask-detail";
    }

    @RequestMapping("showDetail")
    public String showDetail(@RequestParam("employee") String emp, Model model){

        emp = "Mr." + emp;
        model.addAttribute("nameAttribute",emp);
        model.addAttribute("description"," - cool");



        return "show-detail";
    }


}
