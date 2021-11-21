package com.shouyu.dframework.dframework.demo.interfaces;

import com.shouyu.dframework.dframework.demo.domain.entity.UcAccount;
import com.shouyu.dframework.respository.Page;

/**
 * 账户接口
 */
public interface AccountInterface {

    Page<UcAccount> list(Integer pageIndex, Integer pageSize);

}
