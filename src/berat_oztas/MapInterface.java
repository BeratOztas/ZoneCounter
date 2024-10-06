package berat_oztas;

public interface MapInterface {
    
    void SetSize(Dimension dim); // Creates / Allocates a map of given size.
    
    int[] GetSize();// Get dimensions of given map.
     
    void SetBorder(int x, int y) throws Exception; // Sets border at given point.
   
    void ClearBorder(int x ,int y) throws Exception; // Clears border at given point.
    
    boolean IsBorder(int x, int y) throws Exception; // Checks if given point is border.
    
    void Show(); // Show map contents.
    
}
