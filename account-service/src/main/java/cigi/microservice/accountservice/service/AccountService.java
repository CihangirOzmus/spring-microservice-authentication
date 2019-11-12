package cigi.microservice.accountservice.service;

import cigi.microservice.accountservice.dto.UserDto;
import cigi.microservice.accountservice.dto.UserRegistrationDto;

public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);
}