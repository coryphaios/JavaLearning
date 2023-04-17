import static java.lang.Math.abs;

public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (toLine >= 0 && toLine <= 7){
            if (toColumn >= 0 && toColumn <= 7){
                if (((abs(toLine - line) <= 1) && (abs(toColumn - column) <= 1)) && ((abs(toLine - line) != 0) && (abs(toColumn - column) != 0))){
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
        return "K";
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column){
        return false;
    }
}