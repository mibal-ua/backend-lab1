package ua.mibal.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.util.Date;
import java.util.Map;

/**
 * @author Mykhailo Balakhon
 * @link <a href="mailto:mykhailo.balakhon@communify.us">mykhailo.balakhon@communify.us</a>
 */
@RestController
public class HealthcheckController {

    @GetMapping("/healthcheck")
    public Map<String, Object> healthcheck() {
        return Map.of(
                "status", "UP",
                "timestamp", new Date().toInstant()
                        .atZone(ZoneId.of("Europe/Kiev"))
        );
    }
}
