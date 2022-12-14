package edu.miu.cs545.restApi.domain.dto;

import edu.miu.cs545.restApi.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String name;
//    private List<Post> posts;
}
