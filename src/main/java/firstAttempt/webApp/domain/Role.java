package firstAttempt.webApp.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER, ADMIN, BANNED;

    @Override
    public String getAuthority() {
        return name();
    }
}
