package com.categorizenumbers.hugolopes.model;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
public class PhoneTest {

    @Test
    void mustBeValid() {
        assertEquals(true, Phone.validatePhone("(237) 697151594"));
    }

    @Test
    void mustBeInvalid() {
        assertEquals(false, Phone.validatePhone("(233) 6047989253"));
    }



}
