package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.constant.UrlConst;
import fpt.edu.bikeke.dto.PageAccount;
import fpt.edu.bikeke.entity.BikeBrand;
import fpt.edu.bikeke.entity.CustomerRouteRate;
import fpt.edu.bikeke.enums.EnumRole;
import fpt.edu.bikeke.exception.AppException;
import fpt.edu.bikeke.repository.CustomerRouteRateRepository;
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
public class CustomerRouteRateController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IAccountService accountService;

    @Autowired
    private CustomerRouteRateRepository customerRouteRateRepository;

//    @GetMapping(UrlConst.CUSTOMER_FIND_ALL)
//    public ResponseEntity<PageAccount> findAll(@RequestParam int page){
//        page -= 1;
//        PageAccount customerList = accountService.findAllbyRole((long) EnumRole.CUSTOMER.getRoleId(), page);
//        if(customerList == null){
//            throw new AppException(404, "No customer found");
//        }
//        return new ResponseEntity<>(customerList, HttpStatus.OK);
//    }

    @GetMapping(UrlConst.CUSTOMER_ROUTE_RATE_FIND_ALL)
    public List<CustomerRouteRate> findAll() {
        return customerRouteRateRepository.findAll();
    }


}
