package com.imooc.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
class HelloBoot {
@RequestMapping(value = Array("/scalaBoot"),method = Array(RequestMethod.GET))
  def sayScalaHello()={
  println("this is scala --------------------")
    "hello scala boot"
  }

}

