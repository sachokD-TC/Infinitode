package com.prineside.tdi.exceptions;

import com.prineside.tdi.tiles.Tile;
import java.util.ArrayList;

public class InvalidMapFormatException extends RuntimeException {
    public ArrayList<Tile> invalidTiles;
    public Reason reason;

    public enum Reason {
        MULTIPLE_SPAWNS,
        MULTIPLE_TARGETS,
        SPAWN_NOT_FOUND,
        TARGET_NOT_FOUND,
        NO_PATH_FOUND
    }

    public InvalidMapFormatException(Reason reason, ArrayList<Tile> arrayList) {
        this.reason = reason;
        this.invalidTiles = arrayList;
    }
}
