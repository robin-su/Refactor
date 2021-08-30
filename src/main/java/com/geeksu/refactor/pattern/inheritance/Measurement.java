package com.geeksu.refactor.pattern.inheritance;

/**
 * 测量点：坐标轴
 */
public class Measurement {

    private int x;
    private int y;

    public Measurement(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
