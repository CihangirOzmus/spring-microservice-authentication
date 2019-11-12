package cigi.microservice.authservice.service;

import cigi.microservice.authservice.domain.User;

public interface UserService {
    User create(User user);
}
