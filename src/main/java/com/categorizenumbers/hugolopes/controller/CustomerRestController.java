package com.categorizenumbers.hugolopes.controller;

import com.categorizenumbers.hugolopes.dto.CategorizedDTO;
import com.categorizenumbers.hugolopes.model.Customer;
import com.categorizenumbers.hugolopes.service.interfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/api/customer")
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;

	@GetMapping
    public ResponseEntity<List<CategorizedDTO>> findAll() {
		try {
			List<CategorizedDTO> result = CategorizedDTO.convertToCategorizedDTO(customerService.findAll());
			if (result == null) return ResponseEntity.notFound().build();
			return ResponseEntity.ok(result);
		} catch (Exception ex) {
			return ResponseEntity.badRequest().build();
		}
    }

}
