package edu.miu.cs545.restApi.controller;

import edu.miu.cs545.restApi.domain.dto.PostDto;
import edu.miu.cs545.restApi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts/")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping
    public List<PostDto> getAll(){
        return postService.getAll();
    }

   @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public PostDto getById(@PathVariable("id") Long id){
        return postService.getById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody PostDto postDto){
        postService.save(postDto);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        postService.delete(id);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody PostDto postDto){
        postService.update(id,postDto);
    }

}
