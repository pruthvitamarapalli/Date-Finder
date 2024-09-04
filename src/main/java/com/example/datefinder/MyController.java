package com.example.datefinder;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
@RestController
public class MyController {

    @GetMapping("/")
    String getDate() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate updatedDate = now.plusDays(100);
        String result = updatedDate.format(df);
        return result;
    }
    
}
