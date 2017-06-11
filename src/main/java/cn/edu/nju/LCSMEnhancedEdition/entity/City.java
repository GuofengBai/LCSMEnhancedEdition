package cn.edu.nju.LCSMEnhancedEdition.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by baiguofeng on 2017/6/10.
 */
@Entity
@Table(name = "city")
public class City {

    private String id;
    private String location;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
