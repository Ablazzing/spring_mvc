package com.molodyko.mvc;


import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("controller")
public class MyController {

    @RequestMapping("/mol")
    public String showPage(){
        return "first_view";
    }

    @RequestMapping("askDetail")
    public String askDetail(Model model){

        model.addAttribute("employee",new Employee());
        return "ask-detail";
    }

    @RequestMapping("showDetail")
    public String showDetail(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            return "ask-detail";
        }else {
            return "show-detail";
        }


    }


}
