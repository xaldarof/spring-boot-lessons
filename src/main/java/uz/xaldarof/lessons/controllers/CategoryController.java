package uz.xaldarof.lessons.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.xaldarof.lessons.dto.CategoryDTO;
import uz.xaldarof.lessons.entities.Category;
import uz.xaldarof.lessons.repositories.CategoryRepository;
import uz.xaldarof.lessons.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/categories")
@AllArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    private final CategoryRepository categoryRepository;

    @GetMapping
    public ResponseEntity<List<Category>> getAll() {
        return ResponseEntity.ok(categoryService.getAll());
    }

    @PostMapping
    public ResponseEntity<Category> create(@RequestBody CategoryDTO dto) {

        return ResponseEntity.ok(categoryRepository.save(Category.builder()
                .name(dto.getName())
                .build()));
    }
}
