package com.imooc.controller;

import com.imooc.domain.MetaDatabase;
import com.imooc.service.MetaDatabaseService;
import com.imooc.utills.ResultVO;
import com.imooc.utills.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/meta/database")
public class MetaDatabaseController {
    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public ResultVO save(@ModelAttribute MetaDatabase metaDatabase){
        metaDatabaseService.save(metaDatabase);
        return ResultVOUtil.success(metaDatabase);
    }
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ResultVO query(){
        return ResultVOUtil.success(metaDatabaseService.query());
    }
}
