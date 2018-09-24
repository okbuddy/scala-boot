package com.imooc.controller

import java.util

import com.imooc.domain.StreamTopVideo
import com.imooc.service.TopVideoService
import com.imooc.utills.ResultVOUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{PathVariable, RequestMapping, RequestMethod, RestController}


@RestController
@RequestMapping(value = Array("/spark/topVideo"))
class TopVideoController @Autowired()(topVideoService: TopVideoService){

  @RequestMapping(value = Array("/query"),method = Array(RequestMethod.GET))
  def query()={

    ResultVOUtil.success(topVideoService.query())
  }

  @RequestMapping(value = Array("/stream/{day}"),method = Array(RequestMethod.GET))
  def streamQuery(@PathVariable("day") day:String)={
    val result=topVideoService.streamQuery(day)
    var javalist=new util.ArrayList[util.HashMap[String,String]]()
    for(item<-result){
      var javamap=new util.HashMap[String,String]()
      javamap.put("name",item.name)
      javamap.put("value",item.value.toString)
      javalist.add(javamap)
    }
    ResultVOUtil.success(javalist)
  }


}
