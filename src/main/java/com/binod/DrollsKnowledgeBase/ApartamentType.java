package com.binod.DrollsKnowledgeBase;
import java.lang.*;

public enum ApartamentType {
    ONE_ROOM(0),
    TWO_ROOMS(1),
    TREE_ROOMS(2),
    PENTHOUSE(3);
    private final int _i;
    ApartamentType(final int i) {
        _i = i;
    }

    public int getValue()
    {
        return _i;
    }


}
