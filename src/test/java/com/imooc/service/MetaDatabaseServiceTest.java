package com.imooc.service;

import com.imooc.domain.MetaDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MetaDatabaseServiceTest {
    @Autowired
        private  MetaDatabaseService metaDatabaseService;
@Test
    public void  saveTest(){
        MetaDatabase metaDatabase=new MetaDatabase();
        metaDatabase.setName("default");
        metaDatabase.setLocation("hdfs://localhost:9000/user/hive/warehouse");
        metaDatabaseService.save(metaDatabase);
    }
    @Test
    public void testQuery(){
        Iterable<MetaDatabase> result=metaDatabaseService.query();
        for (MetaDatabase mm :
                result) {
            System.out.println(mm.getId());
            System.out.println(mm.getName());
            System.out.println(mm.getLocation());

        }

    }


}
