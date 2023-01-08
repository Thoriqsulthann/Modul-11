public static main( String[] args )
{
 Person ref;
 Student studentObject = new Student();
 Employee employeeObject = new Employee();
 ref = studentObject; //Person menunjuk kepada
 // object Student
 //beberapa kode di sini
 } 
 /**Sekarang dimisalkan kita punya method getName dalam superclass Person kita, dan kita
override method ini dalam kedua subclasses Student dan Employee, **/
public class Person
{
 public String getName(){
 System.out.println(“Person Name:” + name);
 return name;
 }
}
public class Student extends Person
{
 public String getName(){
 System.out.println(“Student Name:” + name);
 return name;
 }
} 
public class Employee extends Person
{
 public String getName(){
 System.out.println(“Employee Name:” + name);
 return name;
 } 
