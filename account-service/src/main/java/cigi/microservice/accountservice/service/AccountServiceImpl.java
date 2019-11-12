package cigi.microservice.accountservice.service;

import cigi.microservice.accountservice.client.AuthServiceFeignClient;
import cigi.microservice.accountservice.dto.UserDto;
import cigi.microservice.accountservice.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AuthServiceFeignClient authServiceFeignClient;

    public AccountServiceImpl(AuthServiceFeignClient authServiceFeignClient) {
        this.authServiceFeignClient = authServiceFeignClient;
    }

    @Override
    public UserDto create(UserRegistrationDto user) {
        return authServiceFeignClient.createUser(user);
    }
}
