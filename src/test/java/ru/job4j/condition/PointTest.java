package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

  @Test
  public void when00to20then2() {
    double expected = 2;
    int x1 = 0;
    int y1 = 0;
    int x2 = 2;
    int y2 = 0;
    double out = Point.distance(x1, y1, x2, y2);
    Assert.assertEquals(expected, out, 0.01);
  }

  @Test
  public void when01to23then2dot82() {
    double expected = 2.82;
    int x1 = 0;
    int y1 = 1;
    int x2 = 2;
    int y2 = 3;
    double out = Point.distance(x1, y1, x2, y2);
    Assert.assertEquals(expected, out, 0.01);
  }

  @Test
  public void when33to44then1dot41() {
    double expected = 1.41;
    int x1 = 3;
    int y1 = 3;
    int x2 = 4;
    int y2 = 4;
    double out = Point.distance(x1, y1, x2, y2);
    Assert.assertEquals(expected, out, 0.01);
  }

  @Test
  public void when30to44then4dot12() {
    double expected = 4.12;
    int x1 = 3;
    int y1 = 0;
    int x2 = 4;
    int y2 = 4;
    double out = Point.distance(x1, y1, x2, y2);
    Assert.assertEquals(expected, out, 0.01);
  }
}