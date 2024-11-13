package BonusTask;

public class King extends Piece {
    public King(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        int dx = Math.abs(position.getX() - newPosition.getX());
        int dy = Math.abs(position.getY() - newPosition.getY());
        return dx <= 1 && dy <= 1;
    }
}
