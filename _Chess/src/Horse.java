import static java.lang.Math.abs;

public class Horse extends ChessPiece{

    public Horse(String color){
        super(color);
    }

    public String getColor(){
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        if (line != toLine && column != toColumn){
            if (toLine >= 0 && toLine <= 7){
                if (toColumn >= 0 && toLine <= 7){
                    if (((abs(toLine - line) == 2) && (abs(toColumn - column) == 1)) || ((abs(toLine - line) == 1) && (abs(toColumn - column) == 2))){
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

    public String getSymbol(){
        return "H";
    }
}
