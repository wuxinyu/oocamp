package com.tw.oocamp

/**
 * Created by twer on 7/3/14.
 */
abstract class Robot {

  protected def getStoredLocker(ticket:Option[Ticket]):Option[Locker]
  protected def getStorableLocker():Option[Locker]

  def store(bag:Bag)={
    getStorableLocker match {case Some(locker)=>locker.store(bag) case _=>None}
  }

  def pick(ticket:Option[Ticket]):Bag={
    getStoredLocker(ticket) match {case Some(locker)=>locker.pick(ticket) case _=>null}
  }

  def manage(locker:Locker)
}
