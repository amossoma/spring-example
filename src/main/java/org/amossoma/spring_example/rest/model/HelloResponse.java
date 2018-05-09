package org.amossoma.spring_example.rest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import org.amossoma.spring_example.model.Hello;

public class HelloResponse {

    private final String name;

    public HelloResponse(Hello hello) {
        this.name = hello.getName();
    }

    @JsonGetter
    public String getName() {
        return name;
    }

}
