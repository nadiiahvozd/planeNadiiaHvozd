package org.prog;

public class PlaneMainClass {

    public static void main(String... args) {
        Plane PeremogaPlane = new Plane("Wizzair", "Ukraine", "FreeWorld");
        Plane SunPlane = new Plane("Ryanair", "Poland", "Cyprus");

        Plane NadiaPlane = new Plane("SkyUp", "Ukraine", "Ukraine");


        NadiaPlane.changeCountryArriving("Sweden");

        changeCountryArriving(NadiaPlane, "Sweden");

        timeOfDeparturePeremogaPlane("10-00", "10-00");
        timeOfDeparturePeremogaPlane("10-00", "10-20");
        timeOfDepartureSunPlane("14-00".equals("14-00"));
        timeOfDepartureSunPlane("14-00".equals("14-20"));
    }
    public static void changeCountryArriving(Plane NadiiaPlane, String ca, String cd, String newCountryArriving){
        if (cd.equals(ca)) {
            System.out.println("Country of the departure doesnt change");}
            if (NadiiaPlane.setCountryArriving().equals(newCountryArriving)) {
            System.out.println("Country of the departure doesnt change");
        } else{
            System.out.println("Attention, country of the arriving has changed to " + newCountryArriving);
            NadiiaPlane.changeCountryArriving(newCountryArriving);
        }
    }
public static void timeOfDeparturePeremogaPlane(String t1, String t2) {
        if (t1.equals(t2)) {
            System.out.println("Plane takes off in time");
        } else {
            System.out.println("Plane does not take off in time");
        }
    }
    public static void timeOfDepartureSunPlane(boolean aFlag){ if (aFlag) {
        System.out.println("Plane takes off in time");
    } else {
        System.out.println("Plane does not take off in time");
    }}
}