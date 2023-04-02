public class Main extends Object {
    public static void main(String[] args) {

        // Every class inherits from Object class

        Student student1 = new Student("Can", 28);
        PrimarySchoolStudent pss1 = new PrimarySchoolStudent("Jimmy", 8, "Carole");

        System.out.println(student1.toString());
        System.out.println(student1);
        System.out.println(pss1);






    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    /*    @Override
    public String toString() {
        return super.toString();
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PrimarySchoolStudent extends Student{
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String  toString() {
        return "PrimarySchoolStudent{" +
                "parentName='" + parentName + '\'' +
                "} " + super.toString();
    }
}