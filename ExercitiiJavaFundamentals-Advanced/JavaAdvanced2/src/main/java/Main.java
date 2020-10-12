import java.util.Scanner;

public class Main {

    // sa se modeleze urm entitati:
    // un student care o sa aiba nume,prenume, o nota la informatica si o nota la fizica si un atribut "admis la politehnica"
    //se vor introduce de la tastatura numele,prenume,si notele studentului
    //clasa parinte va fi Person
    //folosim o interfata pentru a gestiona notele si admiterea la facultate:admiterea se va calcula in fct de medii.
    //daca media notelor este mai mica decat 6 sa se arunce o exceptie "BadGradesExeptions"
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("introduceti firstName : ");
        String firstName = scan.nextLine();
        System.out.println("introduceti lastName : ");
        String lastName = scan.nextLine();
        System.out.println("introduceti notaMate");
        int notaMate = scan.nextInt();
        System.out.println("introduceti notaFizica");
        int notaFizica = scan.nextInt();
        System.out.println("introduceti notaInfo");
        int notaInfo = scan.nextInt();

        System.out.println("ati introdus firstName :" + firstName + ", lastName :" + lastName + ", si notele urmatoare ," + "notaFizica :" + notaFizica + ",notaMate :" + notaMate + ", notaInfo :" + notaInfo);


        Student student = new Student(firstName, lastName, notaInfo, notaFizica, notaMate);
        try {
            student.computeAverage();
            System.out.println(student.isAdmisPoli());
        } catch (BadGradesException e) {
            System.out.println(e.getMessage());
        }

        //cream 2 studenti-->comparam dupa notesi media generala


        Student student_marian = new Student("Marian","Cozma",8,7,9);
        Student student_catalin =new Student("Catalin","Cozma",8,9,10);

         int medieM = (student_marian.getNotaFizica()+student_marian.getNotaInfo()+student_marian.getNotaMate())/3;
         int medieC = (student_catalin.getNotaFizica()+student_catalin.getNotaMate()+student_catalin.getNotaInfo()/3);

         if(medieC>medieM){
             System.out.println("catalin mai mare decat marian");
         }else {
             System.out.println("marian mai mare decat catalin");
         }



         


    }

        //sa se creeze si sa se trateze exceptia,atunci cand notele sunt mai mari decat 10 dar si mai mari decat 1,
        // sa se adauge urmatorul comportament prin intermediul uneii interfete:-sa se calculeze media doar la mate si la fizica sa se creeze un campAdmisFizica
        //- sa se calculeze media la matematica si la informatica si sa se mai fie un campAdmisInfo;
        //- sa se mai adauge o exceptie sa  se arunce atunci cand media este 10 sa afiseze mesajul "aveti zece perfect".





}