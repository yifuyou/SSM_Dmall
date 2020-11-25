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
@RequestMapping("use")
public class PageController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("title")
    public String getTitle(){
        return "title";
    }
    @RequestMapping("left")
    public String getLeft(){
        return "left";
    }

    @RequestMapping("headPage")
    public String getHeadPage(){
        return "headPage";
    }
    @RequestMapping("login")
    public String pr(){
        return "login";
    }
    @RequestMapping("add")
    public String getAddPage(){
        return "add";
    }


}
