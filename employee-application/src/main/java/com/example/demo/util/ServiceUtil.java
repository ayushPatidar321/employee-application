package com.example.demo.util;

import com.example.demo.dto.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;


import static org.springframework.util.StringUtils.hasText;

@Slf4j
public class ServiceUtil {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> ApiResponse createApiResponse(String statusCode, String statusDesc,String status, T data) {
        return ApiResponse.builder()
                .statusCode(statusCode)
                .status(status)
                .statusDesc(statusDesc)
                .data(data)
                .build();
    }

    public static String getJsonString(Object obj) {
        String response = StringUtils.EMPTY;
        try {
            response = mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error("JSON Exception: {} ", e.getMessage());
        }
        return response;
    }


}