package berat_oztas;

public class Dimension {
    private int weight;
    private int height;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public Dimension(int weight,int height){
        this.weight=weight;
        this.height=height;
    }
    
    public boolean CheckWithIn(int x ,int y){
        return (x >=0 && x < weight && y >=0 && y < height );
    }
    
}
