package cn.edu.nju.LCSMEnhancedEdition.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by baiguofeng on 2017/6/10.
 */
@Entity
@Table(name = "hall")
public class Hall {

    private String id;
    private String cityId;
    private String location;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
