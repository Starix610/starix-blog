package com.starix.blog.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.starix.blog.common.PageResult;
import com.starix.blog.entity.Type;
import com.starix.blog.mapper.TypeMapper;
import com.starix.blog.service.TypeService;
import com.starix.blog.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Starix
 * @date 2020-05-18 14:52
 */
@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public void saveType(Type type) {
        int result = typeMapper.insert(type);
        System.out.println(result);
    }

    @Override
    public Type getType(Integer id) {
        return typeMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult<Type> listType(Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        //这里返回的实际是pagehelper封装的Page类型的对象
        List<Type> typeList =  typeMapper.selectList();
        PageResult<Type> pageResult = PageUtils.convertToPageResult(typeList);
        return pageResult;
    }

    @Override
    public Type updateType(Integer id, String name) {
        return null;
    }

    @Override
    public void deleteType(Integer id) {

    }
}
