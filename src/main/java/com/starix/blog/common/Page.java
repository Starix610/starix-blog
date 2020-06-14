package com.starix.blog.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Starix
 * @date 2020-05-18 14:23
 */
@Data
@NoArgsConstructor
public class PageBean<T> {

    // 当前页
    private Integer currentPage = 1;
    // 每页显示的总条数
    private Integer pageSize = 10;
    // 总条数
    private Integer totalNum;
    // 是否有下一页
    private boolean hasMore;
    // 总页数
    private Integer totalPage;
    // 分页结果
    private List<T> items;

}
