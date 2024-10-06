package berat_oztas;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ZoneCounter implements  ZoneCounterInterface{
    
    private MapInterface zoneMap;
    private int zoneCount =0;
    private int [][] zoneMapArray;

    @Override
    public void Init(MapInterface map) throws Exception {
       zoneMap = map;
       int [] dimensions=zoneMap.GetSize();
       zoneMapArray =new int[dimensions[0]][dimensions[1]];
    }

    @Override
    public int Solve() throws Exception {
        if(zoneMapArray==null)
            return 0;
        
        int weight=zoneMapArray.length;
        int height=zoneMapArray[0].length;
        
        
        for(int i=0;i<weight;i++){
            for(int j=0;j<height;j++){
                if(!zoneMap.IsBorder(i, j)){
                    zoneCount++;
                    Bfs(zoneMapArray,i,j);
                }
            }
        }
        
        return zoneCount;
    }
    
    public void Bfs(int [][] zoneMapArray,int i ,int j){
        
        try{
            if(i < 0 || i >=zoneMapArray.length || j <0 || j >=zoneMapArray[0].length || zoneMap.IsBorder(i, j)){
                 return;
            }
            
            zoneMap.SetBorder(i, j);
            
            Bfs(zoneMapArray, i+1, j); //Right
            Bfs(zoneMapArray, i-1, j); //Left
            Bfs(zoneMapArray, i, j+1); //Down
            Bfs(zoneMapArray, i, j-1); //Up
                
        }
        catch(Exception e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }        
    }
}
