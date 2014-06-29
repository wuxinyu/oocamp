package com.tw.oocamp

/**
 * Created by wuxy on 2014/6/28.
 */
class Locker {
  private var store = collection.mutable.Map[Ticket,Bag]()

  def store(bag:Bag):Ticket = {
    val ticket = new Ticket()
    if(store.count(tb=>tb._2==bag)>0) throw new IllegalArgumentException() else store+=ticket->bag
    ticket
  }

  def pick(ticket:Ticket):Bag = {
      val bag = store(ticket)
      store-=ticket
      bag
  }
}
