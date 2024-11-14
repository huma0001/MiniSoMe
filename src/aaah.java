import java.util.Scanner;

public class aaah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String jonAah = scan.nextLine();
        String doctorRequirment1 = scan.nextLine();


        if (doctorRequirment1.length() > jonAah.length()){
            System.out.println("no");
        } else{
            System.out.println("go");
        }
    }
}