package se.mohamad.dicegame;

import java.util.Scanner; // Importerar Scanner-klassen för att läsa in input från användaren.



public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Skapar en instans av Scanner för att läsa input från användaren.

        // Tar in namn på spelare 1 från användaren och skapar ett Player-objekt för spelare 1.
        System.out.print("Ange namn på spelare 1: ");
        String player1Name = scanner.nextLine(); // Läser in spelarens namn som en sträng.
        Player player1 = new Player(player1Name); // Skapar ett Player-objekt för spelare 1 med det angivna namnet.

        // Tar in namn på spelare 2 från användaren och skapar ett Player-objekt för spelare 2.
        System.out.print("Ange namn på spelare 2: ");
        String player2Name = scanner.nextLine(); // Läser in spelarens namn som en sträng.
        Player player2 = new Player(player2Name); // Skapar ett Player-objekt för spelare 2 med det angivna namnet.

        // Bestämmer hur många rundor spelet ska pågå. I detta fall har vi satt det till 2 rundor.
        int rounds = 2;

        // En loop som kör spelet över det förutbestämda antalet rundor.
        for (int i = 1; i <= rounds; i++) {
            System.out.println("\nRunda " + i); // Skriver ut vilken runda som spelas.

            // Spelare 1 kastar tärningen.
            System.out.println(player1.name + "'s tur att kasta."); // Meddelar att det är spelare 1:s tur.
            player1.rollDice(); // Anropar rollDice-metoden för att kasta tärningen och uppdatera poängen för spelare 1.
            player1.displayScore(); // Visar spelare 1:s nuvarande poäng.

            // Spelare 2 kastar tärningen.
            System.out.println(player2.name + "'s tur att kasta."); // Meddelar att det är spelare 2:s tur.
            player2.rollDice(); // Anropar rollDice-metoden för att kasta tärningen och uppdatera poängen för spelare 2.
            player2.displayScore(); // Visar spelare 2:s nuvarande poäng.
        }

        // Efter alla rundor är slut, bestäms vinnaren baserat på högst poäng.
        System.out.println("\nSpelet är över!");
        if (player1.score > player2.score) { // Om spelare 1 har högre poäng än spelare 2.
            System.out.println(player1.name + " vinner med " + player1.score + " poäng!"); // Spelare 1 vinner.
        } else if (player2.score > player1.score) { // Om spelare 2 har högre poäng än spelare 1.
            System.out.println(player2.name + " vinner med " + player2.score + " poäng!"); // Spelare 2 vinner.
        } else { // Om båda spelarna har samma poäng.
            System.out.println("Det är oavgjort med båda spelarna på " + player1.score + " poäng!"); // Spelet är oavgjort.
        }

        scanner.close(); // Stänger Scanner-objektet för att frigöra resurser.
    }
}
