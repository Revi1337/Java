package annotation_20;

@VeryImportantClass
public class Cat {

    @ImportantString
    public String name;

    public int age;

    public Cat() {}

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @RunImmediatelyMethod
    public void meow(){
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("Munch!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
