package com.qfedu.dao;

import com.qfedu.entity.User;

import java.util.List;

public interface UserDao {
    public int inserData(User user);
    public int delById(int id);
    public int upDate(User user);
    public List<User> selectAll();
    public User findOne(int id);
}
