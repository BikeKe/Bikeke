package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.constant.UrlConst;
import fpt.edu.bikeke.dto.PageAccount;
import fpt.edu.bikeke.enums.EnumRole;
import fpt.edu.bikeke.exception.AppException;
import fpt.edu.bikeke.service.IAccountService;
import fpt.edu.bikeke.service.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {
    @Autowired
    private IDriverService driverService;

    @Autowired
    private IAccountService accountService;

    @GetMapping(UrlConst.DRIVER_FIND_ALL)
    public ResponseEntity<PageAccount> findAll(@RequestParam int page){
        page -= 1;
        PageAccount driverList = accountService.findAllbyRole((long) EnumRole.DRIVER.getRoleId(), page);
        if (driverList == null){
            throw new AppException(404, "No driver found");
        }
        return new ResponseEntity<>(driverList, HttpStatus.OK);
    }
}
