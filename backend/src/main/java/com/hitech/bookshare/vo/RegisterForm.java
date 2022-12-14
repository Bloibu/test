package com.hitech.bookshare.vo;

import lombok.Data;

@Data
public class RegisterForm implements java.io.Serializable {
    private String username;
    private String password;
    private Integer sex;
    private String mobile;
    private String address;


}
