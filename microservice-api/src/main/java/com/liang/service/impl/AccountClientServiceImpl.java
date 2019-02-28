package com.liang.service.impl;

import com.liang.model.Account;
import com.liang.service.AccountClientService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: Liangxp
 * @Description:
 * @date: 2019/2/27 21:16
 */
@Component
public class AccountClientServiceImpl implements AccountClientService {
    @Override
    public int add(Account account) {
        return 0;
    }

    @Override
    public Account findById(Integer id) {
        return new Account().setId(0).setName("服务可能挂了，现在是降级结果").setMoney(0.0);
    }

    @Override
    public List<Account> findList() {
        return null;
    }
}
