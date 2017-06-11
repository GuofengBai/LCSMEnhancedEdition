package cn.edu.nju.LCSMEnhancedEdition.DAO;

import cn.edu.nju.LCSMEnhancedEdition.entity.*;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by baiguofeng on 2017/6/10.
 */
@Repository
public class BillDAOImpl implements BillDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public int newStartBill(StartBill startBill) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(StartBill.class);
        ProjectionList projectionList = Projections.projectionList();
        projectionList.add(Projections.max("id"));
        criteria.setProjection(projectionList);
        Object[] result = (Object[]) criteria.uniqueResult();
        int bid = Integer.parseInt(result[0] == null ? "" : result[0].toString())+1;
        startBill.setId(bid);
        sessionFactory.getCurrentSession().save(startBill);
        return bid;
    }

    public int newFromBill(FromBill fromBill) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(FromBill.class);
        ProjectionList projectionList = Projections.projectionList();
        projectionList.add(Projections.max("id"));
        criteria.setProjection(projectionList);
        Object[] result = (Object[]) criteria.uniqueResult();
        int bid = Integer.parseInt(result[0] == null ? "" : result[0].toString())+1;
        fromBill.setId(bid);
        sessionFactory.getCurrentSession().save(fromBill);
        return bid;
    }

    public int newToBill(ToBill toBill) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(ToBill.class);
        ProjectionList projectionList = Projections.projectionList();
        projectionList.add(Projections.max("id"));
        criteria.setProjection(projectionList);
        Object[] result = (Object[]) criteria.uniqueResult();
        int bid = Integer.parseInt(result[0] == null ? "" : result[0].toString())+1;
        toBill.setId(bid);
        sessionFactory.getCurrentSession().save(toBill);
        return bid;
    }

    public int newTransBill(TransBill transBill) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(TransBill.class);
        ProjectionList projectionList = Projections.projectionList();
        projectionList.add(Projections.max("id"));
        criteria.setProjection(projectionList);
        Object[] result = (Object[]) criteria.uniqueResult();
        int bid = Integer.parseInt(result[0] == null ? "" : result[0].toString())+1;
        transBill.setId(bid);
        sessionFactory.getCurrentSession().save(transBill);
        return bid;
    }

    public int newDispatchBill(DispatchBill dispatchBill) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(DispatchBill.class);
        ProjectionList projectionList = Projections.projectionList();
        projectionList.add(Projections.max("id"));
        criteria.setProjection(projectionList);
        Object[] result = (Object[]) criteria.uniqueResult();
        int bid = Integer.parseInt(result[0] == null ? "" : result[0].toString())+1;
        dispatchBill.setId(bid);
        sessionFactory.getCurrentSession().save(dispatchBill);
        return bid;
    }

    public StartBill getStartBill(int id) {
        return (StartBill) sessionFactory.getCurrentSession().get(StartBill.class, id);
    }

    public FromBill getFromBill(int id) {
        return (FromBill)sessionFactory.getCurrentSession().get(FromBill.class, id);
    }

    public ToBill getToBill(int id) {
        return (ToBill)sessionFactory.getCurrentSession().get(ToBill.class, id);
    }

    public TransBill getTransBill(int id) {
        return (TransBill)sessionFactory.getCurrentSession().get(TransBill.class, id);
    }

    public DispatchBill getDispatchBill(int id) {
        return (DispatchBill)sessionFactory.getCurrentSession().get(DispatchBill.class, id);
    }

    public boolean updateStartBill(StartBill startBill) {
        sessionFactory.getCurrentSession().saveOrUpdate(startBill);
        return true;
    }

    public boolean updateFromBill(FromBill fromBill) {
        sessionFactory.getCurrentSession().saveOrUpdate(fromBill);
        return true;
    }

    public boolean updateToBill(ToBill toBill) {
        sessionFactory.getCurrentSession().saveOrUpdate(toBill);
        return true;
    }

    public boolean updateTransBill(TransBill transBill) {
        sessionFactory.getCurrentSession().saveOrUpdate(transBill);
        return true;
    }

    public boolean updateDispatchBill(DispatchBill dispatchBill) {
        sessionFactory.getCurrentSession().saveOrUpdate(dispatchBill);
        return true;
    }

    public List<StartBill> getBillsOfTrans(int id) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(StartBill.class).add(Restrictions.or(Restrictions.eq("transBill1", id), Restrictions.eq("transBill2", id), Restrictions.eq("transBill3", id)));
        return criteria.list();
    }
}
