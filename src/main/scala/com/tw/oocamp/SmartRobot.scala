package com.tw.oocamp

/**
 * Created by twer on 7/2/14.
 */
class SmartRobot(size:Int=1) extends Robot(size){
  protected override def appropriateLocker():Option[Locker]={
    Option(innerLockers.map(v=>(v.remainingCount(),v)).toSeq.sortBy(_._1).reverse.head._2)
  }
}
