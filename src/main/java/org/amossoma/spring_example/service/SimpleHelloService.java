package org.amossoma.spring_example.service;

import org.amossoma.spring_example.model.Hello;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class SimpleHelloService implements HelloService {

    @Override
    public Mono<Hello> hello(String name) {
        return Mono.just(new Hello(String.format("Hello %s!!!", name)));
    }

}
