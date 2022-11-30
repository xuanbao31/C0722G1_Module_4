package com.example.demo.servicee;

import com.example.demo.model.Song;
import com.example.demo.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {
    @Autowired
    private ISongRepository songRepository;

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Song findById(int id) {
        return songRepository.findById(id).get();
    }

    @Override
    public void save(Song song) {
        songRepository.save(song);
    }
}
