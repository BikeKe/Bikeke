package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.constant.UrlConst;
import fpt.edu.bikeke.entity.CustomerRouteRate;
import fpt.edu.bikeke.entity.DriverRouteRate;
import fpt.edu.bikeke.repository.CustomerRouteRateRepository;
import fpt.edu.bikeke.repository.DriverRouteRateRepository;
import fpt.edu.bikeke.service.IAccountService;
import fpt.edu.bikeke.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DriverRouteRateController {
//    @Autowired
//    private ICustomerService customerService;
//
//    @Autowired
//    private IAccountService accountService;

    @Autowired
    private DriverRouteRateRepository driverRouteRateRepository;

    @GetMapping(UrlConst.DRIVER_ROUTE_RATE_FIND_ALL)
    public List<DriverRouteRate> findAll() {
        return driverRouteRateRepository.findAll();
    }


}
