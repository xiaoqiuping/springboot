package com.qp.springboot;

import com.qp.springboot.dao.UserMapper;
import com.qp.springboot.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @Author Liubity
 * @Date 2018/5/18
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatiesTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert(){
        User user = new User();
        user.setName( "Liubity" );
        user.setAge( 28 );
        user.setBirthday( new Date(  ) );
        userMapper.insert( user );
    }

}
