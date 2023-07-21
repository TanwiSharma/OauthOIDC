package com.example.LoginComponent.LoginController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*pain login controller*/
@Controller("/plainLogin")
public class PlainLogin {
    @RequestMapping("/login.do")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }
}
