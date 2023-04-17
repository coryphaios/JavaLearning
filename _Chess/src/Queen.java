import static java.lang.Math.abs;

public class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (toLine >= 0 && toLine <= 7){
            if (toColumn >= 0 && toColumn <= 7){
                if (((toLine != line) && (toColumn == column)) || ((toLine == line) && (toColumn != column)) ||
                        ((abs(toLine - line) == abs(toColumn - column)) && (line != toLine && column != toColumn))) {
                    return true;
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
        return "Q";
    }
}
