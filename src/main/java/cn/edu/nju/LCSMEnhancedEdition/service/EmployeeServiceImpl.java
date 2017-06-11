package cn.edu.nju.LCSMEnhancedEdition.service;

import cn.edu.nju.LCSMEnhancedEdition.DAO.EmployeeDAO;
import cn.edu.nju.LCSMEnhancedEdition.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by baiguofeng on 2017/6/10.
 */
@Service("EmployeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    public boolean login(String id, String password) {
        return employeeDAO.login(id, password);
    }

    public String register(Employee employee) {
        return employeeDAO.register(employee);
    }

    public Employee get(String id) {
        return employeeDAO.get(id);
    }

    public boolean update(Employee employee) {
        return employeeDAO.update(employee);
    }

    public boolean delete(String id) {
        return employeeDAO.delete(id);
    }
}
