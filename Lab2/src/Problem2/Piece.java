package Problem2;

public abstract class Piece {
    protected Position position;

    public Piece(Position position) {
        this.position = position;
    }

    public abstract boolean isLegalMove(Position target);
}