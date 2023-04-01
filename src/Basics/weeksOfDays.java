package Basics;

import java.util.Random;

public enum weeksOfDays {
    MON,TUES,WED,THURS,FRI,SAT,SUN;

    // To assign a special value

    public int getCustomeValue() {
        switch (this) {
            case WED: return 5;
            case TUES: return 20;
            default: return 0;
        }
    }
}

class example {
    public static void main(String[] args) {
        weeksOfDays t = weeksOfDays.TUES;
        System.out.println(t); // TUES
        System.out.println(t.name() + " " + t.ordinal()); // TUES 1

        int random = new Random().nextInt(7);
        weeksOfDays[] ra = weeksOfDays.values();
        System.out.println(ra[random]);

        if(ra[random] == weeksOfDays.WED) {
            System.out.println("Wed detected");
        }

        for(weeksOfDays temp:weeksOfDays.values()) {
            System.out.println(temp.getCustomeValue() + temp.name() + temp.ordinal());
        }

//        System.out.println(weeksOfDays.FRI == "FRI"); Error _> Type Compile
    }
}
