package cn.edu.nju.LCSMEnhancedEdition.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by baiguofeng on 2017/6/10.
 */
@Entity
@Table(name = "trans_bill")
public class TransBill {

    private int id;
    private Date date;
    private String from_hall;
    private String to_hall;
    private Double money;
    private String type;
    private String employeeId;
    private Double distance;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFrom_hall() {
        return from_hall;
    }

    public void setFrom_hall(String from_hall) {
        this.from_hall = from_hall;
    }

    public String getTo_hall() {
        return to_hall;
    }

    public void setTo_hall(String to_hall) {
        this.to_hall = to_hall;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}
