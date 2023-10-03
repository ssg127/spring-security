package com.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/foo")
public class Controller {

    @GetMapping
    public List<Foo> getFoo() {
        var res = new ArrayList<Foo>();

        res.add(new Foo(1, "Primer elemento"));
        res.add(new Foo(2, "Segundo elemento"));
        
        return res;
    }

    public record Foo(int id, String name){

    }

}