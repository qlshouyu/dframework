package com.shouyu.dframework.dframework.demo.infrastructure.controller;

import com.shouyu.dframework.dframework.demo.infrastructure.repository.account.AccountExample;
import com.shouyu.dframework.dframework.demo.domain.entity.UcAccount;
import com.shouyu.dframework.dframework.demo.domain.repository.AccountRepository;
import com.shouyu.dframework.dframework.demo.interfaces.AccountInterface;
import com.shouyu.dframework.respository.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/accout")
public class AccuntController implements AccountInterface {
    @Autowired
    private AccountRepository ucAccountRepository;

    @GetMapping
    @Override
    public Page<UcAccount> list(Integer pageIndex, Integer pageSize) {
        AccountExample ucAccountExample = new AccountExample();
        ucAccountExample.setPageNum(pageIndex);
        ucAccountExample.setPageSize(pageSize);
        AccountExample.UcAccountCriteria criteria = ucAccountExample.createCriteria(AccountExample.UcAccountCriteria.class);
        criteria.andIdIsNotNull();
        Page<UcAccount> account = this.ucAccountRepository.pageByExample(ucAccountExample);
//        Optional<UcAccount> account= ucAccountMapper.selectByPrimaryKey("16ab7cf2906d454f8697e8be30d33477");
        return account;//Mono.justOrEmpty(account);
    }
}
