public class Person
{
 :
 :
 public String getName(){
 System.out.println("Parent: getName");
 return name;
 }
 :
}

//Untuk override, method getName dalam subclass Student, kita tulis,

 public class Student extends Person
{
 :
 :
 public String getName(){
 System.out.println("Student: getName");
 return name;
 } 
 :
} 
