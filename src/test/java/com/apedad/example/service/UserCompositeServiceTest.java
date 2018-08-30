package com.apedad.example.service;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.apedad.example.entity.User;
import com.apedad.example.entity.UserInfo;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserCompositeServiceTest {
    @Autowired
    private UserCompositeService userCompositeService;
	@Test
	public void testSave() {
        User user = new User();
        user.setUsername("test11");
        user.setPassword("test11");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());

        UserInfo userInfo = new UserInfo();
        userInfo.setName("test11");
        userInfo.setEmail("test11@test.com");
        userCompositeService.save(user, userInfo);
	}

}
