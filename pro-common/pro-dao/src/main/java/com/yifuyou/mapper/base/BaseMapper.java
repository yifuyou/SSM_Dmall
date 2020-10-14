package com.yifuyou.mapper.base;

public interface BaseMapper<T> {
     T findById(Integer id);
     int  deleteById(Integer id);
     int update(T t);
     int insert(T t);



}
