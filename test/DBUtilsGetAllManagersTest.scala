import models.database.DBUtils
import org.scalatestplus.play._
import models.EmployeeModel

class DBUtilsGetAllManagersTest extends PlaySpec {

"getAllManagers method" must {
     "Return all managers" in {
       
	   println("List of Managers is........"+DBUtils.getAllManagers)
       
	   var count:Integer = 0;
       
	   var flag:Boolean = false;
	   
	   var ListEmp:List[EmployeeModel] = DBUtils.getAllManagers;
	   
	   for(emp <- ListEmp) {
         println(emp.name)
		 
		 if(emp.isManager.equals(1)) {
           flag = true
       assertResult(true)(flag)
     } 
     
   }  
  
  
}
}
}
