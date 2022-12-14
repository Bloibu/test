package com.hitech.bookshare.controller;

import com.hitech.bookshare.service.IUserService;
import com.hitech.bookshare.vo.RegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;


    @RequestMapping(value="/userReg", method = RequestMethod.POST)
    public String userReg(@RequestBody RegisterForm registerForm) {
        try {
            userService.userReg(registerForm);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "success";
    }
}
