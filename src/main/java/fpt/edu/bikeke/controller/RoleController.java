package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.entity.Role;
import fpt.edu.bikeke.repository.RoleRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleRepostiory roleRepostiory;

    @GetMapping("/{id}")
    public ResponseEntity<Role> get(@PathVariable Long id){
        Role role = roleRepostiory.findById(id).orElse(null);
        return new ResponseEntity<>(role, HttpStatus.OK);
    }
}
