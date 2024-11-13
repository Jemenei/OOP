package Problem2;

public class Queen extends Piece {
    public Queen(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position target) {
        return position.getX() == target.getX() || position.getY() == target.getY() ||
                Math.abs(position.getX() - target.getX()) == Math.abs(position.getY() - target.getY());
    }
}

