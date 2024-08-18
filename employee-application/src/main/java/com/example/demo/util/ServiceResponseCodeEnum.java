package com.example.demo.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ServiceResponseCodeEnum {
	
	_SUCCESS("SUCCESS", "0000", "Communication is successful."),
	_ERROR("ERROR", "9999", "Record Not Found "),
	_GENERAL_ERROR("ERROR", "7777", "Exception during Database call"),
	_SERVER_ERROR("ERROR", "5555", "Exception during Third Party call");
	
	private final String status;
	private final String code;
	private final String description;
	
	public static ServiceResponseCodeEnum valueOfStatus(String status, String code) {
		for (ServiceResponseCodeEnum m : values()) {
			if (m.getStatus().equalsIgnoreCase(status) || m.getCode().equalsIgnoreCase(code)) {
				return m;
			}
		}
		return ServiceResponseCodeEnum._ERROR;
	}
	
}