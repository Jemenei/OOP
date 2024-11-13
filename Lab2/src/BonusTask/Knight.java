package BonusTask;

public class Knight extends Piece {
    public Knight(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        int dx = Math.abs(position.getX() - newPosition.getX());
        int dy = Math.abs(position.getY() - newPosition.getY());
        return dx * dy == 2;
    }
}
