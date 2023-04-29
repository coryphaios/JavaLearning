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
                if (toColumn >= 0 && toColumn <= 7) {
                    if ((chessBoard.board[toLine][toColumn] == null) || !((chessBoard.board[toLine][toColumn].getColor()).equals(chessBoard.board[line][column].getColor()))) {
                        if (abs(toLine - line) == abs(toColumn - column)) {
                            if ((toLine > line) && (toColumn > column)) {
                                int j = column + 1;
                                for (int i = line + 1; i < toLine; i++) {
                                    if (chessBoard.board[i][j] != null) {
                                        return false;
                                    }
                                    j++;
                                }
                                return true;
                            } else if ((toLine > line) && (toColumn < column)) {
                                int j = column - 1;
                                for (int i = line + 1; i < toLine; i++) {
                                    if (chessBoard.board[i][j] != null) {
                                        return false;
                                    }
                                    j--;
                                }
                                return true;
                            } else if ((toLine < line) && (toColumn > column)) {
                                int j = column + 1;
                                for (int i = line - 1; i > toLine; i--) {
                                    if (chessBoard.board[i][j] != null) {
                                        return false;
                                    }
                                    j++;
                                }
                                return true;
                            } else if ((toLine < line) && (toColumn < column)) {
                                int j = column - 1;
                                for (int i = line - 1; i > toLine; i--) {
                                    if (chessBoard.board[i][j] != null) {
                                        return false;
                                    }
                                    j--;
                                }
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
        else {
            return false;
        }
    }

    public String getSymbol() {
        return "B";
    }
}