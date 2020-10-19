package com.yifuyou.mapper;


import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {


     //检查该用户名是否已注册
     int checkUsername(String username);

     Map<String, Object> selectLogin(@Param("username") String username, @Param("password") String password);

     List<Map<String, Object>> selectUsers(Map map);

}
