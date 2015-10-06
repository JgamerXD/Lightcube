package com.github.jgamerxd.lightcube;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jan on 28.09.2015.
 */
public class Cube {
    private List<Frame> frames; //[frame][x+y*sizeX+z*sizeX*sizeY]
    final int sizeX, sizeY, sizeZ; //x,y,z
    float frameTimeout;

    public Cube(int sizeX, int sizeY, int sizeZ) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
        frames = new ArrayList<Frame>();
    }


    public int getFrameCount() {
        return frames.size();
    }

    public void addFrame(Frame frame) {
        if (frame == null)
            frames.add(new Frame(sizeX, sizeY, sizeZ));
        else
        {
            if(frame == null)
            frames.add(frame);
        }

    }

    public Frame getFrame(int index) {
        return frames.get(index);
    }

    public void replace(int index, Frame frame) {
        frames.set(index, frame);
    }


}

