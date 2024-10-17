package uz.xaldarof.lessons.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.xaldarof.lessons.dto.PostDTO;
import uz.xaldarof.lessons.entities.Post;
import uz.xaldarof.lessons.service.PostService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    @PostMapping("create")
    public ResponseEntity<Post> create(@RequestBody PostDTO dto) {
        return new ResponseEntity<>(postService.create(dto), HttpStatus.OK);
    }
    @GetMapping("getAll")
    public ResponseEntity<List<Post>> getAll() {
        return new ResponseEntity<>(postService.getAll(), HttpStatus.OK);
    }

    @PostMapping("update")
    public ResponseEntity<Post> update(@RequestBody Post dto) {
        return new ResponseEntity<>(postService.update(dto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        return new ResponseEntity<>(postService.delete(id), HttpStatus.OK);
    }
    @GetMapping("/category/{id}")
    public ResponseEntity<List<Post>> getCategoryPosts(@PathVariable Long id) {
        return new ResponseEntity<>(postService.getCategoryPosts(id), HttpStatus.OK);
    }
}
