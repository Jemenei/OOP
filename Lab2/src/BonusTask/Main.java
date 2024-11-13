package BonusTask;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Chess Game!");
        System.out.print("Choose your side (white/black): ");
        String playerColor = scanner.next().toLowerCase();

        if (!playerColor.equals("white") && !playerColor.equals("black")) {
            System.out.println("Invalid choice, please restart the game and choose 'white' or 'black'.");
            return;
        }

        boolean isGameOver = false;
        while (!isGameOver) {
            board.drawBoard();
            System.out.println("It's " + playerColor + "'s turn.");

            System.out.print("Enter the position of the piece you want to move (e.g., E2): ");
            String fromInput = scanner.next();
            Position fromPos = Board.parsePosition(fromInput.toUpperCase());

            Piece selectedPiece = board.getPiece(fromPos);
            if (selectedPiece == null || !selectedPiece.getColor().equals(playerColor)) {
                System.out.println("No " + playerColor + " piece at that position. Try again.");
                System.out.println("---------------------------------------------------");
                continue;
            }

            System.out.print("Enter the target position to move to (e.g., E4): ");
            String toInput = scanner.next();
            Position toPos = Board.parsePosition(toInput.toUpperCase());

            if (board.movePiece(fromPos, toPos)) {
                System.out.println("Move successful: " + fromInput + " to " + toInput);
                board.drawBoard();  // Вывод доски после успешного хода
            } else {
                System.out.println("Illegal move. Try again.");
            }
            System.out.println("---------------------------------------------------");
        }
    }
}
