package com.ravi.springboot.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by ravi on 11/18/2017.
 */
@Component
public class SBHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {

        return Health.up().build();
    }
}
