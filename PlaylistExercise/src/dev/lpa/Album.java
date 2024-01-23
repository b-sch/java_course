package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            System.out.println("Adding song: " + title + " to the album: " + name);
            songs.add(new Song(title, duration));
            return true;
        } else {
            System.out.println("Cannot add the song: " + title + " as it already is in the album: " + songs);
            return false;
        }
    }
    private Song findSong(String title) {
        ListIterator<Song> iterator = songs.listIterator();
        Song searchedSong = null;

        while (iterator.hasNext()) {
            Song currentSong = iterator.next();

            if (currentSong.getTitle().equals(title)) {
                searchedSong = currentSong;
            }
        }

        return searchedSong;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber > songs.size() || trackNumber < 1) {
            return false;
        } else {
            return playlist.add(this.songs.get(trackNumber - 1));
        }
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist) {

        if (findSong(title) != null) {
            return playlist.add(findSong(title));
        } else {
            return false;
        }
    }

}