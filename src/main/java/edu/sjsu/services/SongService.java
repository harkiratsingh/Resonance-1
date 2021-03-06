package edu.sjsu.services;

import java.util.ArrayList;

import edu.sjsu.models.Song;

public interface SongService {

    public Song create(Song song);
    public ArrayList<Song> getLatestSongs();
    public ArrayList<Song> songsUploadedByMe(long id);
    public ArrayList<Song> getAllSongs();
    public Song findSongById(long id);
}