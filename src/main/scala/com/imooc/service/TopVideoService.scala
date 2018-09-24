package com.imooc.service

import com.imooc.domain.StreamTopVideo
import com.imooc.repository.{StreamTopVideoRepo, TopVideoRepo}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import scala.collection.mutable.ListBuffer

@Service
class TopVideoService @Autowired()(topVideoRepo: TopVideoRepo){
  def streamQuery(day:String): ListBuffer[StreamTopVideo] = {

    StreamTopVideoRepo.getStreamClickCountByDay(day)
  }


  def query()={
    topVideoRepo.findAll()
  }



}
