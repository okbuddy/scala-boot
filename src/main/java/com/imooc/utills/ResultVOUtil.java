package com.imooc.utills;

public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(0);
        resultVO.setData(object);
        resultVO.setMsg("success");
        return resultVO;
    }

    public static ResultVO error(Integer code,Object object){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(code);
        resultVO.setData(object);
        resultVO.setMsg("error");
        return resultVO;
    }


}
