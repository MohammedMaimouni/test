package com.gestmaint.api.services;

import com.gestmaint.api.dtos.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    UserDto saveUser(UserDto userDto);

    void deleteUser(String username);

    List<UserDto> getAllMaintenanceManagers();
}
