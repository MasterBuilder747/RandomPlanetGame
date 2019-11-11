package Resources.Natural.Elements;

public class Element {

    //add properties of what defines an element, then expand
    //elements will be what the player can use as resources on a given planet
    //this is either a chemical dust, or a solid metal (ingot)

    //these properties cannot change
    private String name; //name of the element
    private String abv; //one or two letters that represent the name of the element
    private double aWeight; ///atomic weight
    private int protons;
    private int neutrons; //can be 0
    private int electrons;
    //private String electOrder; //string of numbers in order, separated by white space

    //material properties
    private String series; //different accepted strings:
    //list
    private int state; //at 273K, 0 = solid, 1 = liquid, 2 = gas, 3 = plasma
    private double meltPoint; //temp in K
    private double boilPoint; //temp in K, must be greater than meltPoint
    private double electroNeg;
    private double electroAff;
    private double valence;
    private double ioniz;
    private double radius;
    private double hardness;
    private double modulus;
    private double density;
    private double conductivity;
    private double heat;
    private double abundance;

    public Element (String nm, int st, int e, int p, int n) {
        nm = name;
        st = state;

        e = electrons;
        p = protons;
        n = neutrons;
    }


}
