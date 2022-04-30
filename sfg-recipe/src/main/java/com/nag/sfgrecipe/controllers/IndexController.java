package com.nag.sfgrecipe.controllers;

import com.nag.sfgrecipe.RecipeService;
import com.nag.sfgrecipe.domain.Category;
import com.nag.sfgrecipe.repositories.CategoryRepository;
import com.nag.sfgrecipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
    model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
