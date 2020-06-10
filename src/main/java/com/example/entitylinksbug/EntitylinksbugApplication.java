package com.example.entitylinksbug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
public class EntitylinksbugApplication {

    public static void main(String[] args) {
        SpringApplication.run(EntitylinksbugApplication.class, args);
    }

}

@RestController
@RequestMapping("/")
class ExampleController {
    private final EntityLinks entityLinks;

    ExampleController(EntityLinks entityLinks) {
        this.entityLinks = entityLinks;
    }

    @GetMapping
    String get() {
        return entityLinks.toString();
    }
}
