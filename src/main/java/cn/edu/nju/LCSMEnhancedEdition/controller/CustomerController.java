package cn.edu.nju.LCSMEnhancedEdition.controller;

import cn.edu.nju.LCSMEnhancedEdition.entity.Customer;
import cn.edu.nju.LCSMEnhancedEdition.entity.StartBill;
import cn.edu.nju.LCSMEnhancedEdition.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by baiguofeng on 2017/6/11.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/home")
    public String homePage(Model model, HttpServletRequest request) {
        Customer customer = (Customer) request.getSession().getAttribute("customer");
        model.addAttribute("customer", customer);
        List<StartBill> list = customerService.getBills(customer.getId());
        model.addAttribute("billList", list);
        return "customer";
    }
}
