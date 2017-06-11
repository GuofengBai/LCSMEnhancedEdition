package cn.edu.nju.LCSMEnhancedEdition.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by baiguofeng on 2017/6/10.
 */
@Entity
@Table(name = "customer")
public class Customer {

    private String id;
    private String hallId;
    private String name;
    private String password;
    private String location;
    private String gender;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHallId() {
        return hallId;
    }

    public void setHallId(String hallId) {
        this.hallId = hallId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
