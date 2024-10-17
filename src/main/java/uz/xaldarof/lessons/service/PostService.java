package uz.xaldarof.lessons.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import uz.xaldarof.lessons.dto.PostDTO;
import uz.xaldarof.lessons.entities.Post;
import uz.xaldarof.lessons.repositories.PostRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class PostService {
    private PostRepository postRepository;
    private CategoryService categoryService;

    public Post create(PostDTO dto) {
        System.out.printf("Category id"+dto.getCategoryId());
        System.out.printf("Category id"+dto.getTitle());
        Post post = Post.builder()
                .title(dto.getTitle())
                .description(dto.getDescription())
                .category(categoryService.getById(dto.getCategoryId()))// use 'content' here
                .build();
        return postRepository.save(post);
    }

    public List<Post> getAll() {
        return postRepository.findAll();
    }

    public List<Post> getCategoryPosts(Long id) {
        return postRepository.findByCategoryId(id);
    }

    public Post update(Post post) {
        return postRepository.save(post);
    }

    public boolean delete(Long id) {
        try {
            postRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
