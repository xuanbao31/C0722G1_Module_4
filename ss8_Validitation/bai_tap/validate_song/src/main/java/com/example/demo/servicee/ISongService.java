package com.example.demo.servicee;

import com.example.demo.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();

    Song findById(int id);

    void save(Song song);
}
