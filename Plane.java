package org.prog;

public class Plane {

  public  String aviacompany;
  public  String countryDeparture;
  public  String countryArriving;

  public Plane(String a, String cd, String ca) {
    aviacompany = a;
    countryDeparture = cd;
    countryArriving = ca;
  }
public void changeCountryArriving(String ca) {
    countryArriving = ca;
}
  public String setCountryArriving(){
    return countryArriving;
  }

  public String newCountryArriving() {
    return countryArriving;
  }
}

