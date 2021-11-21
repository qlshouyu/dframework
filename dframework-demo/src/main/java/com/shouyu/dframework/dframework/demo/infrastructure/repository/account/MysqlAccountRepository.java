package com.shouyu.dframework.dframework.demo.infrastructure.repository.account;

import com.shouyu.dframework.dframework.demo.domain.entity.UcAccount;
import com.shouyu.dframework.dframework.demo.domain.repository.AccountRepository;
import com.shouyu.dframework.infrastructure.repository.mysql.AbstractMysqlRepository;
import org.springframework.stereotype.Component;

/**
 * mysql版本账户仓库
 */
@Component
public class MysqlAccountRepository extends AbstractMysqlRepository<UcAccount, AccountMapper> implements AccountRepository {

    public MysqlAccountRepository(AccountMapper mapper) {
        super(mapper);
    }
}
