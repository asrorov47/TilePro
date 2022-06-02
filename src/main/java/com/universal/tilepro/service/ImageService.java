package com.universal.tilepro.service;

import com.universal.tilepro.dto.ImageDto;
import com.universal.tilepro.exception.BadRequest;
import com.universal.tilepro.model.Address;
import com.universal.tilepro.model.Image;
import com.universal.tilepro.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;


    public ImageDto create(ImageDto imageDto) {
        Image image = new Image();
        convertDtoToEntity(imageDto, image);

    return imageDto;
    }

    public ImageDto get(Integer id) {
        Image image = getEntity(id);
        ImageDto imageDto = new ImageDto();
        convertEntityToDto(image, imageDto);
    return imageDto;
    }

    public boolean update(Integer id, ImageDto imageDto) {
   Image update = getEntity(id);
   convertDtoToEntity(imageDto, update);
   imageRepository.save(update)
    return true;
    }

    public boolean delete(Integer id, ImageDto imageDto) {
   Image image = getEntity(id);
   imageRepository.delete(image);
    return true;
    }

    private void convertDtoToEntity(ImageDto dto, Image entity) {
        entity.setId(dto.getId());
        entity.setPath(dto.getPath());
        entity.setSize(dto.getSize());
        entity.setToken(dto.getToken());
        entity.setType(dto.getType());
    }


    private void convertEntityToDto(Image entity, ImageDto dto) {
        dto.setId(entity.getId());
        dto.setPath(entity.getPath());
        dto.setSize(entity.getSize());
        dto.setToken(entity.getToken());
        dto.setType(entity.getType());
    }

    private Image getEntity(Integer id) {
        Optional<Image> optional = imageRepository.findById(id);
        if (optional.isEmpty()){
            throw  new BadRequest("Image not found");
        }
        return optional.get();
    }


}
