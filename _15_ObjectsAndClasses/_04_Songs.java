package _15_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


    public class _04_Songs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberSongs = Integer.parseInt(sc.nextLine());
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < numberSongs; i++) {
            String partsOfSong [] = sc.nextLine().split("_");
            Song currentSong = new Song(partsOfSong[0], partsOfSong[1], partsOfSong[2]);
            songs.add(currentSong);
        }
        String command = sc.nextLine();
        if(command.equals("all")){
            for (int i = 0; i < songs.size(); i++) {
                System.out.println(songs.get(i).getName());
            }
        }else{
            for (int i = 0; i < songs.size(); i++) {
                if(songs.get(i).getTypeList().equals(command)){
                    System.out.println(songs.get(i).getName());
                }
            }
        }


    }



    }
class Song{
    private String typeList;
    private String name;
    private String length;
    Song(String typeList, String name, String length){
        this.length = length;
        this.name = name;
        this.typeList = typeList;
    }

    public String getName() {
        return name;
    }

    public String getLength() {
        return length;
    }

    public String getTypeList() {
        return typeList;
    }
}






