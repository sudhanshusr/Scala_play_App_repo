import models.database.DBUtils
import org.scalatestplus.play._
import models.EmployeeModel


class DBUtilsGetAllReporteeTest extends PlaySpec {

  "getAllReportee method" must {
    "Return list of all reportees of a given manager" in {
	

	
	var empRpt:List[EmployeeModel] = DBUtils.getAllReportee("2");
      
	  	  for(emp <- empRpt) {
		  println(emp.name)
		  
		  if(emp.id.equals(1)) {
		  
          assertResult("Sumit")(emp.name)
		
          }
	      if(emp.id.equals(9)) {
		  
          assertResult("Pushpendra")(emp.name)
		  
          }
	      if(emp.id.equals(4)) {
		  
         assertResult("Varghese")(emp.name)
         
		 }
	     if(emp.id.equals(5)) {
		  
         assertResult("Tanya")(emp.name)
        
		}
	    if(emp.id.equals(11)) {
		  
         assertResult("Priya")(emp.name)
        
		}
	    if(emp.id.equals(12)) {
		  
         assertResult("Sudhanshu")(emp.name)
        
		}
	  
      
      
    }
  }
}
}