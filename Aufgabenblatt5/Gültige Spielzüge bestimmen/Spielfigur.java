public interface Spielfigur {
    public ArrayList<Position> getMoves();
    public Position get Position();
    public void setPosition();
    public boolean checkValidMove();
    public boolean isBlack();
}
