package com.ecolifr.open.platform.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author Xie ZuoZhi
 * @date 2019/6/10 10:14
 */
@Configuration
public class CustomCorsConfiguration {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("GET");
        corsConfiguration.addAllowedMethod("POST");
        corsConfiguration.addAllowedMethod("OPTIONS");
        //corsConfiguration.addExposedHeader("head1");
        //corsConfiguration.addExposedHeader("Location");
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/oauth/**", corsConfiguration);
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/user/me", corsConfiguration);
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/captcha/**", corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }
}

