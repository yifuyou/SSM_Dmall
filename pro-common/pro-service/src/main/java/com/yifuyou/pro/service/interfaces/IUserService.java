package com.yifuyou.pro.service.interfaces;


import com.yifuyou.model.Detuser;
import com.yifuyou.pro.response.ServiceResponse;

public interface IUserService {
    ServiceResponse<Detuser> login(String username, String password);
}
