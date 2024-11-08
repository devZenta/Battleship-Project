package go;
import java.util.Scanner;
import utils.*;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Enter the number of players: ");
            int numberOfPlayers = scanner.nextInt();
            
            Game game = new Game(numberOfPlayers);
            System.out.println();

            for (int i = 0; i < numberOfPlayers; i++) {

                System.out.println("Enter username of player " + (i + 1) + " : ");
                String name = scanner.next();
                Player player = new Player(name, i, false);
                game.createPlayers(player);
                System.out.println();

            }

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

            GameBoard gameBoard = new GameBoard(width, height);
            System.out.println();
            System.out.println("Game Board : ");
            gameBoard.displayBoard(width, height);

            boolean tempResult = game.verifyWin();

            while ( tempResult == false ) {
                game.switchPlayer(0);
                tempResult = game.verifyWin();
            }

        }
    }
}