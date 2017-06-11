package cn.edu.nju.LCSMEnhancedEdition.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by baiguofeng on 2017/6/10.
 */
@Entity
@Table(name="employee")
public class Employee {

    private String id;
    private String name;
    private String hallId;
    private String positionType;
    private String password;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHallId() {
        return hallId;
    }

    public void setHallId(String hallId) {
        this.hallId = hallId;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
