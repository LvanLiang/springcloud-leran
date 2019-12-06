package com.liang.controller;

import com.liang.model.Account;
import com.liang.service.AccountService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Liangxp
 * @Description:
 * @date: 2019/2/24 16:15
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/findById/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get") //测试服务熔断
    public Account findById(@PathVariable("id")  Integer id){
        Account account = accountService.findById(id);
        if (account == null){
            throw new RuntimeException();
        }
        return account;
    }

    @GetMapping("/findList")
    public List<Account> findList(){
        return accountService.findList();
    }

    @GetMapping("/listUser/{unitId}")
    public List<Account> listUser(@PathVariable("unitId") String unitId){
        return accountService.listUser(unitId);
    }

    @PostMapping("/add")
    public int add(@RequestBody  Account account){
        return accountService.add(account);
    }

    @DeleteMapping("/delete/{id}")
    public int delete(@PathVariable("id") Integer id){
        return accountService.delete(id);
    }


    //服务熔断
    //熔断机制是应对雪崩效应的一种微服务链路保护机制。
    //当扇出链路的某个微服务不可用或者响应时间太长时，会进行服务的降级，进而熔断该节点微服务的调用，快速返回"错误"的响应信息。
    //当检测到该节点微服务调用响应正常后恢复调用链路。在SpringCloud框架里熔断机制通过Hystrix实现。
    //Hystrix会监控微服务间调用的状况，当失败的调用到一定阈值，缺省是5秒内20次调用失败就会启动熔断机制。熔断机制的注解是@HystrixCommand。
    public Account processHystrix_Get(@PathVariable("id") Integer id){
      return new Account().setId(id).setName("不存在著").setMoney(0.0);
    }

}
