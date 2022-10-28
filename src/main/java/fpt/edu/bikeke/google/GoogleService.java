package fpt.edu.bikeke.google;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import fpt.edu.bikeke.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;

@Service
public class GoogleService implements IGoogleService {
    @Value("${bikeke.app.googleClientId}")
    private String CLIENT_ID;

    private GoogleIdToken verify(String idTokenString) throws GeneralSecurityException, IOException {
        GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(new NetHttpTransport(), new GsonFactory())
                .setAudience(Collections.singletonList(CLIENT_ID)).build();
        GoogleIdToken googleIdToken = verifier.verify(idTokenString);
        return googleIdToken;
    }

    @Override
    public GoogleProfile getProfile(String idTokenString) {
        GoogleProfile googleProfile = null;
        try {
            GoogleIdToken idToken = verify(idTokenString);
            GoogleIdToken.Payload payload = idToken.getPayload();

            String userId = payload.getSubject();
            String email = payload.getEmail();
            boolean emailVerified = payload.getEmailVerified();
            String name = (String) payload.get("name");
            String pictureUrl = (String) payload.get("picture");
            String locale = (String) payload.get("locale");
            String familyName = (String) payload.get("family_name");
            String givenName = (String) payload.get("given_name");

            googleProfile = new GoogleProfile(userId, email, emailVerified, name, pictureUrl, locale, familyName, givenName);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return googleProfile;
    }
}
