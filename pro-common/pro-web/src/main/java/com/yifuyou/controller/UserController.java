package com.yifuyou.controller;



import com.yifuyou.model.Detuser;
import com.yifuyou.pro.response.Const;
import com.yifuyou.pro.response.ServiceResponse;
import com.yifuyou.pro.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "login",method = RequestMethod.GET)
    @ResponseBody
    public ServiceResponse<Detuser> login(String username, String password, HttpSession session){
        ServiceResponse<Detuser> response=iUserService.login(username,password);
        if(response.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,response.getData());

            System.out.println(response);
        }
        System.out.println("login+++++++++++++++++++++");
        return response;
    }



  /*  @RequestMapping("*")
    @ResponseBody
    public Detuser test(){
        System.out.println("=========test==============");
       // return "6666";
        return new Detuser("a","12580","email@!");
    }*/

}
