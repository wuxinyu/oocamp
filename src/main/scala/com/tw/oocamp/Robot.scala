package com.tw.oocamp

import collection.mutable.ListBuffer
/**
 * Created by twer on 6/30/14.
 */
class Robot(size:Int=1){

  protected val innerLockers:ListBuffer[Locker] = ListBuffer[Locker]()

  def store(bag: Bag): Option[Ticket] ={
    appropriateLocker match {
      case Some(locker) => locker.store(bag)
      case _=>None
    }
  }

  protected def appropriateLocker():Option[Locker]={
    innerLockers collectFirst { case locker if !locker.isFull => locker}
  }

  def pick(ticket: Option[Ticket]):Bag = {
    val bagOption = innerLockers collectFirst { case locker if locker.isValidTicket(ticket)=>locker.pick(ticket)}
    bagOption match {
      case Some(bag)=>bag
      case _=>null
    }
  }

  def manage(locker: Locker){
    if(innerLockers.length==size) throw new IllegalArgumentException()
    innerLockers+=locker
  }

}
