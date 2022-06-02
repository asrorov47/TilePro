package com.universal.tilepro.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalException {

    @org.springframework.web.bind.annotation.ExceptionHandler
    public ResponseEntity<?> exception(BadRequest a){
        return ResponseEntity.badRequest().body(a.getMessage());
    }


}
