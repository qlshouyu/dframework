package com.shouyu.dframework.infrastructure.repository.mysql;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shouyu.dframework.entity.Entity;
import com.shouyu.dframework.respository.Page;
import com.shouyu.dframework.respository.Repository;
import com.shouyu.dframework.respository.criteria.Example;
import com.shouyu.dframework.respository.criteria.PageExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public abstract class AbstractMysqlRepository<T extends Entity, M extends MybatisMapper<String, T>> implements Repository<String, T> {
    private final static Logger LOGGER = LoggerFactory.getLogger(AbstractMysqlRepository.class);
    private M mapper;

    public AbstractMysqlRepository(M mapper) {
        this.mapper = mapper;
    }


    @Override
    public T selectById(String s) {
        T entity = this.mapper.selectByPrimaryKey(s);
        return entity;
    }

    @Override
    public T selectOneExample(Example example) {
        List<T> entities = this.mapper.selectByExample(example);
        if (entities == null || entities.size() < 1) {
            return null;
        }
        return entities.get(0);
    }

    @Override
    public T add(T entity) {
        int count = this.mapper.insert(entity);
        LOGGER.info("insert entity count:{}", count);
        return entity;
    }

    @Override
    public T update(T entity) {
        int count = this.mapper.updateByPrimaryKey(entity);
        LOGGER.info("update entity count:{}", count);
        return entity;
    }

    @Override
    public boolean deleteById(String s) {
        int count = this.mapper.deleteByPrimaryKey(s);
        LOGGER.info("delete by id :{}  count:{}", s, count);
        return count > 0 ? true : false;
    }

    @Override
    public List<T> selectByExample(Example example) {
        return this.mapper.selectByExample(example);
    }

    @Override
    public Page<T> pageByExample(PageExample example) {
        PageHelper.startPage(example.getPageNum(), example.getPageSize());
        List<T> list = this.mapper.selectByExample(example);
        return new MySqlPage(new PageInfo<>(list));
    }


}
