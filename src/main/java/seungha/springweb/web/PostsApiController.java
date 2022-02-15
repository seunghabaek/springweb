package seungha.springweb.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import seungha.springweb.service.posts.PostsService;
import seungha.springweb.web.dto.PostsResponseDto;
import seungha.springweb.web.dto.PostsSaveRequestDto;
import seungha.springweb.web.dto.PostsUpdateRequestDto;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
