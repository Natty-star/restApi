package edu.miu.cs545.restApi.controller;

import edu.miu.cs545.restApi.domain.dto.UserDto;
import edu.miu.cs545.restApi.service.UserService;
import edu.miu.cs545.restApi.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable("id") Long id){
        return userService.getUser(id);
    }

    @PostMapping
    public ResponseEntity<UserDto> save(@RequestBody UserDto userDto){
         UserDto newUser = userService.save(userDto);
         return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

}
