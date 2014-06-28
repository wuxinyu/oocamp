package com.tw.oocamp

import scala.collection.mutable._

/**
 * Created by wuxy on 2014/6/28.
 */
class Locker {
  private var _store = Set[Bag]()
  def store(bag:Bag) = {
    if(_store.contains(bag))
      throw new IllegalArgumentException()
    _store+=bag
  }
}
