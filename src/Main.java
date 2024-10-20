import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Destination dest = new Destination();
        System.out.println("************");
        System.out.println("Please find below the list of destinations");
        String dests[]=dest.showDestinations();
        for(String des : dests){
            System.out.println(des);
        }
        System.out.println("Enter the destination you want to update");
        Scanner sc = new Scanner(System.in);
        dest.destinationConfirmation(sc.next());
    }
}