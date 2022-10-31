package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.constant.UrlConst;
import fpt.edu.bikeke.dto.PageAccount;
import fpt.edu.bikeke.dto.RoleDto;
import fpt.edu.bikeke.entity.BikeBrand;
import fpt.edu.bikeke.enums.EnumRole;
import fpt.edu.bikeke.exception.AppException;
import fpt.edu.bikeke.repository.BikeBrandRepository;
import fpt.edu.bikeke.service.IAccountService;
import fpt.edu.bikeke.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BikeBrandController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IAccountService accountService;

    @Autowired
    private BikeBrandRepository bikeBrandRepository;

//    @GetMapping(UrlConst.ROLE_FIND_ALL)
//    public ResponseEntity<Iterable<RoleDto>> findAll() {
//        List<RoleDto> roleDtoList = roleService.findAll();
//        if (roleDtoList == null) {
//            throw new AppException(404, "No role found");
//        }
//        return new ResponseEntity<>(roleDtoList, HttpStatus.OK);
//    }

//    @GetMapping(UrlConst.BIKEBRAND_FIND_ALL)
//    public List<BikeBrand> findAll() {
//        return bikeBrandRepository.findAll();
//    }


}
