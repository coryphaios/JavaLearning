import static java.lang.Math.abs;

public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (toLine >= 0 && toLine <= 7){ // Lines limit check
            if (toColumn >= 0 && toColumn <= 7){ // columns limit check

                if ((chessBoard.board[toLine][toColumn] == null) || !((chessBoard.board[toLine][toColumn].getColor()).equals(chessBoard.board[line][column].getColor()))){

                    if (((toLine != line) && (toColumn == column)) || ((toLine == line) && (toColumn != column))) { // possible directions check

                        if (toLine == line && toColumn > column) { //condition for right direction on the same line
                            for (int i = column + 1; i < toColumn; i++) {
                                if (chessBoard.board[line][i] != null) { // free square check
                                    return false;
                                }
                            }
                            return true;
                        } else if (toLine == line && toColumn < column) { //condition for left direction on the same line
                            for (int i = column - 1; i > toColumn; i--) {
                                if (chessBoard.board[line][i] != null) {
                                    return false;
                                }
                            }
                            return true;
                        } else if (toColumn == column && toLine > line) { //condition for forward direction on the same column
                            for (int i = line + 1; i < toLine; i++) {
                                if (chessBoard.board[i][column] != null) {
                                    return false;
                                }
                            }
                            return true;
                        } else if (toColumn == column && toLine < line) { //condition for backward direction on the same column
                            for (int i = line - 1; i > toLine; i--) {
                                if (chessBoard.board[i][column] != null) {
                                    return false;
                                }
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

    public String getSymbol() {
        return "R";
    }
}
