package com.miggie.recipesapp.domain.repo.core.entity.recipe;

import lombok.Data;

import java.util.List;

/**
 * @author milena_djukanovic
 */
@Data
public class IngredientDTO{

    private Long id;

    private String ingredientName;

    private IngredientTypeEnum ingredientTypeEnum;

    private List<RecipeIngredientRatioEntity> ingredientRecipeRatio;
}
