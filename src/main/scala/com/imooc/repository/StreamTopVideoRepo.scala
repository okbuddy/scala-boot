package com.imooc.repository

import com.imooc.domain.StreamTopVideo
import com.imooc.utils.HbaseUtils
import org.apache.hadoop.hbase.client.{Result, Scan}
import org.apache.hadoop.hbase.util.Bytes

import scala.collection.mutable.ListBuffer

object StreamTopVideoRepo {

  def getStreamClickCountByDay(day: String): ListBuffer[StreamTopVideo] = {
    val streamClickTable = HbaseUtils.getTable("imooc_course_clickcount")
    val scan = new Scan().setRowPrefixFilter(day.getBytes())
    val resultScanner = streamClickTable.getScanner(scan)
    var ele: Result = null
    var list = new ListBuffer[StreamTopVideo]()
    ele = resultScanner.next()
    while (ele != null) {

      list.append(StreamTopVideo(Bytes.toString(ele.getRow), Bytes.toLong(ele.getValue("info".getBytes(), "click_count".getBytes()))
      )

      )
      ele = resultScanner.next()

    }

    list


  }

  def main(args: Array[String]): Unit = {
    var l1=ListBuffer("22","33")
    var aa=l1.toIterable


//   val ll= getStreamClickCountByDay("20180917")
//    println(ll)
//    var a= List()
//    println((a=null)!=null)
//    a=null
//    println(a!=null)
//    println(null!=null)
//    println(2!=2)

//    import util.control.Breaks._
//
//    var aa=11;
//    var c=1
//    breakable{
//
//      while ((aa=23)!=null){
//        println(aa+"----")
//        c+=1
//        if (c==3){
//            break
//        }
//      }
//
//    }

  }
}
