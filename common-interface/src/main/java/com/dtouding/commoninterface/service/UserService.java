package com.dtouding.commoninterface.service;

import com.dtouding.commoninterface.bean.UserAddress;
import java.util.List;

/**
 * 用户服务
 * @author lfy
 *
 */
public interface UserService {
	
	/**
	 * 按照用户id返回所有的收货地址
	 * @param userId
	 * @return
	 */
	List<UserAddress> getUserAddressList(String userId);

}
