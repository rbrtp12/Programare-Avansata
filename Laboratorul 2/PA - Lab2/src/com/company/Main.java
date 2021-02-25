package com.company;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static class Source{
        protected String name;
        protected SourceType tip;

        public enum SourceType
        {
            WAREHOUSE, FACTORY;
        }

        public Source(String name, SourceType tip)
        {
            if(name == null)
                System.err.println("Numele sursei nu poate fi null");
            else
                this.name = name;
            this.tip = tip;
            System.out.println("Ai creat o sursa cu numele " + name + " de tip " + tip);
        }

        public String getName() {
            return name;
        }

        public SourceType getTip() {
            return tip;
        }

        public void setName(String name) {
            if(name == "")
                System.err.println("Numele sursei nu poate fi setat null");
            else {
                System.out.print("Ati schimbat numele sursei " + this.name);
                this.name = name;
                System.out.println(" in " + this.name);
            }
        }

        public void setTip(SourceType tip) {
            this.tip = tip;
        }


        @Override
        public String toString() {
            return "Source{" +
                    "name='" + name + '\'' +
                    ", tip=" + tip +
                    '}';
        }
    }

    public static class Destination
    {
        protected String name;

        public Destination(String name) {
            if (name == "")
                System.err.println("Numele destinatiei nu poate fi null");
            else {
                this.name = name;
                System.out.println("Ati creat o destinatie cu numele " + this.name);
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if(name == "")
                System.err.println("Numele destinatiei nu poate fi setat null");
            else{
                System.out.print("Ati schimbat numele destinatiei " + this.name);
                this.name = name;
                System.out.println(" in " + this.name);
            }

        }

        @Override
        public String toString() {
            return "Destination{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static class Problem
    {
        public Source[] sources;
        public Destination[] destinations;

        public int supply[];
        public int demand[];
        public int cost[][];

        public Problem(Source[] sources, Destination[] destinations, int[] supply, int[] demand, int[][] cost) {
            this.sources = sources;
            this.destinations = destinations;
            this.supply = supply;
            this.demand = demand;
            this.cost = cost;
        }

        public Source[] getSources() {
            return sources;
        }

        public void setSources(Source[] sources) {
            this.sources = sources;
        }

        public Destination[] getDestinations() {
            return destinations;
        }

        public void setDestinations(Destination[] destinations) {
            this.destinations = destinations;
        }

        public int[] getSupply() {
            return supply;
        }

        public void setSupply(int[] supply) {
            this.supply = supply;
        }

        public int[] getDemand() {
            return demand;
        }

        public void setDemand(int[] demand) {
            this.demand = demand;
        }

        public int[][] getCost() {
            return cost;
        }

        public void setCost(int[][] cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Problem{" +
                    "sources=" + Arrays.toString(sources) +
                    ", destinations=" + Arrays.toString(destinations) +
                    ", supply=" + Arrays.toString(supply) +
                    ", demand=" + Arrays.toString(demand) +
                    ", cost=" + Arrays.toString(cost) +
                    '}';
        }

        public void instantaExemplu() // printam toate posibilitatile de trasee sursa -> destinatie si costul lor
        {
            for(int i = 0;i<3;i++)
                for(int j = 0;j<3;j++)
            {
                if(demand[j] <= supply[i]) // daca cererea este mai mica sau egala cu "oferta", trimitem cat ni se cere
                System.out.println(sources[i].name + " -> " + destinations[j].name + ": " + demand[i] + "*" + cost[i][j] + "=" + demand[i]*cost[i][j]);
                else // daca cererea e mai mare decat "oferta", se va trimite doar cat are sursa
                    System.out.println(sources[i].name + " -> " + destinations[j].name + ": " + supply[i] + "*" + cost[i][j] + "=" + supply[i]*cost[i][j]);

            }
        }

    }

    public static void main(String[] args) {

    Source sursa1, sursa2, sursa3;

    sursa1 = new Source("s1", Source.SourceType.FACTORY);
    sursa2 = new Source("s2", Source.SourceType.WAREHOUSE);
    sursa3 = new Source("s3", Source.SourceType.WAREHOUSE);
    Destination destination1, destination2, destination3;
    destination1 = new Destination("d1");
    destination2 = new Destination("d2");
    destination3 = new Destination("d3");
    Source[] sources = {sursa1,sursa2, sursa3};
    Destination[] destinations = {destination1,destination2,destination3};
    int[] supply = {10,35,25}; // initializarea "ofertelor" fiecarei surse
    int[] demand = {20,25,25}; // initializarea cererii fiecarei destinatii
    int[][] cost = new int[3][3];
    cost[0][0] = 2;
    cost[0][1] = 3;
    cost[0][2] = 1;
    cost[1][0] = 5;
    cost[1][1] = 4;
    cost[1][2] = 8;
    cost[2][0] = 5;
    cost[2][1] = 6;
    cost[2][2] = 8; // initializarea tabelului de costuri
    Problem exempluProblema = new Problem(sources,destinations,supply,demand,cost); // construirea problemei
    exempluProblema.instantaExemplu(); // afisarea rezultatelor
    }
}
