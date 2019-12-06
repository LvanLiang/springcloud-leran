package com.liang.mapper;

import com.liang.model.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Liangxp
 * @Description:
 * @date: 2019/2/24 15:55
 */
@Mapper
public interface AccoutMapper {
    int delete(Integer id);

    int add(Account account);

    Account findById(Integer id);

    List<Account> findList();

    List<Account> listUser(String unitId);
}
