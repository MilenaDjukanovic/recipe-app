package com.miggie.recipesapp.domain.repo.core.entity.recipe;

import com.miggie.recipesapp.domain.repo.core.entity.auth.UserDTO;
import com.miggie.recipesapp.domain.repo.core.entity.commons.ImageDTO;

import java.util.List;

/**
 * @author milena_djukanovic
 */
public class RecipeDTO{

    private Long id;

    private String recipeName;

    private int numberOfPeoplePerServing;

    private int preparationTime;

    private String howToServe;

    private boolean isVegetarianFriendly;

    private List<RecipeIngredientRationDTO> ingredientRecipeRatio;

    private ImageDTO recipeImage;

    private UserDTO user;
}
