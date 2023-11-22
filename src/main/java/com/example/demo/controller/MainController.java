package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import com.example.demo.model.DummyObject;

@RestController
public class MainController {

    @GetMapping("/")
    public List<String> home() {
        return Arrays.asList("Element1", "Element2", "Element3");
    }

    @GetMapping("/current-connections")
    public DummyObject currentConnections() {
        return new DummyObject("DummyValue1", 123);
    }

}
