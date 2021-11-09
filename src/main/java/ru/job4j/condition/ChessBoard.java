package ru.job4j.condition;

public class ChessBoard {

  public static int way(int x1, int y1, int x2, int y2) {
    int rsl = 0;

    boolean checkX1 = x1 >= 0 && x1 <= 7;
    boolean checkY1 = y1 >= 0 && y1 <= 7;
    boolean checkX2 = x2 >= 0 && x2 <= 7;
    boolean checkY2 = y2 >= 0 && y2 <= 7;

    if (checkX1 && checkY1 && checkX2 && checkY2) {
      rsl = Math.abs(x2 - x1) == Math.abs(y2 - y1) ? Math.abs(x2 - x1) : 0;
    }

    return rsl;
  }
}