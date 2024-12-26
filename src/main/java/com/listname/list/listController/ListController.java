package com.listname.list.listController;


import com.listname.list.listDto.ListDto;
import com.listname.list.listEntity.ListName;
import com.listname.list.listService.ListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ListController {
    private final ListService listService;

    public ListController(ListService listService) {
        this.listService = listService;
    }

    @PostMapping
    public ResponseEntity<?> saveName(@RequestBody ListDto listDto) {
        ListName saveName = listService.saveName(listDto);
        return new ResponseEntity<>(saveName, HttpStatus.CREATED);

    }
    @GetMapping
    public ResponseEntity<List<ListName>> getAlllistName(){
        return ResponseEntity.ok(listService.getAlllistName());
    }

}
