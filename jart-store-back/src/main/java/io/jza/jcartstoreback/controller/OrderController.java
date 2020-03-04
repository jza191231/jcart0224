package io.jza.jcartstoreback.controller;

import com.sun.org.apache.bcel.internal.generic.NEW;
import io.jza.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.jza.jcartstoreback.dto.out.OrderListOutDTO;
import io.jza.jcartstoreback.dto.out.OrderShowOutDTO;
import io.jza.jcartstoreback.dto.out.PageOutDTO;
import io.jza.jcartstoreback.po.Order;
import io.jza.jcartstoreback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/checkout")
    public Long checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                         @RequestAttribute Integer customerId) {
        Long orderId = orderService.checkout(orderCheckoutInDTO, customerId);
        return orderId;
    }

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getList(
            @RequestParam(required = false, defaultValue = "1") Integer pageNum,
            @RequestAttribute Integer customerId
    ) {
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId) {
        return null;
    }
}
