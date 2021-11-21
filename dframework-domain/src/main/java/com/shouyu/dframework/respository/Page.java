package com.shouyu.dframework.respository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.List;

/**
 * 分页对象
 *
 * @param <T>
 */
public abstract class Page<T> implements Serializable {

    private final static Logger LOGGER = LoggerFactory.getLogger(Page.class);

    public Page(List<T> datas) {
        this.list = datas;
    }

    private List<T> list;
    private long total;
    private int pageNum;
    private int pageSize;
    private int pages;
    private boolean isFirstPage;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isFirstPage() {
        return isFirstPage;
    }

    public void setFirstPage(boolean firstPage) {
        isFirstPage = firstPage;
    }

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        String strJson = null;
        try {
            strJson = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            LOGGER.error("Failed to parse object to json", e);
        }
        return strJson;
    }
}
