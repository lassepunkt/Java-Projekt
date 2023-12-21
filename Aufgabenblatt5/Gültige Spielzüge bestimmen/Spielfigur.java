import java.util.ArrayList;

public interface Spielfigur {
    public ArrayList<Position> getMoves();
    public Position getPosition();
    public void setPosition(Position position);
    public boolean checkValidMove(Position position);
    public boolean isBlack();
}
