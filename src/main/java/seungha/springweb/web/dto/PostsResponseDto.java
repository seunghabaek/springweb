package seungha.springweb.web.dto;

import lombok.Getter;
import seungha.springweb.domain.posts.Posts;

import javax.persistence.GeneratedValue;

@Getter
public class PostsResponseDto {

    public Long id;
    public String title;
    public String content;
    public String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
