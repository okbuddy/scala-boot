package com.imooc.service

import com.imooc.domain.MetaTable
import com.imooc.repository.MetaTableRepo
import javax.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
@Service
class MetaTableService @Autowired()(metaTableRepo: MetaTableRepo){

  @Transactional
  def save(metatable:MetaTable): Unit ={
     metaTableRepo.save(metatable)
  }

  def query()={
    metaTableRepo.findAll()
  }

}
