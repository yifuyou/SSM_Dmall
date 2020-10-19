package com.yifuyou.pro.service.impls;


import com.yifuyou.mapper.UserMapper;
import com.yifuyou.pro.response.ServiceResponse;
import com.yifuyou.pro.service.interfaces.IUserService;
import com.yifuyou.pro.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service("iUserService")

public class UserServiceImpl implements IUserService {
    @Autowired
    protected UserMapper userMapper;

    @Override
    public ServiceResponse<Map<String, Object>> login(String username, String password) {
        int resultCount= userMapper.checkUsername(username);
        if(resultCount==0){
            return ServiceResponse.createByErrorMessage("用户名不存在");
        }
        //todo 密码登陆

        Map<String, Object> users = userMapper.selectLogin(username, password);

        if(users==null){
            return ServiceResponse.createByErrorMessage("密码错误");
        }
        users.put("token", TokenUtil.getToken());
        return ServiceResponse.createBySuccess("登陆成功",users);
    }


    public ServiceResponse<List<Map<String, Object>>> getUsersWithQuery(String query, int pagenum, int pagesize) {
        Integer index;
        if (pagenum <= 1) index = 0;
        else index = (pagenum - 1) * pagesize;
        Map<String, Object> map = new HashMap<>();
        map.put("query", query);
        map.put("indexnum", index);
        map.put("pagesize", pagesize);
        List<Map<String, Object>> list = userMapper.selectUsers(map);
        if (list.size() <= 0) return ServiceResponse.createBySuccessMassage("查无数据");
        return ServiceResponse.createBySuccess("查询成功", list);
    }


}
