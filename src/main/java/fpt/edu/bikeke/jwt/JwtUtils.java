package fpt.edu.bikeke.jwt;

import fpt.edu.bikeke.utils.TimeUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class JwtUtils {
    @Value("${bikeke.app.jwtSecret}")
    private String jwtSecret;
    @Value("${bikeke.app.jwtExpirationMs}")
    private int jwtExpirationMs;

    public String generateJwt(CustomUserDetails userDetails) {
        Timestamp now = TimeUtils.getCurrent();
        Timestamp expiryDate = TimeUtils.addTime(now, jwtExpirationMs);

        return Jwts.builder()
                .setSubject(userDetails.getUsername())
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(SignatureAlgorithm.HS256, jwtSecret)
                .compact();
    }

    public String getEmailFromJwt(String jwt) {
        Claims claims = Jwts.parser()
                .setSigningKey(jwtSecret)
                .parseClaimsJws(jwt)
                .getBody();
        return claims.getSubject();
    }

    public boolean validateJwt(String jwt) {
        try {
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(jwt);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
