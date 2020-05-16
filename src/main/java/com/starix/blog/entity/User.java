package com.starix.blog.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user")
@Data
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "avatar")
    private String avatar;

    /**
     * 用户类型
     */
    @Column(name = "type")
    private String type;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}