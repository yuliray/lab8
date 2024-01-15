public class People {
    protected String name, lastname;
    protected int age;
    public People() {
        name = "Peter";
        lastname = "Pen";
        age = 20;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public People(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    public void print() {
        System.out.println("Name - " + name);
        System.out.println("Lastname - " + lastname);
        System.out.println("Age - " + age);
    }

    //method walk()
    public void walk() {
        print();
        System.out.println("Walk");
    }

    //method voice()
    public void voice() {
        print();
        System.out.println("Voice");
    }

    //method run()
    public void run() {
        print();
        System.out.println("Run");
    }
}
class Teacher extends People{
    public Teacher() {
        super();
    }
    public Teacher(String name, String lastname, int age) {
        super(name, lastname, age);
    }

    public void teach() {
        print();
        System.out.println("Teach");
    }
}

class Student extends People {
    public Student() {
        super();
    }
    public Student(String name, String lastname, int age) {
        super(name, lastname, age);
    }

    public void learn() {
        print();
        System.out.println("Learn");
    }
}
