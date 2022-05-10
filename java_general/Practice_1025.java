public class Practice_1025 {

    public static void printOutput() {    

        String sArray [] = new String[10];    

        String st = " ";    

        for (int s = 0; s < 10; s++)    

        {        

            sArray[s] = "s";        

            System.out.print(sArray[s] + st + ".");        

            s++;    

        }

    } 

    public static void tricky() {
        int q = 2;

        int p = ++q;
        // int p = q++;

        System.out.println(p);
        System.out.println(q);
        System.out.println(p * q);

    }

    public static void main (String[] args) {
        // printOutput();
        tricky();
    }
}