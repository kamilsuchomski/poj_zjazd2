import java.util.Scanner;

public class Main {
    public static void main(String[] args)
        throws java.io.IOException{
            //zadanie1();
            //zadanie2();
            //zadanie3 zadanie3 = new zadanie3();
            //zadanie3.getValues();
            //zadanie4();
            //zadanie5();
            //zadanie6();
            //zadanie7();
            //zadanie8(); //inna wartosc NOT!
            //zadanie9();
            //zadanie10();
            VehicleProg zadanie_11_12 = new VehicleProg();
    }

    public static void zadanie1(){
        System.out.println("Imię: Kamil");
        System.out.println("Nazwisko: Suchomski");
        System.out.println("Grupa: 5");
        System.out.println("Kierunek: Informatyka");
    }

    public static void zadanie2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String imie = input.next();
        System.out.println("Podaj nazwisko:");
        String nazwisko = input.next();
        System.out.println("Podaj grupę:");
        String grupa = input.next();
        System.out.println("Podaj kierunek:");
        String kierunek = input.next();

        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko : " + nazwisko);
        System.out.println("Grupa: " + grupa);
        System.out.println("Kierunek: " + kierunek);

    }

    public static void zadanie4(){
        String napis1 = "Napis";
        String napis2 = "Napis";

        System.out.println("napis1: " + napis1);
        System.out.println("napis2: " + napis2);

        System.out.println("napis1 == napis2: " + (napis1 == napis2));

        System.out.println("napis1.equals(napis2): " + (napis1.equals(napis2)));
    }

    public static void zadanie5(){
        System.out.println("Przykłady operatorów inkrementacji i dekrementacji:");
        int x = 5;
        int y = 8;
        System.out.println("int x = " + x);
        System.out.println("int y = " + y);
        System.out.println("\n++x = " + ++x);
        System.out.println("y++ = " + y++);
        System.out.println("int y = " + y);

        System.out.println("\nint x = " + x);
        System.out.println("int y = " + y);
        System.out.println("--x = " + --x);
        System.out.println("y-- = " + y--);
        System.out.println("int y = " + y);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("\nPrzykłady operatorów arytmetycznych:");

        double w = 34.81;
        double z = 14.94;

        System.out.println("w = " + w);
        System.out.println("z = " + z);

        System.out.println("\nw + z = " + (w + z));
        System.out.println("w - z = " + (w - z));
        System.out.println("w * z = " + (w * z));
        System.out.println("w / z = " + (w / z));
        System.out.println("w % z = " + (w % z));

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("\nPrzykłady operatorów relacyjnych:");

        int m = 43;
        int n = 56;
        int o = 51;

        System.out.println("\nm = " + m);
        System.out.println("n = " + n);
        System.out.println("o = " + o);

        System.out.println("\nm < n = " + (m < n));
        System.out.println("m > o = " + (m > o));
        System.out.println("n <= o = " + (n <= o));
        System.out.println("m >= n = " + (m >= n));
        System.out.println("m > o = " + (m > o));
        System.out.println("n == o = " + (n == o));
        System.out.println("m != o = " + (m != o));
    }

    public static void zadanie6(){

        int[][] array = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                array[i][j] = i + j * 10;
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i = 2; i >= 0; i--){
            for(int j = 0; j < 3; j++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }

    public static void zadanie7(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj promień walca: ");
        double r = input.nextDouble();
        System.out.println("Podaj wysokość walca: ");
        double h = input.nextDouble();
        System.out.println("Objętość walca wynosi " + (Math.round((Math.PI * r * r * h) * 100.0) / 100.0));

    }

    public static void zadanie8(){

        boolean p1 = true;
        boolean q1 = true;
        boolean p2 = true;
        boolean q2 = false;
        boolean p3 = false;
        boolean q3 = true;
        boolean p4 = false;
        boolean q4 = false;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");
        System.out.println(p1 + "\t" + q1 + "\t" + (p1 && q1) + "\t" + (p1 || q1) + "\t" + (p1 ^ q1) + "\t" + (!(p1 || q1)));
        System.out.println(p2 + "\t" + q2 + "\t" + (p2 && q2) + "\t" + (p2 || q2) + "\t" + (p2 ^ q2) + "\t" + (!(p2 || q2)));
        System.out.println(p3 + "\t" + q3 + "\t" + (p3 && q3) + "\t" + (p3 || q3) + "\t" + (p3 ^ q3) + "\t" + (!(p3 || q3)));
        System.out.println(p4 + "\t" + q4 + "\t" + (p4 && q4) + "\t" + (p4 || q4) + "\t" + (p4 ^ q4) + "\t" + (!(p4 || q4)));

        //NOT dla p=0 q=1 daje wartosc false, u Pani ma wartosc true, kwestia innej wersji Javy?
    }

    public static void zadanie9()
        throws java.io.IOException{

            char myLetter = 'S';
            char userLetter;

            System.out.println("Pomyślałem o pewnej literze z przedziału A - Z.");
            System.out.print("Odgadnij ją: ");
            userLetter = Character.toUpperCase((char) System.in.read());

            if (myLetter < userLetter) {
                System.out.println("Źle!\nTrafiłeś zbyt nisko!");
            } else if (myLetter > userLetter) {
                System.out.println("Źle!\nTrafiłeś zbyt wysoko!");
            } else {
                System.out.println("Zgadłeś!");
            }
    }

    public static void zadanie10(){
        for(int i = 0; i < 15; i++) {
            System.out.println("2 do potęgi " + i + " wynosi: " + ((int) Math.pow(2, i)));
        }
    }

}

