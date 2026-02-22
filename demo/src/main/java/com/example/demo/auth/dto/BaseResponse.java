package com.example.demo.auth.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public  class BaseResponse <T> {
    private int statusCode;
    private boolean message;
    private T data;
  


     


}
