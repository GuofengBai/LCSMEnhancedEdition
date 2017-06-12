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
@Table(name = "to_bill")
public class ToBill {

    private int id;
    private int transBillId;
    private Date date;
    private String to_hall;
    private String employeeId;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTransBillId() {
        return transBillId;
    }

    public void setTransBillId(int transBillId) {
        this.transBillId = transBillId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTo_hall() {
        return to_hall;
    }

    public void setTo_hall(String to_hall) {
        this.to_hall = to_hall;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
