package com.karthigaspring.controller;

import com.karthigaspring.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;

@Controller
public class RegisterController {
    private UserDao userDao;

    public RegisterController() throws SQLException, ClassNotFoundException {
        userDao = new UserDao();
    }

    @RequestMapping("/register")
    public String register(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("cpassword") String cpassword,
            @RequestParam("gender") String gender
    ) {
        if (cpassword.equals(password)) {
            Boolean regi = userDao.register(username, password, gender);
        }
        return "index";
    }
}
