package javahomeworkweek9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_Zone1StationName {
    //static method
    public static void bakerStreet(){
        ArrayList<String> bakerstreet = new ArrayList();
        bakerstreet.add("Bakerloo");
        bakerstreet.add("Jubliee");
        bakerstreet.add("Metropolitan");
        bakerstreet.add("Hammersmith & City");
        for (String station :bakerstreet){
            System.out.println("Baker Street Station Serves : " + station + "Line");
        }
    }
    //static method
    public static void greenPark(){
        ArrayList<String> greenpark = new ArrayList<>();
        greenpark.add("Victoria");
        greenpark.add("Jubilee");
        greenpark.add("Piccadilly");
        for (String station : greenpark){
            System.out.println("GreenPark Station Serves :" + "Line");
        }
    }
    //static method
    public static void westMinster(){
        ArrayList <String> westminster = new ArrayList<>();
        westminster.add("District");
        westminster.add("Circle");
        westminster.add("Jubilee");
        for (String station  : westminster){
            System.out.println("Westminster Station Serves : " + station + "Line");
        }
    }
    //static method
    public static void oxfordCircle(){
        ArrayList <String> oxfordcircle = new ArrayList<>();
        oxfordcircle.add("Bakerloo");
        oxfordcircle.add("Central");
        oxfordcircle.add("Victoria");
        for (String station : oxfordcircle){
            System.out.println("Oxford Circle Station Serves : " + station + "List");
        }
    }
    public static void bank(){
        ArrayList<String> bank = new ArrayList<>();
        bank.add("Northern");
        bank.add("DLR");
        bank.add("Central");
        bank.add("Waterloo and City");
        for (String station : bank){
            System.out.println("Bank Station Serves :" + station + "Line");
        }


    }
    //calling all methods into main method with using switch loop
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zone 1 Stations : Bank,BakerStreet, oxford Circle,GreenPark,WestMinster");
        System.out.println("Please enter station name from above list to find which line passes" );
        String stn = scanner.nextLine().toLowerCase();
        System.out.println(" ");
        scanner.close();
        switch ((stn)){
            case "bank" :
                bank();
                break;
            case "baker street" :
                bakerStreet();
                break;
            case "oxford circle" :
                oxfordCircle();
                break;
            case "greenpark" :
                greenPark();
                break;
            case "westminster" :
                westMinster();
                break;
            default:
                System.out.println("You have entered an invalid station name :");



        }

    }


}
