package com.akash.students.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties("student")
@Component
public class AppProperties {
    private String name;
}
