public class Student {
    private String name;
    private int age;
    private Double gpa;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getGpa() {
        if (gpa > 3) {
            return "EXELLENT";
        } else if (gpa >= 2) {
            return "GOOD";
        } else {
            return "NEED IMPROVMENTS";
        }

    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("ERROR");
            this.gpa = 0.0;
        }

    }
}
