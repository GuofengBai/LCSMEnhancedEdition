package cn.edu.nju.LCSMEnhancedEdition.DAO;

import cn.edu.nju.LCSMEnhancedEdition.entity.*;

import java.util.List;

/**
 * Created by baiguofeng on 2017/6/10.
 */
public interface BillDAO {

    int newStartBill(StartBill startBill);

    int newFromBill(FromBill fromBill);

    int newToBill(ToBill toBill);

    int newTransBill(TransBill transBill);

    int newDispatchBill(DispatchBill dispatchBill);

    StartBill getStartBill(int id);

    FromBill getFromBill(int id);

    ToBill getToBill(int id);

    TransBill getTransBill(int id);

    DispatchBill getDispatchBill(int id);

    boolean updateStartBill(StartBill startBill);

    boolean updateFromBill(FromBill fromBill);

    boolean updateToBill(ToBill toBill);

    boolean updateTransBill(TransBill transBill);

    boolean updateDispatchBill(DispatchBill dispatchBill);

    List<StartBill> getBillsOfTrans(int id);

}
