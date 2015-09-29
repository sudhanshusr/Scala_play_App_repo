import models.database.DBUtils
import org.scalatestplus.play._
import models.EmployeeModel

class DBUtilsGetMgrByDeptTest extends PlaySpec {
  "getManagerByDepartment method" must {
    "Return matching manager based on supplied dept" in {
 
      var empMgr:List[EmployeeModel] = DBUtils.getManagerByDepartment("AHALIFE", "2");
      
	  empMgr.foreach(emp => assertResult("Varghese")(emp.name))
	  
	   var empMgr1:List[EmployeeModel] = DBUtils.getManagerByDepartment("PTPORTAL", "3");
      
	  empMgr1.foreach(emp1 => assertResult("Shreerang")(emp1.name))
	  
	  var empMgr2:List[EmployeeModel] = DBUtils.getManagerByDepartment("ALM", "1");
      
	  empMgr2.foreach(emp2 => assertResult("Prashant")(emp2.name))
	  
	   
	  
	  /*for(emp <- empMgr) {
        assertResult("Varghese")(emp.name)
      }
	  */
      
      
    }
  }
}

		