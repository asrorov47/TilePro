package com.universal.tilepro.Controller;

import com.universal.tilepro.dto.ProductDto;
import com.universal.tilepro.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    //TODO:@Valid not found

    @Autowired
    private ProductService productService;


    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ProductDto productDto) {
        ProductDto result = productService.create(productDto);
        return ResponseEntity.ok(result);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id) {
        ProductDto result = productService.get(id);
        return ResponseEntity.ok(result);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody ProductDto productDto) {
        boolean result = productService.update(id, productDto);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id,
                                    @RequestBody ProductDto productDto) {
        boolean result = productService.delete(id, productDto);
        return ResponseEntity.ok(result);
    }








}
