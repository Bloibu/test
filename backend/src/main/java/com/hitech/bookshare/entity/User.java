package com.hitech.bookshare.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.Builder;

/**
 * 注释
 *
 * @author daishui
 * @date 2022-12-13 09:57
 */
@Data
@Builder
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String password;

    private Integer sex;

    private String mobile;

    private String address;

    private Date regdate;

    private Date lastlogindate;
}
