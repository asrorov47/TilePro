package com.universal.tilepro.Controller;

import com.universal.tilepro.dto.UserDto;
import com.universal.tilepro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {


    //TODO:@Valid not found

    @Autowired
    private UserService userService;


    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody UserDto userDto) {
        UserDto result = userService.create(userDto);
        return ResponseEntity.ok(result);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id) {
        UserDto result = userService.get(id);
        return ResponseEntity.ok(result);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody UserDto userDto) {
        boolean result = userService.update(id, userDto);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id,
                                    @RequestBody UserDto userDto) {
        boolean result = userService.delete(id, userDto);
        return ResponseEntity.ok(result);
    }





}
