package com.nag.sfgrecipe;


import com.nag.sfgrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

}
