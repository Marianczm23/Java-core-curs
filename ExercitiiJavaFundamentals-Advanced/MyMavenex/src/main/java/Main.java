public class Main {
    public static void main(String args[]) {

        Dog dog1 = new Dog(1, "mona", "m", 5, "Caine");
        Dog dog2 = new Dog("m", "cane");
        dog1.setAge(10);
        System.out.println(dog1.getAge());
        dog1.setWeight(0);
        System.out.println(dog1.getWeight());

        dog2.setWeight(0);
        System.out.println(dog2.getWeight());
    }

}


