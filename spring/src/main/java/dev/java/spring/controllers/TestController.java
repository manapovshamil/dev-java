package dev.java.spring.controllers;

import dev.java.spring.services.TestService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@AllArgsConstructor
public class TestController {

    private TestService testService;
    @GetMapping("get-test")
    @Operation(summary = "Gets all users")
    public ResponseEntity<String> getTest(){
        return ResponseEntity.ok(testService.getTest());
    }

    @GetMapping("get-t2")
    public ResponseEntity<String> getTest2(){
        return ResponseEntity.ok("hello t2");
    }
}
