package com.shouyu.dframework.entity;

/**
 * @author 高露
 * @time 2021-09-25
 * 领域实体
 */
public abstract class DomainEntity<ID> extends Entity {

    public DomainEntity() {
        this.createTime = System.currentTimeMillis();
    }

    /**
     * 领域实体ID
     */
    private ID id;

    /**
     * 实体创建时间,毫秒
     */
    private Long createTime;


    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
