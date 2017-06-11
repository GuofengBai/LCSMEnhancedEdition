package cn.edu.nju.LCSMEnhancedEdition.DAO;

import cn.edu.nju.LCSMEnhancedEdition.entity.Employee;

/**
 * Created by baiguofeng on 2017/6/10.
 */
public interface EmployeeDAO {

    boolean login(String id, String password);

    String register(Employee employee);

    Employee get(String id);

    boolean update(Employee employee);

    boolean delete(String id);

}
