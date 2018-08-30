package com.apedad.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apedad.example.entity.User;
import com.apedad.example.entity.UserInfo;
import com.apedad.example.service.UserCompositeService;
import com.apedad.example.service.UserInfoService;
import com.apedad.example.service.UserService;

@Service
public class UserCompositeServiceImpl implements UserCompositeService{
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserService userService;
	@Override
	@Transactional
	public int save(User u, UserInfo ui) {
        int res1 = userService.insert(u);
        int res = userInfoService.insert(ui);
        return 0;
	}

}
