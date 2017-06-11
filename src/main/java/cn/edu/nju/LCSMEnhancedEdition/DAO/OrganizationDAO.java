package cn.edu.nju.LCSMEnhancedEdition.DAO;

import cn.edu.nju.LCSMEnhancedEdition.entity.City;
import cn.edu.nju.LCSMEnhancedEdition.entity.Hall;

/**
 * Created by baiguofeng on 2017/6/10.
 */
public interface OrganizationDAO {

    boolean newCity(City city);

    boolean newHall(Hall hall);

    City getCity(String id);

    Hall getHall(String id);

    boolean updateCity(City city);

    boolean updateHall(Hall hall);

}
