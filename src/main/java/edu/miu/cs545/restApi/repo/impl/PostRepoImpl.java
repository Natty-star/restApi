package edu.miu.cs545.restApi.repo.impl;

import edu.miu.cs545.restApi.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PostRepoImpl {
    private static List<Post> posts;

    private static Long PostId = 100L;

    static {
        Post post1 = new Post(1,"great", "positive content","Natty");
        Post post2 = new Post(2,"Sport", "positive content","Mera");
        Post post3 = new Post(3,"New Post", "positive content","Nat");

        posts = Arrays.asList(post1, post2, post3);
    }

    public List<Post> findAll(){
        return posts;
    }

    public Post findById(Long id){
        return  posts.stream().filter(post -> post.getId() == id).findFirst().orElse(null);
    }



}
