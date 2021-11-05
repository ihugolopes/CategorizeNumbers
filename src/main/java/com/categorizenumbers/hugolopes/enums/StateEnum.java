package com.categorizenumbers.hugolopes.enums;

public enum StateEnum {
	
	CAMEROON("237", "Cameroon"),
	ETHIOPIA("251", "Ethiopia"),
	MOROCCO("212", "Morocco"),
	MOZAMBIQUE("258", "Mozambique"),
	UGANDA("256", "Uganda");
	
	private final String code;
	private final String name;
	
	StateEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
}
	
	
