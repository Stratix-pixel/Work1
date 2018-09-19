import java.util.Scanner;

public class prob14 {

    public static void main(String[] args) {

        long freq;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the frequency in hertzs: ");

        //Frequency example1 = 5000000000000000
        //Frequency example2 = 6700000000000000

        freq = sc.nextLong();

        double speedOfLight = 299792458;


        double wavelength = (speedOfLight/freq)*10000000000L;

        String spectrum =  (wavelength <= 620) && (wavelength > 590) ? "Orange" :
                ((wavelength <= 750) && (wavelength > 620) ? "Red" :
                        ((wavelength <= 590) && (wavelength > 570) ? "Yellow" :
                                ((wavelength <= 570) && (wavelength > 495) ? "Green" :
                                        (wavelength <= 495) && (wavelength > 450) ? "Blue" :
                                                ((wavelength <= 450) && (wavelength >= 380) ? "Violet":
                                                        "The wavelength is in outer spectrum"))));


        System.out.println("The wavelength of the given frequency is " + wavelength + " nm");

        System.out.println("The color in the spectrum is : " + spectrum);

    }
}
