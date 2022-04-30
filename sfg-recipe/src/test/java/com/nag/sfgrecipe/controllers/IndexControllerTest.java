package com.nag.sfgrecipe.controllers;

import com.jayway.jsonpath.internal.path.PredicateContextImpl;
import com.nag.sfgrecipe.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;

class IndexControllerTest {

    @Mock
    RecipeService service;

    @Mock
    Model model;

    IndexController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        controller = new IndexController(service);
    }

    @Test
    void getIndexPage() {
      String viewName = controller.getIndexPage(model);
      assertEquals("index", viewName);
        Mockito.verify(service, Mockito.times(1)).getRecipes();
        Mockito.verify(model, Mockito.times(1)).addAttribute(eq("recipes"),anySet());
    }
}