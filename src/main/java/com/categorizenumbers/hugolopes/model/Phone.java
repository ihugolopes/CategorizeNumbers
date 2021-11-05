package com.categorizenumbers.hugolopes.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.categorizenumbers.hugolopes.enums.StateEnum;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Phone {

	private boolean isValid;
	private StateEnum state;
	private String number;

	public static boolean validatePhone(String phone) {

		String[] arrayPatterns = { "\\(237\\)\\ ?[2368]\\d{7,8}$", "\\(251\\)\\ ?[1-59]\\d{8}$",
				"\\(212\\)\\ ?[5-9]\\d{8}$", "\\(258\\)\\ ?[28]\\d{7,8}$", "\\(256\\)\\ ?\\d{9}$" };

		String phoneFormatted = phone.trim();

		for (String pattern : arrayPatterns) {
			Pattern p = Pattern.compile(pattern.trim());
			Matcher m = p.matcher(phoneFormatted);
			if (m.matches()) return true;
		}

		return false;

	}

}
