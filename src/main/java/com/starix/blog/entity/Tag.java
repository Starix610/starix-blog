package com.starix.blog.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tb_tag")
@Data
@NoArgsConstructor
public class Tag {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
}