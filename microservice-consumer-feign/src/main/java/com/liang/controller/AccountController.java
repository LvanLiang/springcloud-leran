package com.liang.controller;

import com.liang.model.Account;
import com.liang.service.AccountClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Liangxp
 * @Description:
 * @date: 2019/2/26 23:05
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountClientService accountClientService;

    @RequestMapping("/add")
    public int add(Account account){
        return accountClientService.add(account);
    }

    @GetMapping("/findById/{id}")
    public Account findById(@PathVariable("id") Integer id){
        return accountClientService.findById(id);
    }

    @GetMapping("/findList")
    public List<Account> findList(){
        return accountClientService.findList();
    }

    @GetMapping("/listUser/{unitId}")
    public List<Account> listUser(@PathVariable("unitId") String unitId){
        return accountClientService.listUser(unitId);
    }
}
