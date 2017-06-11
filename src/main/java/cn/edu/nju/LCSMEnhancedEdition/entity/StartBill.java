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
@Table(name = "start_bill")
public class StartBill {

    private int id;
    private String customerId;
    private Date date;
    private String from_hall;
    private String to_hall;
    private String location;
    private Double weight;
    private String bigType;
    private String smallType;
    private Double money;
    private String transType;
    private String employeeId;
    private String progress;
    private int transBill1;
    private int transBill2;
    private int transBill3;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getBigType() {
        return bigType;
    }

    public void setBigType(String bigType) {
        this.bigType = bigType;
    }

    public String getSmallType() {
        return smallType;
    }

    public void setSmallType(String smallType) {
        this.smallType = smallType;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public int getTransBill1() {
        return transBill1;
    }

    public void setTransBill1(int transBill1) {
        this.transBill1 = transBill1;
    }

    public int getTransBill2() {
        return transBill2;
    }

    public void setTransBill2(int transBill2) {
        this.transBill2 = transBill2;
    }

    public int getTransBill3() {
        return transBill3;
    }

    public void setTransBill3(int transBill3) {
        this.transBill3 = transBill3;
    }
}
