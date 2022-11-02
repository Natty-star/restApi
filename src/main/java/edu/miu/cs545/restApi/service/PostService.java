package edu.miu.cs545.restApi.service;

import edu.miu.cs545.restApi.domain.dto.PostDto;

import java.util.List;



public interface PostService {
    List<PostDto> getAll();
    PostDto getById(Long id);
    void save(PostDto postDto);
    void delete(Long id);
    void update(Long id, PostDto postDto);

}
