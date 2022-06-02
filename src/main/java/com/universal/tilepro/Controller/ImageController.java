package com.universal.tilepro.Controller;

import com.sun.xml.bind.v2.TODO;
import com.universal.tilepro.dto.ImageDto;
import com.universal.tilepro.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/images")
public class ImageController {

    //TODO:@Valid quyib bo`lmayapti bibliotekada yuqakan

    @Autowired
    private ImageService imageService;

    @PostMapping("/create")

    public ResponseEntity<?> create(@RequestBody ImageDto imageDto) {
        ImageDto result = imageService.create(imageDto);
        return ResponseEntity.ok(result);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id) {
        ImageDto result = imageService.get(id);
        return ResponseEntity.ok(result);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody ImageDto imageDto) {
        boolean result = imageService.update(id, imageDto);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id,
                                    @RequestBody  ImageDto imageDto) {
        boolean result = imageService.delete(id, imageDto);
        return ResponseEntity.ok(result);
    }

}
