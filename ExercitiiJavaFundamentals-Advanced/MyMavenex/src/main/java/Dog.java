public class Dog {

    private int age;
    private String name;
    private String gender;
    private int weight;
    private String race;

    public Dog(int age, String name, String gender, int weight, String race) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.race = race;
    }

    public Dog(String gender, String race) {
        this.gender = gender;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWeight() {
        if (weight > 0) {
            return "the weight of this dog is : " + weight;
        } else {
            return "Error";
        }
    }

    public int setWeight(int weight) {

       return  this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    public String setRace(String race) {
        return this.race = race;
    }


}
