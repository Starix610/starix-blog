package com.starix.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tb_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Type {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

}