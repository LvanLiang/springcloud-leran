package com.liang.service.impl;

import com.liang.model.Account;
import com.liang.service.AccountClientService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: Liangxp
 * @Description:
 * Hystrix服务降级，其实就是线程池中单个线程障处理，防止单个线程请求时间太长，导致资源长期被占有而得不到释放，从而导致线程池被快速占用完，导致服务崩溃。
 * Hystrix能解决如下问题：
 *      1.请求超时降级，线程资源不足降级，降级之后可以返回自定义数据
 *      2.线程池隔离降级，分布式服务可以针对不同的服务使用不同的线程池，从而互不影响
 *      3.自动触发降级与恢复
 *      4.实现请求缓存和请求合并
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

    @Override
    public List<Account> listUser(String unitId) {
        return null;
    }
}
