package io.man.mavenweb.service.Impl;

import io.man.mavenweb.dao.DepDao;
import io.man.mavenweb.entity.Dep;
import io.man.mavenweb.service.DepService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Setter
@Transactional
@Service
public class DepServiceImpl implements DepService {


    @Autowired
    private DepDao depDao;

    @Override
    public List<Dep> getList() {
        return depDao.getList();
    }
}
