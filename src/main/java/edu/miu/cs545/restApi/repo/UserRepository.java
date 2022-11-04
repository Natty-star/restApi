package edu.miu.cs545.restApi.repo;

import edu.miu.cs545.restApi.domain.User;
import edu.miu.cs545.restApi.domain.dto.PostDto;
import edu.miu.cs545.restApi.domain.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value = "SELECT u FROM User u WHERE u.posts.size > :post")
    List<User> findByPostsGreaterThan(int post);

}
