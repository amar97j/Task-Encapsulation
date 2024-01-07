public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student();

        student.setName("Amar ALfailakawi");
        student.setAge(26);
        student.setGpa(3.8);

        // Display Students info
        System.out.println("Student Name:" + " " + student.getName());
        System.out.println("Student Age:" + " " + student.getAge());
        System.out.println("Student GPA:" + " " + student.getGpa());
        System.out.println("GPA status:" + " " + student.getGpa());

        student.setGpa(5);

        System.out.println("GPA Updated: " + " " + student.getGpa());
        // System.out.println("GPA Updated Status: " + " " + student.getGpa());

    }
}
