package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController()
@RequestMapping("/api")
public class HelloResource {

    @RequestMapping(value = "/testpost1", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TestObject> testpost1(@RequestBody TestObject dto) throws URISyntaxException {
        return ResponseEntity.ok(dto);
    }

    @RequestMapping(value = "/testpost2", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TestObject> testpost2(@RequestBody TestObject dto) throws URISyntaxException {
        return ResponseEntity.ok(dto);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> hello() throws URISyntaxException {
        return ResponseEntity.ok("Hello World");
    }

}
