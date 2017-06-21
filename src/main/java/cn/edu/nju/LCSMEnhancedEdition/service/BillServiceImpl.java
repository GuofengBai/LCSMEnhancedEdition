package cn.edu.nju.LCSMEnhancedEdition.service;

import cn.edu.nju.LCSMEnhancedEdition.DAO.BillDAO;
import cn.edu.nju.LCSMEnhancedEdition.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by baiguofeng on 2017/6/10.
 */
@Service("BillService")
@Transactional
public class BillServiceImpl implements BillService{

    @Autowired
    private BillDAO billDAO;

    public int newStartBill(StartBill startBill) {
        return billDAO.newStartBill(startBill);
    }

    public int newFromBill(FromBill fromBill) {
        TransBill transBill = billDAO.getTransBill(fromBill.getTransBillId());
        String progress;
        if (transBill.getFrom_hall().endsWith("本部")) {
            if (transBill.getTo_hall().endsWith("本部")) {
                progress = "从本地中转中心发往目的地中转中心";
            } else {
                progress = "从目的地中转中心发往目的地营业厅";
            }
        } else {
            if (transBill.getTo_hall().endsWith("本部")) {
                progress = "从本地营业厅发往本地中转中心";
            } else {
                progress = "本地直发，发往目的地营业厅";
            }
        }
        List<StartBill> bills = getBillsOfTrans(transBill.getId());
        for (StartBill startBill : bills) {
            startBill.setProgress(progress);
            billDAO.updateStartBill(startBill);
        }
        return billDAO.newFromBill(fromBill);
    }

    public int newToBill(ToBill toBill) {
        TransBill transBill = billDAO.getTransBill(toBill.getTransBillId());
        String progress;
        if (transBill.getFrom_hall().endsWith("本部")) {
            if (transBill.getTo_hall().endsWith("本部")) {
                progress = "到达目的地中转中心";
            } else {
                progress = "到达目的地营业厅";
            }
        } else {
            if (transBill.getTo_hall().endsWith("本部")) {
                progress = "到达本地中转中心";
            } else {
                progress = "本地直发，到达目的地营业厅";
            }
        }
        List<StartBill> bills = getBillsOfTrans(transBill.getId());
        for (StartBill startBill : bills) {
            startBill.setProgress(progress);
            billDAO.updateStartBill(startBill);
        }
        return billDAO.newToBill(toBill);
    }

    public int newTransBill(TransBill transBill, String[] bills) {
        int transId = billDAO.newTransBill(transBill);
        int order;
        int number = 0;
        double weight = 0;
        if (transBill.getFrom_hall().endsWith("本部")) {
            if (transBill.getTo_hall().endsWith("本部")) {
                order = 2;
            } else {
                order = 3;
            }
        } else {
            order = 1;
        }
        for (String item : bills) {
            StartBill startBill = billDAO.getStartBill(Integer.parseInt(item));
            if (order == 1) {
                startBill.setTransBill1(transId);
            } else if (order == 2) {
                startBill.setTransBill2(transId);
            } else {
                startBill.setTransBill3(transId);
            }
            weight += startBill.getWeight();
            billDAO.updateStartBill(startBill);
        }
        number = bills.length;
        transBill.setNumber(number);
        transBill.setWeight(weight);
        transBill.setId(transId);
        billDAO.updateTransBill(transBill);
        return transId;
    }

    public int newDispatchBill(DispatchBill dispatchBill) {
        StartBill startBill = billDAO.getStartBill(dispatchBill.getStartBillId());
        startBill.setProgress("派送中");
        billDAO.updateStartBill(startBill);
        return billDAO.newDispatchBill(dispatchBill);
    }

    public StartBill getStartBill(int id) {
        return billDAO.getStartBill(id);
    }

    public FromBill getFromBill(int id) {
        return billDAO.getFromBill(id);
    }

    public ToBill getToBill(int id) {
        return billDAO.getToBill(id);
    }

    public TransBill getTransBill(int id) {
        return billDAO.getTransBill(id);
    }

    public DispatchBill getDispatchBill(int id) {
        return billDAO.getDispatchBill(id);
    }

    public boolean updateStartBill(StartBill startBill) {
        return billDAO.updateStartBill(startBill);
    }

    public boolean updateFromBill(FromBill fromBill) {
        return billDAO.updateFromBill(fromBill);
    }

    public boolean updateToBill(ToBill toBill) {
        return billDAO.updateToBill(toBill);
    }

    public boolean updateTransBill(TransBill transBill) {
        return billDAO.updateTransBill(transBill);
    }

    public boolean updateDispatchBill(DispatchBill dispatchBill) {
        return billDAO.updateDispatchBill(dispatchBill);
    }

    public List<StartBill> getBillsOfTrans(int id) {
        return billDAO.getBillsOfTrans(id);
    }

    public boolean assureDispatchBill(int dispatchBillId, String employeeId) {
        DispatchBill dispatchBill = billDAO.getDispatchBill(dispatchBillId);
        dispatchBill.setEmployeeB(employeeId);
        dispatchBill.setState("已确认");
        billDAO.updateDispatchBill(dispatchBill);
        StartBill startBill = billDAO.getStartBill(dispatchBill.getStartBillId());
        startBill.setProgress("已送达");
        billDAO.updateStartBill(startBill);
        return true;
    }
}
