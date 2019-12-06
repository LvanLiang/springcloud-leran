package com.liang.service;

import com.liang.model.Account;
import com.liang.service.impl.AccountClientServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author: Liangxp
 * @Description: 服务降级处理是在客户端实现完成的，与服务端没有关系
 * @date: 2019/2/26 22:58
 */
@FeignClient(value = "MICROSERVICE-PROVIDER",fallback=AccountClientServiceImpl.class)
public interface AccountClientService {
    @PostMapping("/account/add")
    int add(Account account);

    @GetMapping("/account/findById/{id}")
    Account findById(@PathVariable("id") Integer id);

    @GetMapping("/account/findList")
    List<Account> findList();

    @GetMapping("/account/listUser/{unitId}")
    List<Account> listUser(@PathVariable("unitId") String unitId);
}
