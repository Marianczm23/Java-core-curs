public class Main {
    public static void main(String[] args) {

        Cerc cerc1 = new Cerc();
        Patrat patrat1 = new Patrat();
        Dreptunghi drep1 = new Dreptunghi();

        System.out.println(cerc1.draw());
        System.out.println(patrat1.draw());
        System.out.println(drep1.draw());

        Shape cerc2 = new Cerc();
        Shape drept2 = new Dreptunghi();
        Shape patrat2 = new Patrat();

        System.out.println(cerc2.draw());
        System.out.println(drept2.draw());
        System.out.println(patrat2.draw());


    }

}
