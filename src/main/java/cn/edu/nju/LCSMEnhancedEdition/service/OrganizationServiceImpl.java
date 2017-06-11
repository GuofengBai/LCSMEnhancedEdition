package cn.edu.nju.LCSMEnhancedEdition.service;

import cn.edu.nju.LCSMEnhancedEdition.DAO.OrganizationDAO;
import cn.edu.nju.LCSMEnhancedEdition.entity.City;
import cn.edu.nju.LCSMEnhancedEdition.entity.Hall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by baiguofeng on 2017/6/10.
 */
@Service("OrganizationService")
@Transactional
public class OrganizationServiceImpl implements OrganizationService{

    @Autowired
    private OrganizationDAO organizationDAO;

    public boolean newCity(City city) {
        return organizationDAO.newCity(city);
    }

    public boolean newHall(Hall hall) {
        return organizationDAO.newHall(hall);
    }

    public City getCity(String id) {
        return organizationDAO.getCity(id);
    }

    public Hall getHall(String id) {
        return organizationDAO.getHall(id);
    }

    public boolean updateCity(City city) {
        return organizationDAO.updateCity(city);
    }

    public boolean updateHall(Hall hall) {
        return organizationDAO.updateHall(hall);
    }
}
