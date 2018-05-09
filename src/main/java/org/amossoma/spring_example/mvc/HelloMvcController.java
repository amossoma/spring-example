package org.amossoma.spring_example.mvc;

import org.amossoma.spring_example.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloMvcController {

    private final HelloService helloService;

    public HelloMvcController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello.html")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", helloService.hello(name).getName());

        return "hello";
    }

}
