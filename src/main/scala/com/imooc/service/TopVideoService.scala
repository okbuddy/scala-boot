package com.imooc.service

import com.imooc.repository.TopVideoRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TopVideoService @Autowired()(topVideoRepo: TopVideoRepo){

  def query()={
    topVideoRepo.findAll()
  }

}
