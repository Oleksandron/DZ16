import java.util.Objects;

public class Cat {

     public String name;
     public Integer age;
     public Integer weight;
     public String breed;

    public Cat() {
        System.out.println("I have three cats");
    }
    public Cat(String name, Integer age, Integer weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return  "name: " + name + ", \t" +
                "age: " + age + ", \t" +
                "weight: " + weight + ", \t" +
                "breed: " + breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(age, cat.age) && Objects.equals(weight, cat.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight);
    }
}
