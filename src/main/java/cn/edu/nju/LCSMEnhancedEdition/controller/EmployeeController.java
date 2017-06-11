package cn.edu.nju.LCSMEnhancedEdition.controller;

import cn.edu.nju.LCSMEnhancedEdition.entity.Employee;
import cn.edu.nju.LCSMEnhancedEdition.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by baiguofeng on 2017/6/11.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/home")
    public String homePage(Model model, HttpServletRequest request) {
        Employee employee = (Employee) request.getSession().getAttribute("employee");
        model.addAttribute("employee", employee);
        if (employee.getPositionType().equals("快递员")) {
            return "courier";
        } else if (employee.getPositionType().equals("营业厅业务员")) {
            return "hall_employee";
        } else if (employee.getPositionType().equals("中转中心业务员")) {
            return "city_employee";
        } else {
            return "driver";
        }
    }
}
