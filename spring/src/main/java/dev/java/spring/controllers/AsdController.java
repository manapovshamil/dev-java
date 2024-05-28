package dev.java.spring.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asd/test")
//@Tag(name = "AsdController", description = "THe asd api")
@AllArgsConstructor
public class AsdController {
    @GetMapping("get-t2")
    public ResponseEntity<String> getTest2(){
        return ResponseEntity.ok("hello t2");
    }
}
