package com.angeloalberto.playlistChallenge;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("you can do it", "Michael Rabbit");
        album.addSong("cheese", 3.00);
        album.addSong("you can do it", 3.80);
        album.addSong("animals", 3.54);
        album.addSong("let's go", 2.40);
        album.addSong("life is beautiful", 3.80);
        album.addSong("good vibes", 2.90);
        albums.add(album);

        album = new Album("go head", "ACDC");
        album.addSong("rock", 3.00);
        album.addSong("roll", 3.54);
        album.addSong("go go !", 2.40);
        album.addSong("life is wonderful", 3.80);
        album.addSong("lovely job", 2.90);

        albums.add(album);

        List<Song> playlist = new ArrayList<>();
        albums.get(0).addToPlaylist("you can do it", playlist);
        albums.get(0).addToPlaylist("animals", playlist);
        albums.get(0).addToPlaylist("let's go", playlist);
        albums.get(0).addToPlaylist("good vibes", playlist);
        albums.get(1).addToPlaylist(5, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(5, playlist);
        albums.get(1).addToPlaylist(8, playlist); // there is not
        albums.get(1).addToPlaylist(9, playlist); // there is not

        play(playlist);
    }

    private static void play(List<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("No song in playlist");
            return;
        }else{
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit= true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of the playlist");
                    }
                    break;

                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }else {
                            System.out.println("We have reached the start of the playlist");
                        }
                    }
                    break;

                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                        }else{
                            System.out.println("Wear at the start ot the list");
                        }
                    }else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                        }else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }


    private static void printList(List<Song> playlist){
        ListIterator<Song> listIterator = playlist.listIterator();
        System.out.println("-------------");

        while (listIterator.hasNext()){
            System.out.println(listIterator.next().toString());
        }

        System.out.println("-------------");
    }

    private static void printMenu(){
        System.out.println("Available action: \n press");
        System.out.println("0 - to quit \n" +
                "1 - to play nex song \n" +
                "2 - to play previous song \n" +
                "3 - to replay the current song \n" +
                "4 - list songs in the playlist \n"+
                "5 - print available actions \n" +
                "6 - delete current song from playlist");
    }


}
