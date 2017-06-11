package cn.edu.nju.LCSMEnhancedEdition.service;

import cn.edu.nju.LCSMEnhancedEdition.entity.Customer;
import cn.edu.nju.LCSMEnhancedEdition.entity.StartBill;

import java.util.List;

/**
 * Created by baiguofeng on 2017/6/10.
 */
public interface CustomerService {

    boolean login(String id, String password);

    String register(Customer customer);

    Customer get(String id);

    boolean update(Customer customer);

    boolean delete(String id);

    List<StartBill> getBills(String id);

}
