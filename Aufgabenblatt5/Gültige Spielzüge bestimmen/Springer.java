import java.util.ArrayList;

public class Springer implements Spielfigur {
    private Position position;
    private boolean black;
    
    public Springer(Position position, boolean black) {
        this.position = position;
        this.black = black;
    }
    @Override
    public ArrayList<Position> getMoves() {
        ArrayList<Position> list = new ArrayList<Position>();
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if (this.checkValidMove(new Position(x,y))) {
                    list.add(new Position(x,y));
                }
            }
        }
        return list;
    }
    @Override
    public Position getPosition() {
        return this.position;
    }
    @Override
    public void setPosition(Position position) {
        this.position = position;
    }
    @Override
    public boolean checkValidMove(Position position) {
        if (position.getX()<0 || position.getX()>7 || position.getY()<0 || position.getY()>7) {
            return false;
        }
        boolean validMuster = Math.pow(Math.abs(position.getX()-this.position.getX()),2)+(Math.pow(Math.abs(position.getY()-this.position.getY()),2)) == 5;
        boolean freiesFeld = false;
        if (Main.spielfeld[position.getX()][position.getY()] == null) {
            freiesFeld = true;
        } else {
            freiesFeld = this.black != Main.spielfeld[position.getX()][position.getY()].isBlack();
        }
    return validMuster && freiesFeld;
    }
    @Override
    public boolean isBlack() {
        return this.black;
    }
}
