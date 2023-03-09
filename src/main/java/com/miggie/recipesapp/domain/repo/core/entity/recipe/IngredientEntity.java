package com.miggie.recipesapp.domain.repo.core.entity.recipe;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * @author milena_djukanovic
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "ingredients")
public class IngredientEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Column(nullable = false)
    @Getter @Setter
    private String ingredientName;

    @Column(nullable = false)
    @Getter @Setter
    private IngredientTypeEnum ingredientType;

    /**
     * Defines a relationship between ingredients and recipes
     */
    @OneToMany(mappedBy = "ingredient")
    private List<RecipeIngredientRatioEntity> ingredientRecipeRatio;
}
