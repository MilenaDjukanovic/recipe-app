package com.miggie.recipesapp.domain.repo.core.entity.recipe;

import com.miggie.recipesapp.domain.repo.core.entity.auth.UserEntity;
import com.miggie.recipesapp.domain.repo.core.entity.commons.ImageEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * @author milena_djukanovic
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "recipe")
public class RecipeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Column(nullable = false)
    @Getter @Setter
    private String recipeName;

    @Column
    @Getter @Setter
    private int numberOfPeoplePerServing;

    @Column
    @Getter @Setter
    private int preparationTime;

    @Column
    @Getter @Setter
    private String howToServe;

    @Column
    @Getter @Setter
    private boolean isVegetarianFriendly;

    /**
     * Defines a relationship between ingredients and recipes
     */
    @OneToMany(mappedBy = "recipe")
    private List<RecipeIngredientRatioEntity> ingredientRecipeRatio;

    @ManyToOne(cascade = {CascadeType.REMOVE})
    @JoinColumn(name = "image_id")
    @Getter @Setter
    private ImageEntity recipeImage;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @Getter @Setter
    private UserEntity user;
}
