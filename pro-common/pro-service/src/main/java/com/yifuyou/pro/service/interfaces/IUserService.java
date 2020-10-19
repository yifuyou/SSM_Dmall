package com.yifuyou.pro.service.interfaces;


import com.yifuyou.pro.response.ServiceResponse;

import java.util.List;
import java.util.Map;

public interface IUserService {
    ServiceResponse<Map<String, Object>> login(String username, String password);

    ServiceResponse<List<Map<String, Object>>> getUsersWithQuery(String query, int pagenum, int pagesize);

}
