package org.amossoma.spring_example.service;

import org.amossoma.spring_example.model.Hello;
import org.springframework.stereotype.Component;

@Component
public class SimpleHelloService implements HelloService {

    @Override
    public Hello hello(String name) {
        return new Hello(String.format("Hello %s!!!", name));
    }

}
