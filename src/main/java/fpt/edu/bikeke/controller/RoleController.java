package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.constant.UrlConst;
import fpt.edu.bikeke.dto.RoleDto;
import fpt.edu.bikeke.exception.AppException;
import fpt.edu.bikeke.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    private IRoleService roleService;

    @GetMapping(UrlConst.ROLE_FIND_ALL)
    public ResponseEntity<Iterable<RoleDto>> findAll() {
        List<RoleDto> roleDtoList = roleService.findAll();
        if (roleDtoList == null) {
            throw new AppException(404, "No role found");
        }
        return new ResponseEntity<>(roleDtoList, HttpStatus.OK);
    }

    @GetMapping(UrlConst.ROLE_FIND)
    public ResponseEntity<RoleDto> findById(@PathVariable Long id) {
        RoleDto roleDto = roleService.findById(id);
        if (roleDto == null) {
            throw new AppException(404, "Not found role with id: " + id);
        }
        return new ResponseEntity<>(roleDto, HttpStatus.OK);
    }
}
