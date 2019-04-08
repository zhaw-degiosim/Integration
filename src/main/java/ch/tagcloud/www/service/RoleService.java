package ch.tagcloud.www.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ch.tagcloud.www.model.Role;

public interface RoleService {
    
    @Transactional
    List<Role> findAll();
}