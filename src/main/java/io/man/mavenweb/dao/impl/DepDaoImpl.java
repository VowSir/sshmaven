package io.man.mavenweb.dao.impl;

import io.man.mavenweb.dao.DepDao;
import io.man.mavenweb.entity.Dep;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class DepDaoImpl extends HibernateDaoSupport implements DepDao {

    @Override
    public List<Dep> getList() {
        return (List<Dep>) getHibernateTemplate().find("from Dep");
    }
}
