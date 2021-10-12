package co.edu.usa.fincaapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usa.fincaapp.entidades.Category;
import co.edu.usa.fincaapp.servicios.CategoryService;

@RestController
@RequestMapping("api/Category")
@CrossOrigin(origins = "*")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getCategorys(){
        return categoryService.getCategories();
    }

    @PostMapping("/save")
    public Category saveCategory(@RequestBody Category category){
        Category categorySave = categoryService.savaCategory(category);
        return categorySave;
    }
}
