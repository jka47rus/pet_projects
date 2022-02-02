package Bikes;

import java.util.*;

public class Bikes  {
    public static void main(String[] args) {

        List <Bike> bikes = new ArrayList<>();
        bikes.add (new Bike("Scott", 29));
        bikes.add(new Bike("Cube", 29));
        bikes.add(new Bike("Merida", 30));

        Collections.sort(bikes, new Comparator<Bike>() {
            @Override
            public int compare(Bike o1, Bike o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        List <MotoBike> motoBikes = new ArrayList<>();
        motoBikes.add(new MotoBike("Suzuki", 11));
        motoBikes.add(new MotoBike("Yamaha", 10));

        Bike bk2 = bikes.get(1);
        Bike mb1 = motoBikes.get(0);

        test(bikes);
        test2(motoBikes);
        bk2.turn();
        mb1.turn();
        }

    private static void test (List<? extends Bike> list){
        for (Bike bike: list){
            bike.ride();
        }
                  }

      private static void test2 (List<? extends MotoBike> list){
            for (MotoBike motoBike: list){
                motoBike.ride();
            }
        }
}


class Bike implements Riding {
    public String name;
    private int gear;
    public Bike (String name, int gear){
        this.name = name;
        this.gear = gear;
    }
    public Bike(String name) {
    }

    public String toString() {
        return name + " " + gear + " speeds";
    }

    public void ride (){
        System.out.println(name + " is riding");
    }

    public void turn() {
        Transmission transmission = new Transmission();
        transmission.turned();
    }



    private class Transmission{
        public void turned(){
            System.out.println(name + " bike has " + gear + " gears transmission");
        }
    }
    }


