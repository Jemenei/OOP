package BonusTask;

public class Queen extends Piece {
    public Queen(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        int dx = Math.abs(position.getX() - newPosition.getX());
        int dy = Math.abs(position.getY() - newPosition.getY());
        return dx == dy || position.getX() == newPosition.getX() || position.getY() == newPosition.getY();
    }
}
