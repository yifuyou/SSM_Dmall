package com.yifuyou.controller;

import com.yifuyou.pro.response.ServiceResponse;
import com.yifuyou.pro.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;


@Controller
@RequestMapping("ulogin")
public class LoginController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public ServiceResponse<Map<String, Object>> login(@RequestBody Map<String, String> jsonObject

            , HttpSession session) {

        String username = jsonObject.get("username");
        String password = jsonObject.get("password");

        ServiceResponse<Map<String, Object>> response = iUserService.login(username, password);
        if (response.isSuccess()) {
            session.setAttribute(username, response.getData().get("token"));
        }
        System.out.println("login+++++++++++++++++++++" + session.getAttribute(username));
        return response;
    }


}
