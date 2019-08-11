package com.dtouding.orderserviceconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dtouding.commoninterface.bean.UserAddress;
import com.dtouding.commoninterface.service.OrderService;
import com.dtouding.commoninterface.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;

    public List<UserAddress> initOrder(String userId) {
        System.out.println("initOrder");
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress: addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;
    }
}
