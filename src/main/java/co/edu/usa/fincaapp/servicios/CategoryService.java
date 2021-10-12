package co.edu.usa.fincaapp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usa.fincaapp.Repositorios.CategoryRepository;
import co.edu.usa.fincaapp.entidades.Category;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getCategories(){
        return categoryRepository.getCategories();
    }

    public Category getCategory(Long id){
        return categoryRepository.getCategoryById(id).get();
    }

    public Category savaCategory(Category category){
        return categoryRepository.saveCategory(category);
    }
    
}
