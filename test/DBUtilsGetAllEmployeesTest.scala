import models.database.DBUtils
import org.scalatestplus.play._
import models.EmployeeModel

class DBUtilsGetAllEmployeesTest extends PlaySpec {

 "getAllEmployees method" must {
     "Return all employees" in {
       
	   println("List of Employees is........"+DBUtils.getAllEmployees)
       
	   var count:Integer = 0;
       
	   var flag:Boolean = false;
	   
	   var ListEmp:List[EmployeeModel] = DBUtils.getAllEmployees;
       for(emp <- ListEmp) {
         println(emp.name)
		 
		 if(emp.name.equals("Sumit")) {
           count = count+1;
         }
         if(emp.name.equals("Prashant")) {
           count = count+1;
         }
         if(emp.name.equals("Rucha")) {
           count = count+1;
         }
         if(emp.name.equals("Varghese")) {
           count = count+1;
         }
         if(emp.name.equals("Tanya")) {
           count = count+1;
         }
		 if(emp.name.equals("Shreerang")) {
           count = count+1;
         }
         if(emp.name.equals("Abhijit")) {
           count = count+1;
         }
         if(emp.name.equals("Manoj")) {
           count = count+1;
         }
         if(emp.name.equals("Pushpendra")) {
           count = count+1;
         }
         if(emp.name.equals("JK")) {
           count = count+1;
         }
		  if(emp.name.equals("Priya")) {
           count = count+1;
         }
         if(emp.name.equals("Sudhanshu")) {
           count = count+1;
         }
		}
		 println("Count is ========"+count)
		 if(count==12) flag = true
       assertResult(true)(flag)
     } 
     
   }  
  
  
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
       
	   
	   
	   