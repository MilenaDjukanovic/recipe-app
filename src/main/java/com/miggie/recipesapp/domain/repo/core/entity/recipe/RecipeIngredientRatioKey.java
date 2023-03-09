package com.miggie.recipesapp.domain.repo.core.entity.recipe;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author milena_djukanovic
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Embeddable
public class RecipeIngredientRatioKey implements Serializable{

    @Column(name = "recipe_id")
    @Getter @Setter
    private Long recipeId;

    @Column(name = "ingredient_id")
    @Getter @Setter
    private Long ingredientId;
}
