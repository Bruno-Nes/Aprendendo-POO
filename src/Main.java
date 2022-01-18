import encapsulameto.RemoteControl;

public class Main {
    public static void main(String[] args) {
        //Fist step of OOP course
        /*principiosbasicosdepoo.human pessoa = new principiosbasicosdepoo.human("Bruno Nestor", 20, 73.0);
        principiosbasicosdepoo.human pessoa1 = new principiosbasicosdepoo.human("Claudio", 21, 67.0);

        System.out.println("Your name is: " + pessoa.getName());
        System.out.println("Your age is: " + pessoa.getAge());
        System.out.println("Your weight is: " + pessoa.getWeight());

        System.out.println("Your name is: " + pessoa1.getName());
        System.out.println("Your age is: " + pessoa1.getAge());
        System.out.println("Your weight is: " + pessoa1.getWeight());*/

        //Second step of OOP course encapsulation
        RemoteControl control = new RemoteControl();
        control.isOn();
        control.increaseVolume();
        control.openMenu();
    }
}
