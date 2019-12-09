package app1.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import app1.com.FactoryBeanService;

import java.util.Date;

@Configuration
@EnableWebMvc
@RestController
@Slf4j
public class Backend {
	
	@Autowired
	FactoryBeanService factoryBeanService;

    @RequestMapping("/api")
    public String printDate(@RequestParam(name = "username", required = false) String username) {
        log.info("req: username={}", username);
        if (username != null) {
            return new Date().toString() + " " + username;
        }
        factoryBeanService.testFactoryBean();
        return new Date().toString();
    }
}
