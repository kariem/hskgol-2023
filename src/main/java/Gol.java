public class Gol {

    private boolean[][] board = new boolean[10][10];
    public static void main(String[] args) {
        Gol gol = new Gol();
        for (boolean[] row : gol.board) {
            for (boolean cell : row) {
                System.out.print(cell ? "X" : "O");
            }
            System.out.println();
        }
    }

    public void init(boolean[][] board) {
        this.board = board;
    }

    public void next() {
        // TODO
    }

    boolean getCell(int x, int y) {
        return board[x][y];
    }
}
