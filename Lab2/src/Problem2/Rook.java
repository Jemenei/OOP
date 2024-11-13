package Problem2;

public class Rook extends Piece {
    public Rook(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position target) {
        return position.getX() == target.getX() || position.getY() == target.getY();
    }
}
