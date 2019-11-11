package Main;

import java.util.*;
import Player.Player;
import Resources.Natural.Elements.Element;
import Universe.Galaxy.Arm.StarRegion.StarCluster.Star.Planet.Planet;

public class Main {

    public static void main(String[] args) {

        //all handles of the game, all of the engines are put here, implements and renders the game

        System.out.println("===Random Planet Game===");

        //define objects
        //this describes the process a bit better
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        //setup
        //initialize the player
        Player p = new Player();

        Element e = new Element("name", 2, 1, 1, 0);
        

        //generate random planets
        Planet pl = new Planet();

    }

}
