package com.miggie.recipesapp.domain.repo;

import com.miggie.recipesapp.domain.repo.core.entity.recipe.IngredientEntity;
import com.miggie.recipesapp.domain.repo.core.entity.recipe.IngredientTypeEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Ingredient repository
 *
 * @author milena_djukanovic
 */
public interface IngredientRepository extends JpaRepository<IngredientEntity, Long>{

    /**
     * Find Ingredient by its ID
     * @param id of the ingredient
     * @return Optional of Ingredient entity
     */
    Optional<IngredientEntity> findById(final Long id);

    /**
     * Finds ingredients by type
     * @param ingredientType type of the ingredient
     * @param pageable
     * @return Pageable of IngredientEntity
     */
    Page<IngredientEntity> findIngredientEntitiesByIngredientType(
            final IngredientTypeEnum ingredientType,
            final Pageable pageable
    );
}
