package com.github.jgamerxd.lightcube;

import java.awt.*;
import java.util.Arrays;

public class Frame {
    Color[] colors; //[x+y*sizeX+z*sizeX*sizeY]
    private final int sizeX, sizeY, sizeZ; //x,y,z

    public Frame(int sizeX, int sizeY, int sizeZ) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
    }

    public void setColor(int x, int y, int z, Color color) {
        colors[x + y * sizeX + z * sizeX * sizeY] = color;
    }

    public Color getColor(int x, int y, int z)
    {
        return colors[x + y * sizeX + z * sizeX * sizeY];
    }

    public void fill(Color color) {
        Arrays.fill(colors, color);
    }

    public void fillCuboid(int x, int y, int z, int dx, int dy, int dz, Color color) {
        for (int i = x; i < x + dx; i++)
            for (int j = y; j < y + dy; j++)
                for (int k = z; k < z + dz; k++)
                    colors[i + j * sizeX + k * sizeX * sizeY] = color;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public int getSizeZ() {
        return sizeZ;
    }
}
