package org.amossoma.spring_example.service;

import org.amossoma.spring_example.model.Hello;
import reactor.core.publisher.Mono;

public interface HelloService {

    Mono<Hello> hello(String name);

}
