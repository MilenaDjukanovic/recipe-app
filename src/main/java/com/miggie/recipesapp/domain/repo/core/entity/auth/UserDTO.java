package com.miggie.recipesapp.domain.repo.core.entity.auth;

import com.miggie.recipesapp.domain.repo.core.entity.commons.ImageDTO;
import lombok.Data;

/**
 * @author milena_djukanovic
 * DTO class for user entity
 */
@Data
public class UserDTO{

    private Long id;

    private String username;

    private String firstName;

    private String lastName;

    private String about;

    private ImageDTO profileImage;
}
