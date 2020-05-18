package com.starix.blog.service;

import com.starix.blog.common.PageResult;
import com.starix.blog.entity.Type;

/**
 * @author Starix
 * @date 2020-05-17 20:55
 */
public interface TypeService {

    void saveType(Type type);

    Type getType(Integer id);

    PageResult<Type> listType(Integer currentPage, Integer pageSize);

    Type updateType(Integer id, String name);

    void deleteType(Integer id);

}
