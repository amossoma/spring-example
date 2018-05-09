package org.amossoma.spring_example.rest;

import org.amossoma.spring_example.rest.model.HelloResponse;
import org.amossoma.spring_example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("/hello")
    public HelloResponse hello(@RequestParam(value="name", defaultValue="World") String name) {
        return new HelloResponse(helloService.hello(name));
    }

}
