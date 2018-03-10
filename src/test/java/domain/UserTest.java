package domain;

import config.RootConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class UserTest {
    @Autowired
    private UserService userService;
    @Test
    public void test(){
        User user=new User();
        user.setUsername("tom");
        user.setPassword("123456");
        userService.signIn(user);
        System.out.println(user);
    }


}