package cn.edu.nju.LCSMEnhancedEdition.service;

import cn.edu.nju.LCSMEnhancedEdition.DAO.CustomerDAO;
import cn.edu.nju.LCSMEnhancedEdition.entity.Customer;
import cn.edu.nju.LCSMEnhancedEdition.entity.StartBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by baiguofeng on 2017/6/10.
 */
@Service("CustomerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDAO customerDAO;

    public boolean login(String id, String password) {
        return customerDAO.login(id, password);
    }

    public String register(Customer customer) {
        return customerDAO.register(customer);
    }

    public Customer get(String id) {
        return customerDAO.get(id);
    }

    public boolean update(Customer customer) {
        return customerDAO.update(customer);
    }

    public boolean delete(String id) {
        return customerDAO.delete(id);
    }

    public List<StartBill> getBills(String id) {
        return customerDAO.getBills(id);
    }
}
