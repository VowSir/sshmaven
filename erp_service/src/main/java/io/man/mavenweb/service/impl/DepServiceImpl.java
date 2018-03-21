package io.man.mavenweb.service.impl;

import io.man.mavenweb.dao.DepDao;
import io.man.mavenweb.entity.Dep;
import io.man.mavenweb.service.DepService;
import lombok.Setter;

import java.util.List;


@Setter
public class DepServiceImpl implements DepService {


    private DepDao depDao;

    @Override
    public List<Dep> getList() {
        return depDao.getList();
    }
}
