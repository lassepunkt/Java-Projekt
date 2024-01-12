import java.util.ArrayList;

public class ComputerPlayer {
    
    private Spielfigur[][] spielfeld;
    private boolean blackFigures;
    
    public ComputerPlayer(Spielfigur[][] spielfeld, boolean blackFigures) {
        this.spielfeld = spielfeld;
        this.blackFigures = blackFigures;
    }
    
    public Spielfigur[][] getSpielfeld() {
        return this.spielfeld;
    }
    
    public boolean hasBlackFigures() {
        return this.blackFigures;
    }
    
    public Position[] makeMove() {
        Position[] positionen = new Position[2];
        int maxWert = 0;
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if (spielfeld[x][y] != null) {
                    if (spielfeld[x][y].isBlack() == this.blackFigures) {
                        Position position = spielfeld[x][y].getPosition();
                        ArrayList<Position> moves = spielfeld[x][y].getMoves();
                        for (int i = 0; i < moves.size(); i++) {
                            int wert = 0;
                            if (spielfeld[moves.get(i).getX()][moves.get(i).getY()] instanceof Bauer) {
                                wert = 1;
                            } else if (spielfeld[moves.get(i).getX()][moves.get(i).getY()] instanceof Laeufer) {
                                wert = 2;
                            } else if (spielfeld[moves.get(i).getX()][moves.get(i).getY()] instanceof Springer) {
                                wert = 3;
                            } else if (spielfeld[moves.get(i).getX()][moves.get(i).getY()] instanceof Turm) {
                                wert = 4;
                            } else if (spielfeld[moves.get(i).getX()][moves.get(i).getY()] instanceof Dame) {
                                wert = 5;
                            } else if (spielfeld[moves.get(i).getX()][moves.get(i).getY()] instanceof Koenig) {
                                wert = 6;
                            }
                            if (wert >= maxWert) {
                                maxWert = wert;
                                positionen[1] = moves.get(i);
                                positionen[0] = position;
                            }
                        }
                    }
                }
            }
        }
        return positionen;
    }
}
