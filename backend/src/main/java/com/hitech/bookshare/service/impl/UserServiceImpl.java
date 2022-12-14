package com.hitech.bookshare.service.impl;

import com.hitech.bookshare.entity.User;
import com.hitech.bookshare.mapper.UserMapper;
import com.hitech.bookshare.service.IUserService;
import com.hitech.bookshare.vo.RegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.List;

/**
 * 服务实现类
 *
 * @author daishui
 * @date 2022-12-13 09:57
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean userReg(RegisterForm registerForm) {
        String username = registerForm.getUsername();
        List<User> exist = userMapper.selectByUsername(username);
        if (exist != null && exist.size()>0)  throw new RuntimeException("用户名已存在");
        User user = User.builder().username(registerForm.getUsername())
                .password(DigestUtils.md5DigestAsHex(registerForm.getPassword().getBytes()))
                .sex(registerForm.getSex())
                .mobile(registerForm.getMobile())
                .address(registerForm.getAddress())
                .regdate(new Date()).build();
        int id = userMapper.insert(user);
        return id > 0;
    }
}
