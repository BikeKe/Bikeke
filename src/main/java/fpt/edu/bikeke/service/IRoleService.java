package fpt.edu.bikeke.service;

import fpt.edu.bikeke.dto.RoleDto;

import java.util.List;

public interface IRoleService {
    RoleDto findById(Long id);
    List<RoleDto> findAll();
}
