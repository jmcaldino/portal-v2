package com.project.v2.calmar.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebConfigurerTestController {

    @GetMapping("/api/test-cors")
    public void testCorsOnApiPath() {
    }

    @GetMapping("/test/test-cors")
    public void testCorsOnOtherPath() {
    }
}
