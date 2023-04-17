import static java.lang.Math.abs;

public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (toLine >= 0 && toLine <= 7){
            if (toColumn >= 0 && toColumn <= 7){
                if (((toLine != line) && (toColumn == column)) || ((toLine == line) && (toColumn != column))) {
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
        return "R";
    }
}
