package com.starix.blog.util;

import com.github.pagehelper.PageInfo;
import com.starix.blog.common.PageResult;

import java.util.List;

/**
 * @author Starix
 * @date 2020-05-18 15:34
 */
public class PageUtils {

    public static <T> PageResult<T> convertToPageResult(List<T> items){
        //pagehelper插件的PageInfo分页信息
        PageInfo<T> pageInfo = new PageInfo<>(items);
        PageResult<T> pageResult = new PageResult<>();
        pageResult.setCurrentPage(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setHasMore(pageInfo.isHasNextPage());
        pageResult.setTotalNum((int) pageInfo.getTotal());
        pageResult.setTotalPage(pageInfo.getPages());
        pageResult.setItems(pageInfo.getList());
        return pageResult;
    }

}
