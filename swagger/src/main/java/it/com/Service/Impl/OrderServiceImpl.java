package it.com.Service.Impl;

import it.com.Service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class OrderServiceImpl implements OrderService {
    public Boolean orderAdd(Integer id, String name) {
        if (!StringUtils.isEmpty(name)){
            if (!StringUtils.isEmpty(id)){
                System.out.println("id = " + id);
                System.out.println("name = " + name);
                return true;
            }
            return false;
        }

        return false;
    }
}
