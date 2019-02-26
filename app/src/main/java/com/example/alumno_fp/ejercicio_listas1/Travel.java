package com.example.alumno_fp.ejercicio_listas1;

public class Travel {

    private String place, city, country;

    public Travel(String place, String city, String country) {
        this.place = place;
        this.city = city;
        this.country = country;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "place='" + place + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
