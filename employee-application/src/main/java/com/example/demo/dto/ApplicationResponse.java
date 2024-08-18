package com.example.demo.dto;

import com.example.demo.model.Employee;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class ApplicationResponse implements Serializable{
	private static final long serialVersionUID = 1L;
	private MsgHeader msgHeader = new MsgHeader();
	private MsgBody msgBody = new MsgBody();

	@Data
	@NoArgsConstructor
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class MsgHeader implements Serializable{
		private static final long serialVersionUID = 1L;
		private int id;
		private String responseCode;
		private String responseStatus;
		private String responseDesc;
	}
	
	@Data
	@NoArgsConstructor
	public static class MsgBody implements Serializable{
		private static final long serialVersionUID = 1L;
		private Employee empApp;

	}
}
