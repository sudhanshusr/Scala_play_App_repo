//import org.scalatest.FunSuite
import models.database.DBUtils
import org.scalatestplus.play._
import models.DepartmentModel

class DBUtilsDepartmentsTest extends PlaySpec {
 /* test("Tesing getAllDepartments method of DBUtils") {
    println("All depts are........"+DBUtils.getAllDepartments);*/
   "GetAllDepartments method" must {
     "Return all depts" in {
       println("All depts are........"+DBUtils.getAllDepartments)
       var count:Integer = 0;
       var flag:Boolean = false;
       var myList:List[DepartmentModel] = DBUtils.getAllDepartments;
       for(dept <- myList) {
         println(dept.departmentName)
         if(dept.departmentName.equals("ALM")) {
           count = count+1;
         }
         if(dept.departmentName.equals("AHALIFE")) {
           count = count+1;
         }
         if(dept.departmentName.equals("PTPORTAL")) {
           count = count+1;
         }
         if(dept.departmentName.equals("BLUEHORNET")) {
           count = count+1;
         }
         if(dept.departmentName.equals("FINDAGRAVE")) {
           count = count+1;
         }
       }
       if(count==5) flag = true
       assertResult(true)(flag)
     } 
     
   }  
  
  
  
}