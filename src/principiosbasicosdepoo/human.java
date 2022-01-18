package principiosbasicosdepoo;

public class human {
    public String name;
    public int age;
    public double weight;

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    human(String name, int age, double weight) {
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);
    }
}
