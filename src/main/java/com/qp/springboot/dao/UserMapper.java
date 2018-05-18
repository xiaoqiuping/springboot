package com.qp.springboot.dao;

import com.qp.springboot.model.User;
import org.springframework.stereotype.Repository;

/**
 * @Author Liubity
 * @Date 2018/5/18
 */
public interface  UserMapper {

    public void insert(User user);

    public User getById(Long id);

    public void update(User user);

    public void deleteById(Long id);
}
