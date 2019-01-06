package com.manny;

public class Main {

    public static void main(String[] args) {
	    // Encapsulation is the mechanism that allows you to restrict access to certain components in
        // the Object(s) being created.
        // So, you're able to protect the members of a class from external access in order to guard against
        // unauthorized access (not security).
        // We're not talking about security here.  More like classes or code outside of the class that your
        // working on from accessing the inner workings of a class.
        // It can be very useful to hide that inner working from another class to give you more control and
        // to be able to enable you to change things without breaking code elsewhere.
        // Encapsulation is making our fields private and making sure the fields with the class are not accessible
        // to any outside classes.
        // Another cool feature of Encapsulation is we can make name changes to private fields and it will not affect
        // any other code. Protecting members of the class and some methods from external access to prevent
        // unauthorized set up.

//        Player player = new Player();
//        player.name = "Manny";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());

          EnhancedPlayer player = new EnhancedPlayer("Manny", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
