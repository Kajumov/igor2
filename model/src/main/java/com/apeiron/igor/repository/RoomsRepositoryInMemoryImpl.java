package com.apeiron.igor.repository;

import com.apeiron.igor.model.room.Room;
import com.apeiron.igor.storage.Storage;

public class RoomsRepositoryInMemoryImpl implements RoomsRepository {

    @Override
    public void save(Room room) {
        Storage.storage().rooms().put((long) 1, room);
    }

    @Override
    public Room findById(Long id) {
        return Storage.storage().rooms().get(id);
    }
}
