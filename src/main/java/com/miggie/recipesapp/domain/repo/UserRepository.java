package com.miggie.recipesapp.domain.repo;

import com.miggie.recipesapp.domain.repo.core.entity.auth.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * User repository
 *
 * @author milena_djukanovic
 */
public interface UserRepository extends JpaRepository<UserEntity, Long>{

    /**
     * Finds User by its username
     * @param username of the user
     * @return Optional of user entity
     */
    Optional<UserEntity> findByUsername(final String username);

    /**
     * Find User by its ID
     * @param id of the user
     * @return Optional of user entity
     */
    Optional<UserEntity> findById(final Long id);
}
