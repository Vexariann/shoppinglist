package com.vex.shoppinglist.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/shopping-list-items")
@CrossOrigin("http://localhost:5173")
public class ShoppingListController {
    @GetMapping
    public List<String> get() {
        return List.of(
                "boter",
                "kaas",
                "eieren"
        );
    }
}
