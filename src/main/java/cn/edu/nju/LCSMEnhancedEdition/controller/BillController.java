package cn.edu.nju.LCSMEnhancedEdition.controller;

import cn.edu.nju.LCSMEnhancedEdition.entity.*;
import cn.edu.nju.LCSMEnhancedEdition.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;

/**
 * Created by baiguofeng on 2017/6/11.
 */
@Controller
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillService billService;

    @RequestMapping(value = "/startBill", method = RequestMethod.GET)
    public String StartBill() {
        return "startBill";
    }

    @RequestMapping(value = "/startBill", method = RequestMethod.POST)
    public String newStartBill(String customerId, String from_hall, String to_hall, String location, String weight, String bigType, String smallType, String money, String transType, HttpServletRequest request) {
        Employee employee = (Employee) request.getSession().getAttribute("employee");
        StartBill startBill = new StartBill();
        startBill.setCustomerId(customerId);
        startBill.setDate(new Date(System.currentTimeMillis()));
        startBill.setEmployeeId(employee.getId());
        startBill.setFrom_hall(from_hall);
        startBill.setTo_hall(to_hall);
        startBill.setLocation(location);
        startBill.setWeight(Double.parseDouble(weight));
        startBill.setBigType(bigType);
        startBill.setSmallType(smallType);
        startBill.setMoney(Double.parseDouble(money));
        startBill.setTransType(transType);
        startBill.setProgress("已揽件");
        billService.newStartBill(startBill);
        return "redirect:/bill/startBill";
    }

    @RequestMapping(value = "/transBill", method = RequestMethod.GET)
    public String TransBill() {
        return "transBill";
    }

    @RequestMapping(value = "/transBill", method = RequestMethod.POST)
    @ResponseBody
    public String newTransBill(String array, String from_hall, String to_hall, String money, String transType, String distance, HttpServletRequest request) {
        TransBill transBill = new TransBill();
        transBill.setDate(new Date(System.currentTimeMillis()));
        transBill.setFrom_hall(from_hall);
        transBill.setTo_hall(to_hall);
        transBill.setMoney(Double.parseDouble(money));
        transBill.setType(transType);
        transBill.setDistance(Double.parseDouble(distance));
        Employee employee = (Employee) request.getSession().getAttribute("employee");
        transBill.setEmployeeId(employee.getId());
        String[] list = array.split(",");
        int transId = billService.newTransBill(transBill, list);
        return String.valueOf(transId);
    }

    @RequestMapping(value = "/fromBill", method = RequestMethod.GET)
    public String FromBill() {
        return "fromBill";
    }

    @RequestMapping(value = "fromBill", method = RequestMethod.POST)
    public String newFromBill(String transBillId, HttpServletRequest request) {
        FromBill fromBill = new FromBill();
        fromBill.setDate(new Date(System.currentTimeMillis()));
        Employee employee = (Employee) request.getSession().getAttribute("employee");
        fromBill.setFrom_hall(employee.getHallId());
        fromBill.setTransBillId(Integer.parseInt(transBillId));
        billService.newFromBill(fromBill);
        return "redirect:/bill/fromBill";
    }

    @RequestMapping(value = "/toBill", method = RequestMethod.GET)
    public String ToBill() {
        return "toBill";
    }

    @RequestMapping(value = "toBill", method = RequestMethod.POST)
    public String newToBill(String transBillId, HttpServletRequest request) {
        ToBill toBill = new ToBill();
        toBill.setDate(new Date(System.currentTimeMillis()));
        Employee employee = (Employee) request.getSession().getAttribute("employee");
        toBill.setTo_hall(employee.getHallId());
        toBill.setTransBillId(Integer.parseInt(transBillId));
        billService.newToBill(toBill);
        return "redirect:/bill/toBill";
    }

    @RequestMapping(value = "/dispatchBill", method = RequestMethod.GET)
    public String DispatchBill() {
        return "dispatchBill";
    }

    @RequestMapping(value = "/dispatchBill", method = RequestMethod.POST)
    public String newDispatchBill(String startBillId, HttpServletRequest request) {
        DispatchBill dispatchBill = new DispatchBill();
        dispatchBill.setState("未确认");
        dispatchBill.setDate(new Date(System.currentTimeMillis()));
        dispatchBill.setStartBillId(Integer.parseInt(startBillId));
        Employee employee = (Employee) request.getSession().getAttribute("employee");
        dispatchBill.setEmployeeA(employee.getId());
        billService.newDispatchBill(dispatchBill);
        return "redirect:/bill/dispatchBill";
    }

    @RequestMapping(value = "/dispatchAssure", method = RequestMethod.GET)
    public String assurePage() {
        return "dispatchAssure";
    }

    @RequestMapping(value = "/dispatchAssure", method = RequestMethod.POST)
    public String assure(String dispatchBillId, HttpServletRequest request) {
        Employee employee = (Employee) request.getSession().getAttribute("employee");
        billService.assureDispatchBill(Integer.parseInt(dispatchBillId), employee.getId());
        return "redirect:/bill/dispatchAssure";
    }
}
