package com.rce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rce.models.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}
