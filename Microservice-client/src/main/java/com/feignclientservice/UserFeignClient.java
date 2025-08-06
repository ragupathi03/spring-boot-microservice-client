package com.feignclientservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.entity.User;
import com.responseentity.ApiResponse;

@FeignClient(name = "user-service", url = "http://localhost:8081/MICROSERVICE")
public interface UserFeignClient {

	 @GetMapping("/api/getAllUsers")
	 ApiResponse<List<User>> getAllUsers();
}
