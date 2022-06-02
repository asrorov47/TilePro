package com.universal.tilepro.Controller;

import com.universal.tilepro.dto.OrderDto;
import com.universal.tilepro.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    //TODO: @Valid yuq ishlamayapti

    @Autowired
    private OrderService orderService;


    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody OrderDto orderDto) {
        OrderDto result = orderService.create(orderService);
        return ResponseEntity.ok(result);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id) {
        OrderDto result = orderService.get(id);
        return ResponseEntity.ok(result);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody OrderDto orderDto) {
        boolean result = orderService.update(id, orderService);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id,
                                    @RequestBody OrderDto orderDto) {
        boolean result = orderService.delete(id, orderDto);
        return ResponseEntity.ok(result);
    }


}
