import org.scalatest.FunSuite
import com.tw.oocamp._

class LockerSuite extends FunSuite {

  test("given a locker when locker store a bag after should can't store same bag again") {
    val locker = new Locker();
    val bag = new Bag();
    locker.store(bag)
    intercept[Exception] {
      locker.store(bag)
    }
  }

  test("given Locker when locker store bag then return a ticket") {
    val bag = new Bag()
    val ticket:Ticket = new Locker().store(bag)
    assert(ticket!=null)
  }

  test("given Locker when pick a bag with ticket then return original bag") {
    val bag = new Bag()
    val locker = new Locker()
    val newBag = locker.pick(locker.store(bag))
    assert(bag==newBag)
  }

  test("given Locker when pick a bag with ticket then can't use this ticket again") {
    val locker = new Locker()
    val ticket = locker.store(new Bag())
    locker.pick(ticket)
    intercept[Exception] {
      locker.pick(ticket)
    }
  }



}