package cn.edu.nju.LCSMEnhancedEdition.controller;

import cn.edu.nju.LCSMEnhancedEdition.entity.Customer;
import cn.edu.nju.LCSMEnhancedEdition.entity.Employee;
import cn.edu.nju.LCSMEnhancedEdition.service.CustomerService;
import cn.edu.nju.LCSMEnhancedEdition.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

;

/**
 * Created by baiguofeng on 2017/3/8.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/")
    public String indexPage() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Model model, String id, String password, String type, HttpServletRequest request) {
        if (type.equals("manager")) {
            if (id.equals("manager") && password.equals("admin")) {
                return "redirect:/manager/home";
            }
        } else if (type.equals("employee")) {
            if (employeeService.login(id, password)) {
                Employee employee = employeeService.get(id);
                request.getSession().setAttribute("employee", employee);
                return "redirect:/employee/home";
            }
        } else {
            if (customerService.login(id, password)) {
                request.getSession().setAttribute("customer", customerService.get(id));
                return "redirect:/customer/home";
            }
        }
        model.addAttribute("title", "登录错误");
        model.addAttribute("description", "请重新登录");
        model.addAttribute("link", "/login");
        model.addAttribute("linkText", "重新登录");
        return "warning";
    }

    @RequestMapping(value = "/employee/register", method = RequestMethod.GET)
    public String employeeRegisterPage() {
        return "employee_register";
    }

    @RequestMapping(value = "/employee/register", method = RequestMethod.POST)
    public String employeeRegister(String id, String name, String password, String positionType, String hallId) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setPassword(password);
        employee.setPositionType(positionType);
        employee.setHallId(hallId);
        employeeService.register(employee);
        return "redirect:/login";
    }

    @RequestMapping(value = "/customer/register", method = RequestMethod.GET)
    public String customerRegisterPage() {
        return "customer_register";
    }

    @RequestMapping(value = "/customer/register", method = RequestMethod.POST)
    public String customerRegister(String id, String name, String gender, String password, String location, String hallId) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(name);
        customer.setGender(gender);
        customer.setPassword(password);
        customer.setLocation(location);
        customer.setHallId(hallId);
        customerService.register(customer);
        return "redirect:/login";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute("customer");
        request.getSession().removeAttribute("employee");
        return "redirect:/login";
    }

}
