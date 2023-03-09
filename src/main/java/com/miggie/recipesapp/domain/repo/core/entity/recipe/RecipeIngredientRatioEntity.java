package com.miggie.recipesapp.domain.repo.core.entity.recipe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

/**
 * @author milena_djukanovic
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "recipe_ingredient_ratio")
public class RecipeIngredientRatioEntity{

    @EmbeddedId
    @Getter @Setter
    private RecipeIngredientRatioKey id;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne
    @MapsId("recipeId")
    @JoinColumn(name = "recipe_id")
    private RecipeEntity recipe;

    @ManyToOne
    @MapsId("ingredientId")
    @JoinColumn(name = "ingredient_id")
    private IngredientEntity ingredient;
}
