package uz.xaldarof.lessons.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import uz.xaldarof.lessons.entities.Category;
import uz.xaldarof.lessons.repositories.CategoryRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {
    private CategoryRepository categoryRepository;


    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    public Category getById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }
}
