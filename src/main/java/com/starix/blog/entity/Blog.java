package com.starix.blog.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_blog")
@Data
@NoArgsConstructor
public class Blog {
    /**
     * id
     */
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 首图
     */
    @Column(name = "first_picture")
    private String firstPicture;

    /**
     * 原创/转载
     */
    @Column(name = "flag")
    private String flag;

    /**
     * 浏览次数
     */
    @Column(name = "view_count")
    private Integer viewCount;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 博客类型id
     */
    @Column(name = "type_id")
    private Integer typeId;

    /**
     * 是否开启赞赏
     */
    @Column(name = "appreciation")
    private Byte appreciation;

    /**
     * 是否开启转载声明
     */
    @Column(name = "shareStatement")
    private Byte sharestatement;

    /**
     * 是否开启评论
     */
    @Column(name = "comment_enable")
    private Byte commentEnable;

    /**
     * 是否发布
     */
    @Column(name = "published")
    private Byte published;

    /**
     * 是否推荐
     */
    @Column(name = "recommented")
    private Byte recommented;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 内容
     */
    @Column(name = "content")
    private String content;

}