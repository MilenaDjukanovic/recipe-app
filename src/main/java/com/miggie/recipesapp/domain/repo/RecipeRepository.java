package com.miggie.recipesapp.domain.repo;

import com.miggie.recipesapp.domain.repo.core.entity.auth.UserEntity;
import com.miggie.recipesapp.domain.repo.core.entity.recipe.RecipeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotNull;
import java.util.Optional;

/**
 * Recipe repository
 *
 * @author milena_djukanovic
 */
public interface RecipeRepository extends JpaRepository<RecipeEntity, Long>{

    /**
     * Finds Recipe entity by its ID
     * @param id is the ID of the recipe
     * @return Optional of recipe entity
     */
    Optional<RecipeEntity> findById(final Long id);

    /**
     * Finds all recipes
     * @param pageable pageable object
     * @return Page of recipe entities
     */
    Page<RecipeEntity> findAll(final Pageable pageable);

    /**
     * Finds all recipes for user
     * @param userEntity user entity for search
     * @param pageable pageable object
     * @return Page of recipe entities
     */
    Page<RecipeEntity> findByUser(final UserEntity userEntity, final Pageable pageable);

    /**
     * Deletes recipe by id
     * @param id of the recipe we want to delete
     */
    void deleteById(final Long id);


}
