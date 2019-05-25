package com.briup.app.kfc.service;

import com.briup.app.kfc.bean.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();

    public Category findCategoryById(Long id);

    public void saveOrupdateCategory(Category category);


    public void deleteCategoryById(Long id);
}
