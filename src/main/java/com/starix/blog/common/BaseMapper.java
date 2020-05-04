package com.starix.blog.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用Mapper
 * @author Starix
 * @date 2020-05-03 18:11
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
