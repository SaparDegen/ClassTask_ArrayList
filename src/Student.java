public class Student {
    private String name;
    private int age;

    public Student(){}

    public Student(String name, int age) {
        if (name.equals("")) {
            throw new MyException("Name must not be empty!");
        } else {
            this.name = name;
        }

        if (age < 0) {
            throw new MyException("Age must be a positive number!");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            throw new MyException("Name must not be empty!");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new MyException("Age must be a positive number!");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
