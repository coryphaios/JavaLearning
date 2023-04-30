import static java.lang.Math.abs;

public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (isUnderAttack(chessBoard, toLine, toColumn)){
          System.out.println("It's impossible move because of check");
        }
        if (toLine >= 0 && toLine <= 7){
            if (toColumn >= 0 && toColumn <= 7){
               if (((abs(toLine - line) <= 1) && (abs(toColumn - column) <= 1)) && !((abs(toLine - line) == 0) && (abs(toColumn - column) == 0)) && !isUnderAttack(chessBoard, toLine, toColumn)){
                   //if (((abs(toLine - line) <= 1) && (abs(toColumn - column) <= 1)) && !((abs(toLine - line) == 0) && (abs(toColumn - column) == 0))){
                       if ((chessBoard.board[toLine][toColumn] == null) || !((chessBoard.board[toLine][toColumn].getColor()).equals(chessBoard.board[line][column].getColor()))){
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
        return "K";
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column){

        for (int i = 0; i <= 7; i++){
            for (int j = 0; j <= 7; j++){
                if ((chessBoard.board[i][j] != null) && (!((chessBoard.board[i][j].getColor()).equals(chessBoard.nowPlayerColor())) && (chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)))) {
                    System.out.println("It's check");
                    return true;
                }
            }
        }
        return false;
    }

}