package com.karthigaspring.controller;

import com.karthigaspring.dao.UserDao;
import com.karthigaspring.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;

@Controller
public class AuthController {
    private UserDao userDao;
    public AuthController() throws SQLException, ClassNotFoundException {
        userDao=new UserDao();
    }

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        User valid = userDao.loginUser(username,password);
        if(valid!=null){
            model.addAttribute("gender", valid.getGender());
            model.addAttribute("username", valid.getUsername());
            model.addAttribute("password", valid.getPassword());

            return "home";
        }
        else {
            return "index";
        }
    }
    @RequestMapping("/signup")
    public String signup(){
        return "register";
    }


}
