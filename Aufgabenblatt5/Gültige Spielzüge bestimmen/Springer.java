public class Springer implements Spielfigur {
    private Position position;
    private boolean black;
    
    public Springer(Position position, boolean black) {
        this.position = position;
        this.black = black;
    }
    @Override
    public ArrayList<Position> getMoves() {
        
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
        
    }
    @Override
    public boolean isBlack() {
        return this.black;
    }
}
