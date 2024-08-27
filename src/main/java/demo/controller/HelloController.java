package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {
    @GetMapping("/")
    public String sayHello() {
        return "index"; // Trả về trang HTML có tên "index.html" trong thư mục templates
    }
}