package BonusTask;

public class Board {
    private Piece[][] board = new Piece[8][8];

    public Board() {
        initializePieces();
    }

    private void initializePieces() {
        // Расстановка черных фигур
        board[0][0] = new Rook(new Position(0, 0), "black");
        board[0][1] = new Knight(new Position(0, 1), "black");
        board[0][2] = new Bishop(new Position(0, 2), "black");
        board[0][3] = new Queen(new Position(0, 3), "black");
        board[0][4] = new King(new Position(0, 4), "black");
        board[0][5] = new Bishop(new Position(0, 5), "black");
        board[0][6] = new Knight(new Position(0, 6), "black");
        board[0][7] = new Rook(new Position(0, 7), "black");
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(new Position(1, i), "black");
        }

        // Расстановка белых фигур
        board[7][0] = new Rook(new Position(7, 0), "white");
        board[7][1] = new Knight(new Position(7, 1), "white");
        board[7][2] = new Bishop(new Position(7, 2), "white");
        board[7][3] = new Queen(new Position(7, 3), "white");
        board[7][4] = new King(new Position(7, 4), "white");
        board[7][5] = new Bishop(new Position(7, 5), "white");
        board[7][6] = new Knight(new Position(7, 6), "white");
        board[7][7] = new Rook(new Position(7, 7), "white");
        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn(new Position(6, i), "white");
        }
    }

    public void drawBoard() {
        System.out.println("   A B C D E F G H");
        for (int i = 0; i < 8; i++) {
            System.out.print(8 - i + " ");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print(". ");
                } else {
                    char pieceSymbol = getPieceSymbol(board[i][j]);
                    System.out.print(pieceSymbol + " ");
                }
            }
            System.out.println(8 - i);
        }
        System.out.println("   A B C D E F G H");
    }

    private char getPieceSymbol(Piece piece) {
        char symbol = piece.getClass().getSimpleName().charAt(0);
        return piece.getColor().equals("white") ? Character.toUpperCase(symbol) : Character.toLowerCase(symbol);
    }

    public boolean movePiece(Position from, Position to) {
        Piece piece = board[from.getX()][from.getY()];
        if (piece != null && piece.isLegalMove(to) && to.isValid()) {
            board[to.getX()][to.getY()] = piece;
            piece.setPosition(to);
            if (piece instanceof Pawn) {
                ((Pawn) piece).setFirstMove(false);
            }
            board[from.getX()][from.getY()] = null;
            return true;
        }
        return false;
    }

    public Piece getPiece(Position position) {
        if (position.isValid()) {
            return board[position.getX()][position.getY()];
        }
        return null;
    }

    public static Position parsePosition(String pos) {
        int x = 8 - Character.getNumericValue(pos.charAt(1));
        int y = pos.charAt(0) - 'A';
        return new Position(x, y);
    }
}
