package fpt.edu.bikeke.exception;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleUnwantedException(Exception e){
        e.printStackTrace();
        return new ResponseEntity<>("Unknown Error", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(AppException.class)
    public ResponseEntity<String> handleAppException(AppException e){
        e.printStackTrace();
        return new ResponseEntity<>(e.getMessage(), HttpStatus.valueOf(e.getCode()));
    }

    @ExceptionHandler({ExpiredJwtException.class, UnsupportedJwtException.class, MalformedJwtException.class, SignatureException.class, IllegalArgumentException.class})
    public ResponseEntity<String> handleJwtException(Exception e){
        e.printStackTrace();
        return new ResponseEntity<>("JWT Error", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<String> handleAuthenticationException(AuthenticationException e){
        e.printStackTrace();
        return new ResponseEntity<>("Authenticate Failed", HttpStatus.UNAUTHORIZED);
    }
}
