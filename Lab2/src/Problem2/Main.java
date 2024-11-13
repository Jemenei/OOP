package Problem2;


public class Main {
    public static void main(String[] args) {
        Position start = new Position(4, 4);
        Position move1 = new Position(4, 6);
        Position move2 = new Position(6, 4);


        Piece rook = new Rook(start);
        System.out.println("Rook move (4,4) to (4,6): " + rook.isLegalMove(move1));
        System.out.println("Rook move (4,4) to (6,4): " + rook.isLegalMove(move2));


        Piece king = new King(start);
        System.out.println("King move (4,4) to (4,5): " + king.isLegalMove(new Position(4, 5)));
        System.out.println("King move (4,4) to (6,4): " + king.isLegalMove(move2));


        Piece queen = new Queen(start);
        System.out.println("Queen move (4,4) to (4,6): " + queen.isLegalMove(move1));
        System.out.println("Queen move (4,4) to (6,6): " + queen.isLegalMove(new Position(6, 6)));


        Piece bishop = new Bishop(start);
        System.out.println("Bishop move (4,4) to (6,6): " + bishop.isLegalMove(new Position(6, 6)));
        System.out.println("Bishop move (4,4) to (4,6): " + bishop.isLegalMove(move1));


        Piece knight = new Knight(start);
        System.out.println("Knight move (4,4) to (6,5): " + knight.isLegalMove(new Position(6, 5)));
        System.out.println("Knight move (4,4) to (6,6): " + knight.isLegalMove(new Position(6, 6)));


        Piece pawn = new Pawn(new Position(1, 4));
        System.out.println("Pawn move (1,4) to (2,4): " + pawn.isLegalMove(new Position(2, 4)));
        System.out.println("Pawn move (1,4) to (3,4): " + pawn.isLegalMove(new Position(3, 4)));
    }
}

