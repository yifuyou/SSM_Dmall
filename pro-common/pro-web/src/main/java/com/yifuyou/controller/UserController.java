package com.yifuyou.controller;


import com.yifuyou.pro.response.ServiceResponse;
import com.yifuyou.pro.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "users", method = RequestMethod.GET)
    @ResponseBody
    public ServiceResponse<List<Map<String, Object>>> getUsers(String query, Integer pagenum, Integer pagesize) {

        ServiceResponse<List<Map<String, Object>>> response = iUserService.getUsersWithQuery(query, pagenum, pagesize);

        return response;
    }


}
