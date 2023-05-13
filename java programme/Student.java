   

  public class Student{
    public static void main(String[] args){
        Teacher s1=new Teacher();

        s1.name="Ahasanul";
        s1.age=23;

        s1.StudentId();
    }
}

class Teacher {
    String name;
    int age;
    
    public  void StudentId(){
        System.out.println("Hello student");
    }
   
}
