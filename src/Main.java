import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    System.out.println(("Hello! This calculator will calkulate the distance your car will travel!\n")+
            ("Enter speed your car in  km/h: "));
    var scanner= new Scanner(System.in);
    var speed = scanner.nextDouble();
    var stop_program =-1;
    while(stop_program!=0) {
        System.out.println("Enter the time in hour!");
        var time = scanner.nextDouble();
        System.out.println(("Congratulations! If you drive at a speed of " + speed) +
                (" km/h, then in " + time + " hours, you will cover approximately " + speed * time + " kilometers.\n")+
        ("This program working in cycle, if you want stop it, enter 0"));
        stop_program= scanner.nextInt();
    }
    }
}