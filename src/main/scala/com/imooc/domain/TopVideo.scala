package com.imooc.domain

import javax.persistence._

import scala.beans.BeanProperty

@Entity
@Table
class TopVideo{
@BeanProperty
  var day:String=_
  @Id
  @BeanProperty
  var cmsId:String=_
  @BeanProperty
  var count:Long=_

}
