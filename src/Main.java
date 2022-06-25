import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        
        student.setName("Liam");
        student.setAge(22);
        student.setGender("大四");
        student.setId("2018");

        System.out.println("name:"+student.getName());
        System.out.println("age:"+student.getAge());
        System.out.println("gender:"+student.getGender());
        System.out.println("id:"+student.getId());
    }
}
