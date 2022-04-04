package com.nag.sfgrecipe.repositories;

import com.nag.sfgrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
