package edu.miu.cs545.restApi.service;

import edu.miu.cs545.restApi.domain.Post;
import edu.miu.cs545.restApi.domain.User;
import edu.miu.cs545.restApi.domain.dto.PostDto;
import edu.miu.cs545.restApi.domain.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDto> getAll();
    UserDto getUser(Long id);


    UserDto save(UserDto userDto);

    List<PostDto> getUserPosts(Long id);

    void delete(Long id);

    void addPost(Long id, List<Post> post);


    User getUserByIdTest(Long id);

    List<UserDto> getUserMoreThanPosts(int post);

    List<User> getUserFilteredPostTitle(String title);
}
