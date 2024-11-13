package Problem2;

public class Pawn extends Piece {
    public Pawn(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position target) {
        return position.getY() == target.getY() && target.getX() == position.getX() + 1;
    }
}

