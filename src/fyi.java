import java.util.Scanner;

public class fyi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String telephoneNmbr = scan.nextLine();


        if (telephoneNmbr.length() == 7 && telephoneNmbr.startsWith("555")){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
