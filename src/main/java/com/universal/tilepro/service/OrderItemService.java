package com.universal.tilepro.service;

import com.universal.tilepro.dto.OrderItemDto;
import com.universal.tilepro.exception.BadRequest;
import com.universal.tilepro.model.OrderItem;
import com.universal.tilepro.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    public OrderItemDto create(OrderItemDto orderItemDto) {
    OrderItem orderItem = new OrderItem();
    convertDtoToEntity(orderItemDto, orderItem);
    orderItem.setStatus(true);
    orderItemRepository.save(orderItem);
    orderItemDto.setId(orderItem.getId());
        return null;
    }

    public OrderItemDto get(Integer id) {
        OrderItem orderItem = getEntity(id);
        OrderItemDto orderItemDto = new OrderItemDto();
        convertEntityToDto(orderItem,orderItemDto);
    return orderItemDto;
    }

    public boolean update(Integer id, OrderItemDto orderItemDto) {
    OrderItem update = getEntity(id);
    convertDtoToEntity(orderItemDto,update);
    orderItemRepository.save(update);
        return true;
    }

    public boolean delete(Integer id, OrderItemDto orderItemDto) {
    OrderItem orderItem = getEntity(id);
    orderItemRepository.delete(orderItem);
        return true;
    }

    private void convertDtoToEntity(OrderItemDto dto, OrderItem entity) {
        entity.setId(dto.getId());
        entity.setOrder(dto.getOrder());
        entity.setProduct(dto.getProduct());
        entity.setQuantity(dto.getQuantity());
    }


    private void convertEntityToDto(OrderItem entity, OrderItemDto dto) {
        dto.setId(entity.getId());
        dto.setOrder(entity.getOrder());
        dto.setProduct(entity.getProduct());
        dto.setQuantity(entity.getQuantity());
    }


    private OrderItem getEntity(Integer id) {
        Optional<OrderItem> optional = orderItemRepository.findById(id);
        if (optional.isEmpty()){
            throw  new BadRequest("Address not found");
        }
        return optional.get();
    }

}
