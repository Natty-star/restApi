package edu.miu.cs545.restApi.repo;

import edu.miu.cs545.restApi.domain.Post;
import edu.miu.cs545.restApi.domain.dto.PostDto;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface PostRepo {
     List<Post> findAll();
     Post findById(Long id);
     void save(Post post);
     void delete(Long id);
     void update(Long id, Post post);

}
