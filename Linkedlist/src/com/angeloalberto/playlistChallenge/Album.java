package com.angeloalberto.playlistChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        return this.songs.add(new Song(title,duration));
    }

    private Song findSong(String title){
        for (Song checkedSong : this.songs.songList){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    private Song findSong(int trackNumber){
        int index = trackNumber - 1;
            if((index >= 0) && (index < songs.songList.size())){
                return songs.songList.get(index);
        }
        return null;
    }


    public boolean addToPlaylist(int trackNumber, List<Song> playlist){
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album doesn't have a track " + trackNumber);
        return false;
    }


    public boolean addToPlaylist(String title, List<Song> playlist){
        Song checkedSong = songs.findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }


    private class SongList{
        private ArrayList<Song> songList;

        public SongList() {
            this.songList = new ArrayList<Song>();
        }

        public ArrayList<Song> getSongList() {
            return songList;
        }

        public boolean add(Song song){
            if(songList.contains(song)){
                return false;
            }
            this.songList.add(song);
            return true;
        }

        private Song findSong(String title){
            for (Song checkedSong : this.songList){
                if(checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber){
            int index = trackNumber - 1;
            if((index >= 0) && (index < songList.size())){
                return songList.get(index);
            }
            return null;
        }
    }

}
