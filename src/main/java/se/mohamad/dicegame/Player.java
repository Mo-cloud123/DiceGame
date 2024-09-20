package se.mohamad.dicegame;

import java.util.Random;

public class Player {

        String name; // Variabel för att lagra spelarens namn.
        int score; // Variabel för att lagra spelarens poäng.

        // Konstruktor för Player-klassen, initierar spelarens namn och sätter poängen till 0.
        public Player(String name) {
            this.name = name; // Tilldelar den mottagna namnet till spelarens namn.
            this.score = 0; // Sätter initialpoängen till 0.
        }

        // Metod för att kasta tärningen och uppdatera spelarens poäng.
        public void rollDice() {
            Random random = new Random(); // Skapar en ny instans av Random för att generera slumpmässiga tal.
            int roll = random.nextInt(6) + 1; // Genererar ett tal mellan 1 och 6 (simulerar ett tärningskast).
            System.out.println(name + " kastade: " + roll); // Skriver ut vad spelaren kastade.
            score += roll; // Lägger till det kastade värdet till spelarens poäng.
        }

        // Metod för att visa spelarens nuvarande poäng.
        public void displayScore() {
            System.out.println(name + "'s poäng: " + score); // Skriver ut spelarens namn och aktuella poäng.
        }
    }
