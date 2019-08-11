package com.dtouding.orderserviceconsumer.service.controller;

import com.dtouding.commoninterface.bean.UserAddress;
import com.dtouding.commoninterface.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String uid) {
        return orderService.initOrder(uid);
    }
}
