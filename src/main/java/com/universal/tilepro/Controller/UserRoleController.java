package com.universal.tilepro.Controller;

import com.universal.tilepro.dto.UserRoleDto;
import com.universal.tilepro.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userRoles")
public class UserRoleController {

    //TODO:@Valid not found

    @Autowired
    private UserRoleService userRoleService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody UserRoleDto userRoleDto) {
        UserRoleDto result = userRoleService.create(userRoleDto);
        return ResponseEntity.ok(result);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id) {
        UserRoleDto result = userRoleService.get(id);
        return ResponseEntity.ok(result);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody UserRoleDto userRoleDto) {
        boolean result = userRoleService.update(id, userRoleDto);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id,
                                    @RequestBody UserRoleDto userRoleDto) {
        boolean result = userRoleService.delete(id, userRoleDto);
        return ResponseEntity.ok(result);
    }






}
