package berat_oztas;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Dimension dim =new Dimension(24,36);
        MapCreator map =new MapCreator();
        map.SetSize(dim);
        int [] dimensions = map.GetSize();
        System.out.println("Dimensions: "+Arrays.stream(dimensions)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining(" , ")));
        System.out.println("----MAP----");
        ZoneCounter zoneCounter =new ZoneCounter();
        try{
            SetBorders(map);
            map.Show();
            zoneCounter.Init(map);
            System.out.println(zoneCounter.Solve()+" tane Coğrafi bölge bulunmaktadır..");
        }
        catch(Exception e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
             
    }
    public static void SetBorders(MapCreator map){
        try{
            map.SetBorder(13,0);
            map.SetBorder(13,1);
            map.SetBorder(12,2);
            map.SetBorder(11,3);
            map.SetBorder(10,4);
            map.SetBorder(10,5);
            map.SetBorder(9,5);
            map.SetBorder(9,6);
            map.SetBorder(11,6);
            map.SetBorder(12,7);
            map.SetBorder(13,7);
            map.SetBorder(14,8);
            map.SetBorder(15,8);
            map.SetBorder(16,9);
            map.SetBorder(17,9);
            map.SetBorder(17,10);
            map.SetBorder(18,10);
            map.SetBorder(19,10);
            map.SetBorder(20,11);
            map.SetBorder(21,11);
            map.SetBorder(22,12);
            map.SetBorder(23,12);
            map.SetBorder(17,11);
            map.SetBorder(17,12);
            map.SetBorder(16,13);
            map.SetBorder(16,14);
            map.SetBorder(16,15);
            map.SetBorder(16,16);
            map.SetBorder(15,17);
            map.SetBorder(15,18);
            map.SetBorder(15,19);
            map.SetBorder(15,20);
            map.SetBorder(14,21);
            map.SetBorder(14,22);
            map.SetBorder(14,23);
            map.SetBorder(14,24);
            map.SetBorder(13,25);
            map.SetBorder(13,26);
            map.SetBorder(13,27);
            map.SetBorder(13,28);
            map.SetBorder(13,29);
            map.SetBorder(14,29);
            map.SetBorder(15,29);
            map.SetBorder(16,30);
            map.SetBorder(17,30);
            map.SetBorder(18,31);
            map.SetBorder(19,31);
            map.SetBorder(20,31);
            map.SetBorder(21,32);
            map.SetBorder(22,32);
            map.SetBorder(23,33);
            map.SetBorder(8,7);
            map.SetBorder(7,8);
            map.SetBorder(7,9);
            map.SetBorder(6,10);
            map.SetBorder(5,11);
            map.SetBorder(4,12);
            map.SetBorder(4,13);
            map.SetBorder(3,14);
            map.SetBorder(2,15);
            map.SetBorder(1,16);
            map.SetBorder(1,17);
            map.SetBorder(0,18);
            map.SetBorder(12,28);
            map.SetBorder(11,28);
            map.SetBorder(10,27);
            map.SetBorder(9,27);
            map.SetBorder(8,27);
            map.SetBorder(7,26);
            map.SetBorder(0,24);
            map.SetBorder(1,24);
            map.SetBorder(2,24);
            map.SetBorder(3,25);
            map.SetBorder(4,25);
            map.SetBorder(5,26);
            map.SetBorder(6,26);
            map.SetBorder(6,27);
            map.SetBorder(6,28);
            map.SetBorder(6,29);
            map.SetBorder(6,30);
            map.SetBorder(6,31);
            map.SetBorder(6,32);
            map.SetBorder(6,33);
            map.SetBorder(6,34);
            map.SetBorder(5,35);
        }
        catch(Exception e){
            
        }
    }
}
