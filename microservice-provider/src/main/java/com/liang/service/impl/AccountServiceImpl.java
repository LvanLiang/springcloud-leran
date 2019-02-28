package com.liang.service.impl;

import com.liang.mapper.AccoutMapper;
import com.liang.model.Account;
import com.liang.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Liangxp
 * @Description:
 * @date: 2019/2/24 16:13
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccoutMapper accoutMapper;

    public int delete(Integer id) {
        return accoutMapper.delete(id);
    }

    public int add(Account account) {
        return accoutMapper.add(account);
    }

    public Account findById(Integer id) {
        return accoutMapper.findById(id);
    }

    public List<Account> findList() {
        return accoutMapper.findList();
    }
}
