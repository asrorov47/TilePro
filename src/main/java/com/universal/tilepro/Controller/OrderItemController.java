package com.universal.tilepro.Controller;

import com.universal.tilepro.dto.OrderItemDto;
import com.universal.tilepro.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orderitems")
public class OrderItemController {


    //TODO:@Valid not found

    @Autowired
    private OrderItemService orderItemService;


    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody  OrderItemDto orderItemDto) {
        OrderItemDto result = orderItemService.create(orderItemDto);
        return ResponseEntity.ok(result);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id) {
        OrderItemDto result = orderItemService.get(id);
        return ResponseEntity.ok(result);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody OrderItemDto orderItemDto) {
        boolean result = orderItemService.update(id, orderItemDto);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id,
                                    @RequestBody OrderItemDto orderItemDto) {
        boolean result = orderItemService.delete(id, orderItemDto);
        return ResponseEntity.ok(result);
    }








}
