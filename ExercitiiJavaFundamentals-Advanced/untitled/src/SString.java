public class SString {
    public static void main(String args[]) {

        int[] sirDeNr = {1, 3, 5, 62, 74, 20};
    }

    public static void media(int[]sirDeNr) {
        int suma = 0;
        int nr=0;
        int j =0;
        while(j<sirDeNr.length){
            suma= suma + sirDeNr[j];
            j++;
        }
        double media= suma/sirDeNr.length;
        for (int i = 0; i < sirDeNr.length; i++) {
            if(sirDeNr[i]>media){
                nr = sirDeNr[i];
            }

        }
        System.out.println(nr);
    }
}
