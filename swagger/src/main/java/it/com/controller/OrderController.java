package it.com.controller;

import it.com.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @GetMapping("/orderAdd")
    public Boolean orderAdd(Integer id,String name){
        System.out.println("jskldjfskljfd");
        System.out.println();
        Boolean results=orderService.orderAdd(id,name);
        return results;
    }
}
