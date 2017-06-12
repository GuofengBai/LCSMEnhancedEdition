package cn.edu.nju.LCSMEnhancedEdition.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by baiguofeng on 2017/6/10.
 */
@Entity
@Table(name = "dispatch_bill")
public class DispatchBill {

    private int id;
    private int startBillId;
    private Date date;
    private String employeeA;
    private String employeeB;
    private String state;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStartBillId() {
        return startBillId;
    }

    public void setStartBillId(int startBillId) {
        this.startBillId = startBillId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmployeeA() {
        return employeeA;
    }

    public void setEmployeeA(String employeeA) {
        this.employeeA = employeeA;
    }

    public String getEmployeeB() {
        return employeeB;
    }

    public void setEmployeeB(String employeeB) {
        this.employeeB = employeeB;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
