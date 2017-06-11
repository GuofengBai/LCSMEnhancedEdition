package cn.edu.nju.LCSMEnhancedEdition.DAO;

import cn.edu.nju.LCSMEnhancedEdition.entity.City;
import cn.edu.nju.LCSMEnhancedEdition.entity.Hall;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by baiguofeng on 2017/6/10.
 */
@Repository
public class OrganizationDAOImpl implements OrganizationDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public boolean newCity(City city) {
        Hall hall = new Hall();
        hall.setCityId(city.getId());
        hall.setId(city.getId()+"本部");
        hall.setLocation("默认该城市中转中心");
        sessionFactory.getCurrentSession().save(city);
        sessionFactory.getCurrentSession().save(hall);
        return true;
    }

    public boolean newHall(Hall hall) {
        sessionFactory.getCurrentSession().save(hall);
        return true;
    }

    public City getCity(String id) {
        return (City)sessionFactory.getCurrentSession().get(City.class, id);
    }

    public Hall getHall(String id) {
        return (Hall)sessionFactory.getCurrentSession().get(Hall.class, id);
    }

    public boolean updateCity(City city) {
        sessionFactory.getCurrentSession().saveOrUpdate(city);
        return true;
    }

    public boolean updateHall(Hall hall) {
        sessionFactory.getCurrentSession().saveOrUpdate(hall);
        return true;
    }
}
