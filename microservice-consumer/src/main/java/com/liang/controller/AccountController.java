package com.liang.controller;

import com.liang.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: Liangxp
 * @Description:
 * @date: 2019/2/24 16:35
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Value("${restUrlPrefix}")
    private String restUrlPrefix;

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/add")
    public int add(Account account){
        return restTemplate.postForObject(restUrlPrefix+"/account/add", account, Integer.class);
    }

    @RequestMapping("/findById/{id}")
    public Account fingById(@PathVariable("id") Integer id){
        return restTemplate.getForObject(restUrlPrefix+"/account/findById/"+id,Account.class);
    }

    @RequestMapping("/findList")
    public List<Account> fingList(){
        return restTemplate.getForObject(restUrlPrefix+"/account/findList",List.class);
    }

}
