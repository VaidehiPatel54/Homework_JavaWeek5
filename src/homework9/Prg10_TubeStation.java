package homework9;


import jdk.nashorn.internal.objects.NativeString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*  10. Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name
*/
public class Prg10_TubeStation {

    public static void main(String[] args) {

        HashMap<String, String> station = new HashMap<>();

        station.put("Angel", "\nNorthen Line\nDLR\nLondon Overground ");
        station.put("Bank", "\nNorthen Line\nWaterloo & City Line\nDLR");
        station.put("Barbican", "\nCircle Line\nHammersmith & City Line\nMetropolitan Line");
        station.put("Bond Street", "\nCentral Line\nJubilee Line");
        station.put("Charing cross", "\nLondon Overground\nDistrict Line\nBakerloo Line ");
        station.put("Euston", "\nNorthen Line\nLondon Overground");
        station.put("Holborn", "\nPiccadilly Line\nCentral Line");
        station.put("Hoxton", "\nLondon Overground");
        station.put("Elephant & castle", "\nLondon Overground\nNorthen Line\nBakerloo Line");
        station.put("Lancaster gate", "\nCentral Line");
        station.put("Marble arch", "\nCentral Line");
        station.put("Paddington", "\nBakerloo Line\nCircle Line\nDistrict Line\nHammersmith & City Line");
        station.put("Pimlico", "\nVictoria Line");
        station.put("Piccadilly circus", "\nPiccadilly Line\nBakerloo Line");
        station.put("Southwark", "\nJubilee Line");
        station.put("Temple", "\nCircle Line\nDistrict Line");
        station.put("Vauxhall", "\nVictoria Line\nLondon Overground");
        station.put("Victoria", "\nVictoria Line\nCircle Line\nDistrict Line");
        station.put("Waterloo", "\nNorthen Line\nWaterloo & city Line\nBakerloo Line");
        station.put("West Minister", "Circle Line\nDistrict Line\nJubilee Line");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of station from following list:  \n \nAngel, Bank, Barbican, Bond Street,Charing Cross,Euston," +
                "\nHolborn, Elephant & Castle, Hoxton, Lancaster Gate, Marble Arch," +
                "\nPaddington, Piccadilly Circus, Pimlico, Southwark," +
                "\nTemple,Vauxhall, Victoria, Waterloo ,West Minister\n");
        String name = sc.nextLine();



        System.out.println("Entered station is in zone 1" + station.get(name));

    }

}



