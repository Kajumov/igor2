package com.apeiron.igor.repository;

import com.apeiron.igor.model.room.Room;

public interface RoomsRepository {
    void save(Room room);
    Room findById(Long id);
}
