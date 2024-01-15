public class task3 {
    public static void main(String[] args) {
        People people = new People();
        people.walk();
        people.voice();
        people.run();
        Student student = new Student("Peter", "Pen", 20);
        student.walk();
        student.voice();
        student.run();
        student.learn();
        Teacher teacher = new Teacher("Ivan", "Ivanov", 40);
        teacher.walk();
        teacher.voice();
        teacher.run();
        teacher.teach();
    }
}
