import models.database.DBUtils
import org.scalatestplus.play._
import models.EmployeeModel
import models.EmployeeModel

class DBUtilsEmpDetailsTest extends PlaySpec {
  "GetEmployeeDetails method" must {
    "Return correct employee details" in {
  //  println("Emp details ......"+DBUtils.getEmployeeDetails("1", "1"))
      var empList:List[EmployeeModel] = DBUtils.getEmployeeDetails("1", "1");
      for(emp <- empList) {
        assertResult("Sumit")(emp.name)
      }
      
      //assertResult(true)(true)
    }
  }
}