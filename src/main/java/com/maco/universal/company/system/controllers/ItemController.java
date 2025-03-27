package com.maco.universal.company.system.controllers;

import com.maco.universal.company.system.dto.item.ItemCategoryDto;
import com.maco.universal.company.system.services.item.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;


    @PostMapping("/add-category")
    public ResponseEntity<?> addCategory(@RequestBody ItemCategoryDto itemCategory){
        ItemCategoryDto saved = itemService.addCategory(itemCategory);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
}
