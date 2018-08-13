package com.imooc.service;

import com.imooc.domain.MetaDatabase;
import com.imooc.repository.MetaDatabaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MetaDatabaseService {
    @Autowired
    private MetaDatabaseRepo metaDatabaseRepo;
    @Transactional
    public void  save(MetaDatabase metaDatabase){
        metaDatabaseRepo.save(metaDatabase);
    }

    public Iterable<MetaDatabase> query(){
        return metaDatabaseRepo.findAll();
    }


}
