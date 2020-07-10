package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Category;
import ch.zli.m223.punchclock.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public class CategoryController {

    CategoryService categoryService;



    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Category> getAllCategories() {
        return categoryService.findAll();
    }
}
