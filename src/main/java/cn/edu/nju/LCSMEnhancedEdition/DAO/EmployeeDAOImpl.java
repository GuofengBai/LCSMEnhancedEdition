package cn.edu.nju.LCSMEnhancedEdition.DAO;

import cn.edu.nju.LCSMEnhancedEdition.entity.Employee;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by baiguofeng on 2017/6/10.
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public boolean login(String id, String password) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class).add(Restrictions.and(Restrictions.eq("id", id), Restrictions.eq("password", password)));
        return criteria.list().size() != 0;
    }

    public String register(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
        return employee.getId();
    }

    public Employee get(String id) {
        return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    public boolean update(Employee employee) {
        sessionFactory.getCurrentSession().saveOrUpdate(employee);
        return true;
    }

    public boolean delete(String id) {
        sessionFactory.getCurrentSession().delete(get(id));
        return true;
    }
}
