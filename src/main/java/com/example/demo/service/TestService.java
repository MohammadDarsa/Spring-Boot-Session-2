package com.example.demo.service;

import com.example.demo.dto.OrderDto;
import com.example.demo.entity.Order;
import com.example.demo.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

        public String getSandwich() {
            return "Here is your sandwich";
        }

    public Boolean submitOrder(OrderDto orderDto) {
        Order order = new Order();
        order.setDescription(orderDto.getDescription());
        order.setPrice(orderDto.getPrice());
        testRepository.save(order);
        return true;
    }

    public OrderDto getOrder(Long id) {
        Order order = testRepository.findById(id).get();
        OrderDto orderDto = new OrderDto();
        orderDto.setDescription(order.getDescription());
        orderDto.setPrice(order.getPrice());
        return orderDto;
    }
}
