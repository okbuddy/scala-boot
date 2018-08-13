package com.imooc.controller

import com.imooc.domain.MetaTable
import com.imooc.service.MetaTableService
import com.imooc.utills.{ResultVO, ResultVOUtil}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
@RequestMapping(value = Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService: MetaTableService) {
@RequestMapping(value = Array("/"),method = Array(RequestMethod.POST))
  def save(metaTable:MetaTable)={
    metaTableService.save(metaTable)
    ResultVOUtil.success(metaTable)
  }
  @RequestMapping(value = Array("/"),method = Array(RequestMethod.GET))
  def query()={

    ResultVOUtil.success(metaTableService.query())
  }

}
