package io.man.mavenweb.dao.impl;

import io.man.mavenweb.dao.DepDao;
import io.man.mavenweb.entity.Dep;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepDaoImpl extends HibernateDaoSupport implements DepDao {

    @Autowired
    public void setSuperSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public List<Dep> getList() {
        return (List<Dep>) getHibernateTemplate().find("from Dep");
    }
}