package com.example.demo.api.router;

import com.example.demo.api.handler.HealthHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

@Configuration
public class HealthRouter {

    @Bean
    public RouterFunction<ServerResponse> healthRouterFunction(HealthHandler healthHandler) {
        RequestPredicate healthRoute =
                RequestPredicates.GET("/s3/health")
                        .and(RequestPredicates.accept(MediaType.APPLICATION_JSON));

        return RouterFunctions.route(healthRoute, healthHandler::health);
    }
}
