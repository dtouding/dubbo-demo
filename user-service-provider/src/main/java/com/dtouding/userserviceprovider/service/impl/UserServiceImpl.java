package com.dtouding.userserviceprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dtouding.commoninterface.bean.UserAddress;
import com.dtouding.commoninterface.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {


    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1",
                "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1",
                "王老师", "010-56253825", "N");
        return Arrays.asList(address1,address2);
    }
}
