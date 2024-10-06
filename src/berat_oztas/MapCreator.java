
package berat_oztas;

public class MapCreator implements MapInterface{
    private int [][] map;
    // 0 -->Land
    // 1 -->Border
    @Override
    public void SetSize(Dimension dim) {
        map =new int[dim.getWeight()][dim.getHeight()];
    }

    @Override
    public int[] GetSize() { //Must return the dimensions of map so :  its weight,height  
        int weight =map.length;
        int height =map[0].length;
        return new int[]{weight,height};
    }

    @Override
    public void SetBorder(int x, int y) throws Exception {
        map[x][y]= 1;
    }

    @Override
    public void ClearBorder(int x, int y) throws Exception {
        map[x][y]= 0;
    }

    @Override
    public boolean IsBorder(int x, int y) throws Exception {
       return map[x][y]== 1;
    }

    @Override
    public void Show() {
        for(int i=0;i<map.length;i++){
            for(int j =0;j<map[0].length;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
