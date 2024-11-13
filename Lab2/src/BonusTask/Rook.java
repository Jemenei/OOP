package BonusTask;

public class Rook extends Piece {
    public Rook(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        return position.getX() == newPosition.getX() || position.getY() == newPosition.getY();
    }
}
