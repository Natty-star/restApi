package edu.miu.cs545.restApi.service.impl;

import edu.miu.cs545.restApi.domain.Post;
import edu.miu.cs545.restApi.domain.dto.PostDto;
import edu.miu.cs545.restApi.repo.PostRepo;
import edu.miu.cs545.restApi.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    public PostRepo postRepo;
    @Autowired
    private ModelMapper modelMapper;

    public List<PostDto> getAll() {
        return postRepo.findAll().stream().map(post -> modelMapper.map(post,PostDto.class)).collect(Collectors.toList());
    }
    public PostDto getById(Long id){
        return modelMapper.map(postRepo.findById(id),PostDto.class);
    }

    public void save(PostDto postDto) {
        postRepo.save(modelMapper.map(postDto, Post.class));
    }

    @Override
    public void delete(Long id) {
        postRepo.delete(id);
    }

    @Override
    public void update(Long id, PostDto postDto) {
        postRepo.update(id,modelMapper.map(postDto,Post.class));
    }
}
