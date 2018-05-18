package com.qp.springboot.control;

import com.qp.springboot.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author Liubity
 * @Date 2018/5/17
 */

@RestController
@RequestMapping("/hello")
public class UserControl {

    @ResponseBody
    @RequestMapping()
    public String index(){
        return "Hello SpringBoot";
    }

    @ResponseBody
    @RequestMapping("/test")
    public User test(){
        User user = new User();
        user.setAge( 27 );
        user.setName( "Liubity" );
        user.setBirthday( new Date() );
        return user;
    }
}
