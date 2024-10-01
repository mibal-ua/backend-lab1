package ua.mibal.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Mykhailo Balakhon
 * @link <a href="mailto:mykhailo.balakhon@communify.us">mykhailo.balakhon@communify.us</a>
 */
@RestController
public class HealthcheckController {
    
    @GetMapping
    public Object healthcheck() {
        return Map.of(
                "status", "UP"
        );
    }
}
