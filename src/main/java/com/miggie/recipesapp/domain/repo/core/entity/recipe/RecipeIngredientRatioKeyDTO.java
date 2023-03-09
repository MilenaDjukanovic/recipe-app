package com.miggie.recipesapp.domain.repo.core.entity.recipe;

import lombok.Data;

import javax.persistence.Column;

/**
 * @author milena_djukanovic
 */
@Data
public class RecipeIngredientRatioKeyDTO{

    private Long recipeId;

    private Long ingredientId;
}
