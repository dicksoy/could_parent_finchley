package com.dicksoy.service.feign.finchley;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name + " from ------ feign-hystric ";
    }
}
