package edu.miu.cs545.restApi.service;

import edu.miu.cs545.restApi.domain.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDto> getAll();
    UserDto getUser(Long id);


    UserDto save(UserDto userDto);
}
