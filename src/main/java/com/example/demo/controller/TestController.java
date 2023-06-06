package com.example.demo.controller;

import com.example.demo.dto.OrderDto;
import com.example.demo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostRemove;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @PostMapping("/submit-order")
    public Boolean getSandwich(@RequestBody OrderDto orderDto) {
        return testService.submitOrder(orderDto);
    }

    @GetMapping("/get-order/{id}")
    public OrderDto getOrder(@PathVariable Long id) {
        return testService.getOrder(id);
    }
}
