package com.yifuyou.mapper;


import com.yifuyou.mapper.base.BaseMapper;
import com.yifuyou.model.Detuser;
import com.yifuyou.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {

     User findById(Integer id);

     int deleteById(Integer id);

     int update(User t);

     int insert(User t);


     int checkUsername(String username);

     Detuser selectLogin(@Param("username") String username, @Param("password") String password);
}
