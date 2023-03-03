package com.isep.hpah.core;

public class Wand {
    private Core core;
    private int size;

    public Wand(Core core, int size) {
        this.core = core;
        this.size = size;
    }

    public Core getCore() {
        return core;
    }

    public int getSize() {
        return size;
    }
}
