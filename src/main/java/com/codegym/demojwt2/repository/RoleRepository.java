package com.codegym.demojwt2.repository;

import com.codegym.demojwt2.model.Role;
import com.codegym.demojwt2.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
