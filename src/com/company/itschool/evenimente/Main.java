package com.company.itschool.evenimente;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int optiune = -1;
        while (optiune != 0) {
            System.out.println("1.Add event");
            System.out.println("2.Display events");
            System.out.println("3.Delete event");
            System.out.println("0.Exit");
            optiune = scanner.nextInt();
            scanner.nextLine();
            FileEventWriter fileEventWriter = new FileEventWriter();
            if (optiune == 1) {
                System.out.println("Enter event name:");
                String name = scanner.nextLine();
                System.out.println("Enter date of event");
                String date = scanner.nextLine();
                System.out.println("Enter location of event");
                String location = scanner.nextLine();
                Evenimente evenimente = new Evenimente(name, date, location);

                List<Evenimente> eventsFromFile = fileEventWriter.read();
                eventsFromFile.add(evenimente);
                fileEventWriter.write(eventsFromFile);
            } else if (optiune == 2) {
                List<Evenimente> eventsFromFile = fileEventWriter.read();
                for (Evenimente event : eventsFromFile) {
                    System.out.println(event.getName() + " " + event.getLocation() + " " +
                            event.getDate());
                }
            } else if (optiune == 3){
                System.out.println("Enter name of event that wil be deleted:");
                String nameOfEvent = scanner.nextLine();
                List<Evenimente> eventsFromFile =  fileEventWriter.read();
                for (int i = 0 ; i < eventsFromFile.size() ; i++){
                    Evenimente eveniment = eventsFromFile.get(i);
                    if(eveniment.getName().equals(nameOfEvent)){
                        eventsFromFile.remove(eveniment);
                    }
                }
                fileEventWriter.write(eventsFromFile);
            }
        }
    }
}
