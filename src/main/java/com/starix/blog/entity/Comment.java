package com.starix.blog.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_comment")
@Data
@NoArgsConstructor
public class Comment {
    /**
     * id
     */
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 父级评论id
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 博客id
     */
    @Column(name = "blog_id")
    private Integer blogId;

    /**
     * 用户昵称
     */
    @Column(name = "nickname")
    private String nickname;

    /**
     * 邮箱
     */
    @Column(name = "email")
    private String email;

    /**
     * 评论内容
     */
    @Column(name = "content")
    private String content;

    /**
     * 用户头像
     */
    @Column(name = "avatar")
    private String avatar;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

}