package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.constant.UrlConst;
import fpt.edu.bikeke.page.PageAccount;
import fpt.edu.bikeke.enums.EnumRole;
import fpt.edu.bikeke.service.IAccountService;
import fpt.edu.bikeke.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IAccountService accountService;

    @GetMapping(UrlConst.CUSTOMER_FIND_ALL)
    public ResponseEntity<?> findAll(@RequestParam int page){
        page -= 1;
        PageAccount customerList = accountService.findAllbyRole((long) EnumRole.CUSTOMER.getRoleId(), page);
        if(customerList == null){
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
        }
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }
}
