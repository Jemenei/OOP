package Problem2;

public class King extends Piece {
    public King(Position position) {
        super(position);
    }


    @Override
    public boolean isLegalMove(Position target) {
        return Math.abs(position.getX() - target.getX()) <= 1 &&
                Math.abs(position.getY() - target.getY()) <= 1;
    }
}
