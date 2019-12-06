package com.liang.service;

import com.liang.model.Account;

import java.util.List;

/**
 * @author: Liangxp
 * @Description:
 * @date: 2019/2/24 16:02
 */
public interface AccountService {
    int delete(Integer id);

    int add(Account account);

    Account findById(Integer id);

    List<Account> findList();

    List<Account> listUser(String unitId);
}
