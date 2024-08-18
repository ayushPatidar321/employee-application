package com.example.demo.exception;

import com.example.demo.dto.ApiResponse;
import com.example.demo.util.ServiceResponseCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.example.demo.util.ServiceUtil.createApiResponse;


@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ServiceException.class)
    public ApiResponse handleServiceException(ServiceException serviceException) {
        return createApiResponse(ServiceResponseCodeEnum._GENERAL_ERROR.getCode(),ServiceResponseCodeEnum._GENERAL_ERROR.getStatus(), ServiceResponseCodeEnum._GENERAL_ERROR.getDescription(), StringUtils.EMPTY);
    }


}