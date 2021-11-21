package com.shouyu.dframework.infrastructure.repository.mysql;

import com.github.pagehelper.PageInfo;
import com.shouyu.dframework.respository.Page;

public class MySqlPage extends Page {

    public MySqlPage(PageInfo pageInfo) {
        super(pageInfo.getList());
        this.setFirstPage(pageInfo.isIsFirstPage());
        this.setPageNum(pageInfo.getPageNum());
        this.setPages(pageInfo.getPages());
        this.setPageSize(pageInfo.getPageSize());
        this.setTotal(pageInfo.getTotal());
    }
}
