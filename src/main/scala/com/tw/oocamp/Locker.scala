package com.tw.oocamp

/**
 * Created by wuxy on 2014/6/28.
 */
class Locker(size: Int = 1) {

  private val store = collection.mutable.Map[Option[Ticket], Bag]()

  def store(bag: Bag): Option[Ticket] = {
    val ticket = Option(new Ticket())
    if (store.count(tb => tb._2 == bag) > 0 || isFull()) return None else store += ticket -> bag
    ticket
  }

  def pick(ticket: Option[Ticket]): Bag = {
    val bagOption = if (isValidTicket(ticket)) store.remove(ticket) else None

    bagOption match {
      case Some(bag) => bag
      case _ => null
    }
  }

  def isValidTicket(ticket: Option[Ticket]): Boolean = {
    store.contains(ticket)
  }

  def isFull(): Boolean = {
    store.size == size
  }

  def remainingCount(): Int = {
    size - store.size
  }
}
