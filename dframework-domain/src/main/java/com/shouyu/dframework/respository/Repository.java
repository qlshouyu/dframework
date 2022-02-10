package com.shouyu.dframework.respository;

import com.shouyu.dframework.entity.Entity;
import com.shouyu.dframework.respository.criteria.Example;
import com.shouyu.dframework.respository.criteria.PageExample;

import java.util.List;

/**
 * @author 高露
 * @time 2021-09-25
 * 仓库接口，被所有仓库实现
 */
public interface Repository<ID, T extends Entity> {

    /**
     * 通过id
     * @param id
     * @return
     */
    T selectById(ID id);

    /**
     * 根据查询条件查询一个对象
     * @param example
     * @return
     */
    T selectOneExample(Example example);


    /**
     * 新增
     *
     * @param entity
     * @return
     */
    T add(T entity);

    /**
     * 修改
     *
     * @param entity
     * @return
     */
    T update(T entity);

    /**
     * 通过ID删除
     *
     * @param id
     * @return
     */
    boolean deleteById(ID id);

    List<T> selectByExample(Example example);

    Page<T> pageByExample(PageExample example);

    /**
     * 满足 example的数据数量
     * @param example
     * @return
     */
    long countByExample(Example example);



}
