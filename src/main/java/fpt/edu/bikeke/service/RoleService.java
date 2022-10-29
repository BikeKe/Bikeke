package fpt.edu.bikeke.service;

import fpt.edu.bikeke.dto.RoleDto;
import fpt.edu.bikeke.entity.Role;
import fpt.edu.bikeke.repository.RoleRepostiory;
import fpt.edu.bikeke.utils.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private RoleRepostiory roleRepostiory;

    @Override
    public RoleDto findById(Long id) {
        Optional<Role> role = roleRepostiory.findById(id);
        if (role.get() != null) {
            RoleDto roleDto = MappingUtils.toRoleDto(role.get());
            return roleDto;
        }
        return null;
    }

    @Override
    public List<RoleDto> findAll() {
        List<RoleDto> roleDtoList = null;
        for (Role role : roleRepostiory.findAll()) {
            if(roleDtoList == null){
                roleDtoList = new ArrayList<>();
            }
            roleDtoList.add(MappingUtils.toRoleDto(role));
        }
        return roleDtoList;
    }
}
