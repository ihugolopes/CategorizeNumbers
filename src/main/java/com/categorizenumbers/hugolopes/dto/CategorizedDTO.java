package com.categorizenumbers.hugolopes.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.categorizenumbers.hugolopes.enums.StateEnum;
import com.categorizenumbers.hugolopes.model.Customer;
import com.categorizenumbers.hugolopes.model.Phone;

import lombok.Builder;
import lombok.Data;

import static com.categorizenumbers.hugolopes.model.Phone.validatePhone;

@Builder
@Data
public class CategorizedDTO {

	private Integer id;
	private String name;
	private String country;
	private boolean state;
	private String countryCode;
	private String phoneNumber;


	public static List<CategorizedDTO> convertToCategorizedDTO(List<Customer> customers) {
		List<CategorizedDTO> categorizedDTOList = new ArrayList<>();

		for (Customer customer : customers) {
			Phone phone = Phone.builder().isValid(validatePhone(customer.getPhone()))
					.number(customer.getPhone().trim().substring(6)).state(findState(customer.getPhone())).build();

			categorizedDTOList.add(CategorizedDTO.builder().id(customer.getId()).name(customer.getName()).country(phone.getState().getName())
					.countryCode(findState(customer.getPhone()).getCode()).state(phone.isValid()).phoneNumber(phone.getNumber()).build());
		}
		
		return categorizedDTOList;
	}

	static StateEnum findState(String phone) {
		StateEnum stateEnum = null;
		for (StateEnum s : StateEnum.values()) {
			if (s.getCode().equals(phone.trim().substring(1, 4))) {
				stateEnum = s;
				break;
			}
		}
		return stateEnum;
	}

}
