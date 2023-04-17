import static java.lang.Math.abs;

public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    public String getColor() {

        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line != toLine && column != toColumn){
            if (toLine >= 0 && toLine <= 7){
                if (toColumn >= 0 && toColumn <= 7){
                    if (abs(toLine - line) == abs(toColumn - column)){
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        else {
            return false;
        }
    }

    public String getSymbol() {
        return "B";
    }
}