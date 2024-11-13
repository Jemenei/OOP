package BonusTask;

public class Pawn extends Piece {
    private boolean isFirstMove = true;

    public Pawn(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        int dx = newPosition.getX() - position.getX();
        int dy = Math.abs(newPosition.getY() - position.getY());

        if (color.equals("white")) {
            return (dy == 0 && (dx == -1 || (dx == -2 && isFirstMove)));
        } else {
            return (dy == 0 && (dx == 1 || (dx == 2 && isFirstMove)));
        }
    }

    public void setFirstMove(boolean isFirstMove) {
        this.isFirstMove = isFirstMove;
    }
}

