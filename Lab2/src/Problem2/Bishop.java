package Problem2;

public class Bishop extends Piece {
    public Bishop(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position target) {
        return Math.abs(position.getX() - target.getX()) == Math.abs(position.getY() - target.getY());
    }
}

