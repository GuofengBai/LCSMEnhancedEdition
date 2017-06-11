package cn.edu.nju.LCSMEnhancedEdition.DAO;

import cn.edu.nju.LCSMEnhancedEdition.entity.Customer;
import cn.edu.nju.LCSMEnhancedEdition.entity.Employee;
import cn.edu.nju.LCSMEnhancedEdition.entity.StartBill;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by baiguofeng on 2017/6/10.
 */
@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public boolean login(String id, String password) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class).add(Restrictions.and(Restrictions.eq("id", id), Restrictions.eq("password", password)));
        return criteria.list().size() != 0;
    }

    public String register(Customer customer) {
        sessionFactory.getCurrentSession().save(customer);
        return customer.getId();
    }

    public Customer get(String id) {
        return (Customer)sessionFactory.getCurrentSession().get(Customer.class, id);
    }

    public boolean update(Customer customer) {
        sessionFactory.getCurrentSession().saveOrUpdate(customer);
        return true;
    }

    public boolean delete(String id) {
        sessionFactory.getCurrentSession().delete(get(id));
        return true;
    }

    public List<StartBill> getBills(String id) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(StartBill.class).add(Restrictions.eq("customerId", id));
        return criteria.list();
    }
}
