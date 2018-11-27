package org.ashish.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class Controller {

    @GetMapping
    public String helloSpring() {
        return "Hello!!! This is Spring";
    }
}
