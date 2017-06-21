package cn.edu.nju.LCSMEnhancedEdition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by baiguofeng on 2017/6/21.
 */
@Controller
@RequestMapping("/manager")
public class ManagerController {

    @RequestMapping("/home")
    public String home() {
        return "manager_home";
    }

    @RequestMapping("/s_time_dim")
    public String s_time_dim() {
        return "s_time";
    }

    @RequestMapping("/s_hall_dim")
    public String s_hall_dim() {
        return "s_hall";
    }

    @RequestMapping("/s_cus_dim")
    public String s_cus_dim() {
        return "s_cus";
    }

    @RequestMapping("/s_product_dim")
    public String s_product_dim() {
        return "s_product";
    }

    @RequestMapping("/t_hall_dim")
    public String t_hall_dim() {
        return "t_hall";
    }
}
