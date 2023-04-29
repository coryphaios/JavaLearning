import static java.lang.Math.abs;

public class Pawn extends ChessPiece{
    public Pawn(String color){
        super(color);
    }

    public String getColor(){
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line != toLine) {
            if (toLine >= 0 && toLine <= 7) {
                if (toColumn >= 0 && toColumn <= 7) {
                    if (toColumn == column) {
                        if (chessBoard.board[toLine][toColumn] == null) {
                            if ((((chessBoard.board[line][column].getColor()).equals("White")) && ((toLine - line) == 1)) || ((((chessBoard.board[line][column].getColor()).equals("White")) && (line == 1)) && (toLine - line == 2))) {
                                return true;
                            } else if ((((chessBoard.board[line][column].getColor()).equals("Black")) && ((line - toLine) == 1)) || ((((chessBoard.board[line][column].getColor()).equals("Black")) && (line == 6)) && (line - toLine == 2))) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    } else if (abs(toColumn - column) == 1) {
                        if ((chessBoard.board[toLine][toColumn] != null) && !((chessBoard.board[toLine][toColumn].getColor()).equals(chessBoard.board[line][column].getColor()))) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public String getSymbol(){
        return "P";
    }
}
