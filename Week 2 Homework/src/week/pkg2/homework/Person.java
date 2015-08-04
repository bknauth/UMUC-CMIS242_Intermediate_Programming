package week.pkg2.homework;

class MyDate {
  public int Day;
  public String Month;
  public int Year;
}

public class Person {
  protected String name;
  protected String address;
  protected String phoneNumber;
  protected String email;

  
  public String toString() {
    return "Person";
  }
}

class Student extends Person {
  public static int FRESHMAN = 1;
  public static int SOPHOMORE = 2;
  public static int JUNIOR = 3;
  public static int SENIOR = 4;

  protected int status;

  
  public String toString() {
    return "Student";
  }
}

class Employee extends Person {
  protected String office;
  protected int salary;
  MyDate hireDate = new MyDate();
  

  
  public String toString() {
    return "Employee";
  }
}

class Faculty extends Employee{
  protected int OfficeHoursStart;
  protected int OfficeHoursEnd;
  
  //US University positions according to Wikipedia.
  public static int AdjunctProfessor = 1;
  public static int Instructor = 2;
  public static int Lecturer = 3;
  public static int AssistantProfessor = 4;
  public static int AssociateProfessor = 5;
  public static int Professor = 6;
  public static int InstituteProfessor = 7;
  
  protected int rank;
  
  
  public String toString(){
    return "Faculty";
  }
}

class Staff extends Employee{
  
  protected String title;
  
  
  public String toString(){
    return "Staff";
  }
}

