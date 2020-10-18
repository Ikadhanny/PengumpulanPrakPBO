package com.IkadhannyYudyanpratama.Tugas.No1;

public class Overloading {
    public static void main(String[] args) {
        Club club = new Club();
        Club club1 = new Club("Chelsea");
        Club club2 = new Club("Juventus", "Juara ke-1, Serie A");
        Club club3 = new Club("Barcelona", 1899, "Camp Nou");
        Club club4 = new Club("Bayern München", 1955, "Stadion Santiago Bernabéu", 20, "Juara saat ini");

        club.getTeam();
        club1.getTeam();
        club2.getTeam();
        club3.getTeam();
        club4.getTeam();
    }
}
