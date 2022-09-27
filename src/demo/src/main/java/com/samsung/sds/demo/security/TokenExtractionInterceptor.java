package com.samsung.sds.demo.security;

import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.JWTParser;
import lombok.NoArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@CrossOrigin(origins = "${cors.origin.allowed}", allowedHeaders = "*")
@NoArgsConstructor
@Component
public class TokenExtractionInterceptor implements HandlerInterceptor {
    String Authorization;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Authorization = request.getHeader("Authorization");
        String [] token = Authorization.split(" ");
        JWT jwt = JWTParser.parse(token[1]);
        JWTClaimsSet jwtClaimSet = jwt.getJWTClaimsSet();
        String sub= jwtClaimSet.getSubject();
        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(jwtClaimSet.getSubject(), jwtClaimSet.getStringClaim("preferred_username"),null);
        SecurityContextHolder.getContext().setAuthentication(auth);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mvc) throws Exception{

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) throws Exception{}
}

