package com.shouyu.dframework.respository.criteria;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PageExample<T extends AbstractCriteria> extends Example<T> {

    private final static Logger LOGGER = LoggerFactory.getLogger(PageExample.class);
    private Integer pageNum;
    private Integer pageSize;

    public Integer getPageNum() {
        if (pageNum == null) {
            return 1;
        }
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        if (pageSize == null) {
            return 10;
        }
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
