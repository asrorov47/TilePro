package com.universal.tilepro.service;

import com.universal.tilepro.dto.AddressDto;
import com.universal.tilepro.exception.BadRequest;
import com.universal.tilepro.model.Address;
import com.universal.tilepro.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;


    public AddressDto create(AddressDto addressDto) {
        Address address = new Address();
        convertDtoToEntity(addressDto,address);




    return addressDto;
    }

    public AddressDto get(Integer id) {
        Address address = getEntity(id);
        AddressDto addressDto = new AddressDto();
        convertEntityToDto(address,addressDto);
    return addressDto;
    }



    public boolean update(Integer id, AddressDto addressDto) {
    Address update = getEntity(id);
    convertDtoToEntity(addressDto, update);
        return true;
    }



    public boolean delete(Integer id, AddressDto addressDto) {
        Address address = getEntity(id);
        addressRepository.delete(address);
        return true;
    }

    private Address getEntity(Integer id) {
        Optional<Address> optional = addressRepository.findById(id);
        if (optional.isEmpty()){
            throw  new BadRequest("Address not found");
        }
        return optional.get();
    }


    private void convertDtoToEntity(AddressDto dto, Address entity) {
        dto.setDistrict(entity.getDistrict());
        dto.setDistrict(entity.getDistrict());
        dto.setHome(entity.getHome());
        dto.setId(entity.getId());
        dto.setRegion(entity.getRegion());
        dto.setStreet(entity.getStreet());
    }


    private void convertEntityToDto(Address entity, AddressDto dto) {
    entity.setStreet(dto.getStreet());
    entity.setCity(dto.getCity());
    entity.setDistrict(dto.getDistrict());
    entity.setRegion(dto.getRegion());
    entity.setHome(dto.getHome());
    entity.setId(dto.getId());
    }


}
