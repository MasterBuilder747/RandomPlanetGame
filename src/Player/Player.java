package Player;

public class Player {

    //NOTE: most of this is ideas for now, will get implemented when needed
    //everything is doubles for now so that there is unification when modifying them with a disease

    //variables, linked only to the player, 0-100
    double health = 100; //when 0 the player is dead and the game is over
    double food = 100; //food goes gradually down by some value, must replenish
    double water = 100; //water goes down faster than food, similar implementation
    double sleep = 100.0; //same principle, but this value is exponentially decreasing,
    // fast at first then goes slower in decreasing, since the longer you go without sleep, the same amount of fatigue you feel
    //replenishing this is a little more complicated
    double energy = 100.0; //when 0, the player is unable to do anything and must rest for a significant amount of time, or sleep


    //balance based variables, where 0 is the best possible value to survive
    double oxygen = 0; //value for the right amount of oxygen in the air
    //balance based, but a value other than 0 is used as the base value
    double gravity = 9.81; //amount of gravity measured in m/s, cannot be lower than 0, 0 is space
    double temp = 20.0; //measured in celsius, where 20 C is room temperature, converter to F needs to be implemented


    //additional values, not to do with survival
    double coins = 0; //0-max in value, ~2.1 Billion, the currency in the game

    //diseases can be implemented (use an object)
    //it can be called by name and it modifies a combination of the player's variables, depending on the disease


}
