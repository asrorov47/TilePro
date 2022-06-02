package com.universal.tilepro.Controller;

import com.universal.tilepro.dto.AddressDto;
import com.universal.tilepro.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
public class AddressController {

//TODO:@RequestBodylardan keyin @Valid Qo`yib bo`lmayapti ko`rsatish kerak

     @Autowired
    private AddressService addressService;




    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody AddressDto addressDto) {
        AddressDto result = addressService.create(addressDto);
        return ResponseEntity.ok(result);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id) {
        AddressDto result = addressService.get(id);
        return ResponseEntity.ok(result);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody AddressDto addressDto) {
        boolean result = addressService.update(id, addressDto);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id,
                                    @RequestBody AddressDto addressDto) {
        boolean result = addressService.delete(id, addressDto);
        return ResponseEntity.ok(result);
    }

















}
