package fpt.edu.vn.controller;

import fpt.edu.vn.dto.*;
import fpt.edu.vn.enums.EnumRole;
import fpt.edu.vn.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @PostMapping("/signIn")
    public ResponseEntity<AccountDTO> signIn(@RequestBody AccountLoginDTO accountLoginDTO){
        AccountDTO accountDTO = accountService.authenticate(accountLoginDTO.getEmail(), accountLoginDTO.getPassword());
        if(accountDTO != null){
            return new ResponseEntity<>(accountDTO, HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.OK);
    }

    @PostMapping("/authorize")
    public ResponseEntity<Object> authorize(@RequestBody AuthorizeDTO authorizeDTO){
        Object roleDTO = accountService.authorize(authorizeDTO.getAccountId(), authorizeDTO.getRole());
        if(roleDTO != null){
            switch (EnumRole.getRoleConst(authorizeDTO.getRole())){
                case ADMIN:
                    roleDTO = (AdminDTO) roleDTO;
                    break;
                case CUSTOMER:
                    roleDTO = (CustomerDTO) roleDTO;
                    break;
                case DRIVER:
                    roleDTO = (DriverDTO) roleDTO;
                    break;
            }
            return new ResponseEntity<>(roleDTO, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
