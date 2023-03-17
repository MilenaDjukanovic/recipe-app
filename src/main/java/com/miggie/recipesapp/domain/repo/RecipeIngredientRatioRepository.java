package com.miggie.recipesapp.domain.repo;

import com.miggie.recipesapp.domain.repo.core.entity.recipe.RecipeIngredientRatioEntity;
import com.miggie.recipesapp.domain.repo.core.entity.recipe.RecipeIngredientRatioKey;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.Optional;

/**
 * RecipeIngredient relationship repository
 *
 * @author milena_djukanovic
 */
public interface RecipeIngredientRatioRepository extends JpaRepository<RecipeIngredientRatioEntity, Long>{

    /**
     * Find RecipeIngredient relationship by its complex ID
     * @param id of the complex RecipeIngredientRatioKey
     *           (which consists of recipe and ingredient ID)
     * @return Optional od RecipeIngredientRatio entity
     */
    Optional<RecipeIngredientRatioEntity> findById(final RecipeIngredientRatioKey id);

    /**
     * Find RecipeIngredient relationship by recipe ID
     * @param recipeId ID of the recipe
     * @return Optional od RecipeIngredientRatio entity
     */
    Page<RecipeIngredientRatioEntity> findByRecipeId(final Long recipeId, final Pageable pageable);
}
