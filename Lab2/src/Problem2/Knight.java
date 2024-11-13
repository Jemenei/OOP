package Problem2;

public class Knight extends Piece {
    public Knight(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position target) {
        int dx = Math.abs(position.getX() - target.getX());
        int dy = Math.abs(position.getY() - target.getY());
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}
