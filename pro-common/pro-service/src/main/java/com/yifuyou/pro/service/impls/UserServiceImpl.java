package com.yifuyou.pro.service.impls;


import com.yifuyou.mapper.UserMapper;
import com.yifuyou.model.Detuser;
import com.yifuyou.model.User;
import com.yifuyou.pro.response.ServiceResponse;
import com.yifuyou.pro.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("iUserService")

public class UserServiceImpl implements IUserService {
    @Autowired
    protected UserMapper userMapper;

    @Override
    public ServiceResponse<Detuser> login(String username, String password) {
        int resultCount= userMapper.checkUsername(username);
        if(resultCount==0){
            return ServiceResponse.createByErrorMessage("用户名不存在");
        }
        //todo 密码登陆

        Detuser users=userMapper.selectLogin(username,password);

        if(users==null){
            return ServiceResponse.createByErrorMessage("密码错误");
        }
        users.setPassWord(org.apache.commons.lang3.StringUtils.EMPTY);
        return ServiceResponse.createBySuccess("登陆成功",users);
    }


    public User findById(Integer id) {
        return userMapper.findById(id);
    }


    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }


    public void update(User o) {
        userMapper.update(o);
    }

    public void insert(User o) {
        userMapper.insert(o);
    }

}
