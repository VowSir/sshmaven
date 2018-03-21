package io.man.mavenweb.service;

import io.man.mavenweb.entity.Dep;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface DepService {


    public List<Dep> getList();
}
