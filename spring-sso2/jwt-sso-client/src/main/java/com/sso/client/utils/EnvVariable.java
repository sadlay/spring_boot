package com.sso.client.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 *
 * 环境变量
 * @author com.jonluo
 * Date 2017/9/15
 */
@Component
public class EnvVariable {
    //token名
    @Value("${jwt.token.cookie.name}")
    private String jwtTokenCookieName;
    //加密密钥
    @Value("${signing.key}")
    private String signingKey;
    //单点认证url
    @Value("${services.auth.url}")
    private String authService;

    @Value("${cookie.parent.domain}")
    private String cookieParentDomain;

    public String getCookieParentDomain() {
            return cookieParentDomain;
    }

    public void setCookieParentDomain(String cookieParentDomain) {
        this.cookieParentDomain = cookieParentDomain;
    }

    public String getJwtTokenCookieName() {
        return jwtTokenCookieName;
    }

    public void setJwtTokenCookieName(String jwtTokenCookieName) {
        this.jwtTokenCookieName = jwtTokenCookieName;
    }

    public String getSigningKey() {
        return signingKey;
    }

    public void setSigningKey(String signingKey) {
        this.signingKey = signingKey;
    }

    public String getAuthService() {
        return authService;
    }

    public void setAuthService(String authService) {
        this.authService = authService;
    }
}
