package cn.edu.nju.LCSMEnhancedEdition.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by baiguofeng on 2017/6/10.
 */
@Entity
@Table(name = "from_bill")
public class FromBill {

    private int id;
    private int transBillId;
    private Date date;
    private String from_hall;
    private String employeeId;

    @Id
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

    public String getFrom_hall() {
        return from_hall;
    }

    public void setFrom_hall(String from_hall) {
        this.from_hall = from_hall;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
