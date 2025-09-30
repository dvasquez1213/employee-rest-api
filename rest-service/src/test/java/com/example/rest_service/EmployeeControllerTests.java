package com.example.rest_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.hasSize;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllEmployees() throws Exception {
        // Perform a GET request to /employees
        mockMvc.perform(get("/employees"))

                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)));
    }
}