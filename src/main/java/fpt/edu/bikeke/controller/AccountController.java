package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.repository.AccountRepository;
import fpt.edu.bikeke.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable Long id){
        Account account = accountRepository.findById(id).orElse(null);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }


}
