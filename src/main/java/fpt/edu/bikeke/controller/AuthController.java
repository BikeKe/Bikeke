package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.constant.UrlConst;
import fpt.edu.bikeke.dto.AccountDto;
import fpt.edu.bikeke.dto.LoginRequest;
import fpt.edu.bikeke.dto.LoginResponse;
import fpt.edu.bikeke.entity.Account;
import fpt.edu.bikeke.enums.EnumActive;
import fpt.edu.bikeke.enums.EnumRole;
import fpt.edu.bikeke.google.GoogleProfile;
import fpt.edu.bikeke.google.IGoogleService;
import fpt.edu.bikeke.jwt.CustomUserDetails;
import fpt.edu.bikeke.jwt.JwtUtils;
import fpt.edu.bikeke.service.IAccountService;
import fpt.edu.bikeke.utils.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private IAccountService accountService;

    @Autowired
    private IGoogleService googleService;

    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping(UrlConst.DRIVER_AUTHENTICATE)
    public ResponseEntity<LoginResponse> driverAuthenticate(@RequestBody String idTokenString) {
        GoogleProfile googleProfile = googleService.getProfile(idTokenString);
        if (googleProfile != null) {
            if(!accountService.exist(googleProfile.getEmail())){
                AccountDto accountDto = new AccountDto();
                accountDto.setEmail(googleProfile.getEmail());
                accountDto.setPassword(googleProfile.getUserId());
                accountDto.setImg(googleProfile.getPictureUrl());
                accountDto.setRoleId((long) EnumRole.DRIVER.getRoleId());
                accountDto.setCreatedDate(TimeUtils.getCurrent());
                accountDto.setStatus(EnumActive.ACTIVE);

                accountService.create(accountDto);
            }
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(googleProfile.getEmail(), googleProfile.getUserId())
            );

            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtUtils.generateJwt((CustomUserDetails) authentication.getPrincipal());
            return new ResponseEntity<>(new LoginResponse(jwt), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping(UrlConst.CUSTOMER_AUTHENTICATE)
    public ResponseEntity<LoginResponse> customerAuthenticate(@RequestBody String idTokenString) {
        GoogleProfile googleProfile = googleService.getProfile(idTokenString);
        if (googleProfile != null) {
            if(!accountService.exist(googleProfile.getEmail())){
                AccountDto accountDto = new AccountDto();
                accountDto.setEmail(googleProfile.getEmail());
                accountDto.setPassword(googleProfile.getUserId());
                accountDto.setImg(googleProfile.getPictureUrl());
                accountDto.setRoleId((long) EnumRole.CUSTOMER.getRoleId());
                accountDto.setCreatedDate(TimeUtils.getCurrent());
                accountDto.setStatus(EnumActive.ACTIVE);

                accountService.create(accountDto);
            }
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(googleProfile.getEmail(), googleProfile.getUserId())
            );

            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtUtils.generateJwt((CustomUserDetails) authentication.getPrincipal());
            return new ResponseEntity<>(new LoginResponse(jwt), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping(UrlConst.ADMIN_AUTHENTICATE)
    public ResponseEntity<LoginResponse> adminAuthenticate(@RequestBody String idTokenString) {
        GoogleProfile googleProfile = googleService.getProfile(idTokenString);
        if (googleProfile != null) {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(googleProfile.getEmail(), "admin")
            );

            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtUtils.generateJwt((CustomUserDetails) authentication.getPrincipal());
            return new ResponseEntity<>(new LoginResponse(jwt), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
