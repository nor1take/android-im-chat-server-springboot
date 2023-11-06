package com.android.service;


import com.android.pojo.User;
import com.android.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testSelectByName() {
        User dd = userService.selectByName("dd");
        System.out.println(dd);
    }
}
