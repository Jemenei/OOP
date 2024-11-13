package BonusTask;

public abstract class Piece {
    protected Position position;
    protected String color;

    public Piece(Position position, String color) {
        this.position = position;
        this.color = color;
    }

    public abstract boolean isLegalMove(Position newPosition);

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getColor() {
        return color;
    }
}
