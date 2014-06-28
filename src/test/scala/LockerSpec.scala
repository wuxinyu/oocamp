import org.scalatest.FunSuite
import com.tw.oocamp._
class LockerSuite extends FunSuite {

  test("given something when some action raise then should assert all we need") {

  }
  
  test("given a locker when locker store a bag after should can't store same Bag again") {
    val locker = new Locker();
    val bag = new Bag();
    try {
      locker.store(bag)
    }
    catch {
      case _: Exception => {
        fail()
      }
    }

    intercept[Exception] {
      locker.store(bag)
    }
  }

}