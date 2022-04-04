package com.nag.sfgrecipe.repositories;

import com.nag.sfgrecipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
