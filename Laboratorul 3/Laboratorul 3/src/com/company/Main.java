package com.company;

import java.util.*;

public class Main {

    public static class City
    {
        private String numeOras;
        private List<Location> locatii = new ArrayList<>();

        public City(String numeOras) {
            this.numeOras = numeOras;
            System.out.println("Ai creat orasul " + this.numeOras);
        }

        public String getNumeOras() {
            return numeOras;
        }

        public void setNumeOras(String numeOras) {
            this.numeOras = numeOras;
        }


        public void addLocation(Location l)
        {
            locatii.add(l);
            System.out.println("Ai adaugat locatia " + l.numeLocatie + " la lista de locatii a orasului " + this.numeOras);
        }

        @Override
        public String toString() {
            return "City{" +
                    "numeOras='" + this.getNumeOras() + '\'' +
                    ", locatii=" + this.locatii+
                    '}';
        }

        public void printLocatii()
        {
            System.out.println(this.toString());
        }

    }
    abstract static class Location {
        protected String numeLocatie;
        protected Map<Location, Integer> cost = new HashMap<>();

        public Location(String numeLocatie) {
            this.numeLocatie = numeLocatie;
            System.out.println("Ai creat locatia " + this.numeLocatie);
        }

        public String getNumeLocatie() {
            return numeLocatie;
        }

        public void setNumeLocatie(String numeLocatie) {
            this.numeLocatie = numeLocatie;
        }

        public void setCost(Location node, int value) {
            cost.put(node, value);
        }
    }

    public static class Hotel extends Location
    {
        protected int nrStele;

        public Hotel(String numeLocatie, int nrStele) {
            super(numeLocatie);
            this.nrStele = nrStele;
            System.out.println("Ai creat hotelul " + this.numeLocatie + " de " + this.nrStele + " stele ");
        }
    }

    public static void main(String[] args) {
        // write your code here
        City c = new City("Galati");
        Hotel h = new Hotel("Viva", 3);
        c.addLocation(h);
        c.printLocatii();

    }
}

