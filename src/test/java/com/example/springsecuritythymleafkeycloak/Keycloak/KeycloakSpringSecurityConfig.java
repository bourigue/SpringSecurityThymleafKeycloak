package com.example.springsecuritythymleafkeycloak.Keycloak;

import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

public class KeycloakSpringSecurityConfig extends KeycloakWebSecurityConfigurerAdapter {
    @Override
    protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
        return null;
    }
}
