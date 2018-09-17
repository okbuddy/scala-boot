package com.imooc.controller

import com.imooc.service.TopVideoService
import com.imooc.utills.ResultVOUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}


@RestController
@RequestMapping(value = Array("/spark/topVideo"))
class TopVideoController @Autowired()(topVideoService: TopVideoService){

  @RequestMapping(value = Array("/query"),method = Array(RequestMethod.GET))
  def query()={

    ResultVOUtil.success(topVideoService.query())
  }


}
