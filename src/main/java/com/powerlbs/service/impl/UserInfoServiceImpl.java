package com.powerlbs.service.impl;

import com.powerlbs.domain.Address;
import com.powerlbs.service.UserInfoService;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:${name}
 * package:com.powerlbs
 *
 * @date:2019/9/28 16:57
 * @author:Yaoxiaoming
 **/
public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public List<Address> queryAddress(Integer userId) {
        List<Address> adds = new ArrayList<>();
        if(userId == 1){
            Address address = new Address();
            address.setName("张三");
            address.setCity("北京");
            address.setStreet("长安街10号");
            address.setUse(true);
            adds.add(address);
        }else if(userId == 2){
            Address address = new Address();
            address.setName("照明");
            address.setCity("北京");
            address.setStreet("西城区甘家口大厦");
            address.setUse(true);
            adds.add(address);
        }
        return adds;
    }
}
