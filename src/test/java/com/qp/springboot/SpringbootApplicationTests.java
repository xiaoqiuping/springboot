package com.qp.springboot;

import com.qp.springboot.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.management.relation.Role;
import java.util.Date;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

/*    @Autowired
    private UserDao userDao;

    @Test
    public void testInsert() {

        User user = new User();
        user.setName( "Liubity" );
        user.setAge( 27 );
        user.setBirthday( new Date(  ) );
        User result = this.userDao.save(user);
        System.out.println(result);
    }

    @Test
    public void testFindOne() {
        User user = this.userDao.findById( 2l ).get();

        System.out.println(user.getName());
    }

    @Test
    public void delete() {

        this.userDao.deleteById( 1l );
    }*/
}
