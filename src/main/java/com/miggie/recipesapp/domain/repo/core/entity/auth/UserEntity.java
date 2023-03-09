package com.miggie.recipesapp.domain.repo.core.entity.auth;

import com.miggie.recipesapp.domain.repo.core.entity.commons.ImageEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author milena_djukanovic
 * Entity class for user
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "users")
public class UserEntity implements UserDetails{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Column(nullable = false)
    @Setter
    private String username;

    @Column(nullable = false)
    @Setter
    private String password;

    @Column(name = "first_name", nullable = false)
    @Getter @Setter
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @Getter @Setter
    private String lastName;

    @Column
    @Getter @Setter
    private String about;

    @Setter
    private boolean enabled = true;

    @OneToOne(cascade = {CascadeType.REMOVE})
    @JoinColumn(name = "image_id")
    @Getter @Setter
    private ImageEntity profileImage;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return new HashSet<>();
    }

    @Override
    public String getPassword(){
        return this.password;
    }

    @Override
    public String getUsername(){
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired(){
        return this.enabled;
    }

    @Override
    public boolean isAccountNonLocked(){
        return this.enabled;
    }

    @Override
    public boolean isCredentialsNonExpired(){
        return this.enabled;
    }

    @Override
    public boolean isEnabled(){
        return this.enabled;
    }
}
