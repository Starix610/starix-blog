package com.starix.blog.mapper;

import com.starix.blog.common.BaseMapper;
import com.starix.blog.entity.Type;

import java.util.List;

public interface TypeMapper extends BaseMapper<Type> {
    List<Type> selectList();
}