package com.miggie.recipesapp.domain.repo.core.entity.commons;

import lombok.Data;

/**
 * @author milena_djukanovic
 * DTO class for image entity
 */
@Data
public class ImageDTO{

    private Long id;

    private String name;

    private String extension;

    private byte[] image;

    private String imageFile;
}
