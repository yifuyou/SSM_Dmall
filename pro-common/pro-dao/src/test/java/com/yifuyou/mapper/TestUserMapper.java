package com.yifuyou.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:mapperContext.xml")
public class TestUserMapper {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectLogin() {
        String username = "admin";
        String password = "123456";
        Map<String, Object> users = userMapper.selectLogin(username, password);

        System.out.println(users);

    }


    @Test
    public void testSelectUsers() {

        Map<String, Object> map = new HashMap<>();
        map.put("query", "d");
        map.put("indexnum", 0);
        map.put("pagesize", 10);
        List<Map<String, Object>> users = userMapper.selectUsers(map);
        users.forEach(System.out::println);
    }

}
