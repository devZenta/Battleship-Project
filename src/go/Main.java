package go;
import java.util.Scanner;
import utils.*;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            //création d'une partie
            Game game = new Game();
            
            System.out.println("Enter the number of players: ");
            int numberOfPlayers = scanner.nextInt();
            
            //Initialisation du nombre de joueurs
            game.getNbPlayers(numberOfPlayers);

            System.out.println();

            //Création des joueurs
            for (int i = 0; i < numberOfPlayers; i++) {

                System.out.println("Enter username of player " + (i + 1) + " : ");
                String name = scanner.next();
                Player player = new Player(name, i, true);
                game.createPlayers(player);
                System.out.println();

            }

            //Affichage des joueurs
            game.displayPlayer();
            System.out.println();

            //AircraftCarrier aircraftCarrier = new AircraftCarrier("Aircraft Carrier", "AC01", 0, 0, 0, 5);
            //Cruiser cruiser = new Cruiser("Cruiser", "C01", 0, 0, 1, 4);
            //AntiTorpedo antiTorpedo = new AntiTorpedo("Anti-Torpedo", "AT01", 0, 0, 0, 3);
            //Submarine submarine = new Submarine("Submarine", "S01", 0, 0, 1, 3);
            //TorpedoBoat torpedoBoat = new TorpedoBoat("Torpedo Boat", "TB01", 0, 0, 0, 2);
            //

            System.out.println("Enter the game width : ");
            int width = scanner.nextInt();

            System.out.println("Enter the game height : ");
            int height = scanner.nextInt();

            //Création du plateau de jeu
            GameBoard gameBoard = new GameBoard(width, height);

            System.out.println();
            System.out.println("Game Board : ");

            //Affichage du plateau de jeu
            gameBoard.displayBoard();

            //Vérification de la victoire
            while ( game.verifyWin() == false ) {
                game.switchPlayer(0);
            }

        }
    }
}