package com.universal.tilepro.service;

import com.universal.tilepro.dto.OrderDto;
import com.universal.tilepro.exception.BadRequest;
import com.universal.tilepro.model.Order;
import com.universal.tilepro.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderDto create(OrderDto orderDto) {
        Order order = new Order();
        convertDtoToEntity(orderDto, order);

    return null;
    }

    public OrderDto get(Integer id) {
        Order order = getEntity(id);
        OrderDto orderDto = new OrderDto();
        convertEntityToDto(order, orderDto);
    return orderDto;
    }

    public boolean update(Integer id, OrderDto orderDto) {
   Order update = getEntity(id);
    convertEntityToDto(update, orderDto);
    orderRepository.save(update);
        return true;
    }

    public boolean delete(Integer id, OrderDto orderDto) {
   Order order = getEntity(id);
   orderRepository.delete(order);
    return true;
    }


    private void convertDtoToEntity(OrderDto dto, Order entity) {
        entity.setId(dto.getId());
        entity.setAddress(dto.getAddress());
        entity.setContact(dto.getContact());
        entity.setRequirment(dto.getRequirment());
        entity.setTotalPayment(dto.getTotalPayment());
        entity.setUser(dto.getUser());
    }


    private void convertEntityToDto(Order entity, OrderDto dto) {
        dto.setId(entity.getId());
        dto.setAddress(entity.getAddress());
        dto.setContact(entity.getContact());
        dto.setRequirment(entity.getRequirment());
        dto.setTotalPayment(entity.getTotalPayment());
        dto.setUser(entity.getUser());
    }


    private Order getEntity(Integer id) {
        Optional<Order> optional = orderRepository.findById(id);
        if (optional.isEmpty()){
            throw  new BadRequest("Address not found");
        }
        return optional.get();
    }

}
