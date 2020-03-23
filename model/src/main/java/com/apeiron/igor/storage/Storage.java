package com.apeiron.igor.storage;

import com.apeiron.igor.model.room.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Storage {

    private static final Storage storage;

    static {
        storage = new Storage();
    }

    private HashMap<Long,Room> rooms = new HashMap<>();

    private Storage() {

    }

    public static Storage storage() {
        return storage;
    }

    public HashMap<Long, Room> rooms() {
        return rooms;
    }
}
