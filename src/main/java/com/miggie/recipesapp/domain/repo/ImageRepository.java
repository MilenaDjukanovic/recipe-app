package com.miggie.recipesapp.domain.repo;

import com.miggie.recipesapp.domain.repo.core.entity.commons.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Image repository
 *
 * @author milena_djukanovic
 */
public interface ImageRepository extends JpaRepository<ImageEntity, Long>{

    /**
     * Finds image by its ID
     * @param id ID of the image
     * @return Optional of Image entity
     */
    Optional<ImageEntity> findById(final Long id);
}
