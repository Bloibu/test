package com.hitech.bookshare.service;


import com.hitech.bookshare.vo.RegisterForm;

/**
 *  服务类接口
 *
 * @author daishui
 * @date 2022-12-13 09:57
 */
public interface IUserService {

    Boolean userReg(RegisterForm registerForm);
}
