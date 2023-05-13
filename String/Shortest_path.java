import java.util.*;
public class Shortest_path {
    public static float shortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //north
            if(dir=='N'){
                y++;
            }
            //south
            if(dir=='S'){
                y--;
            }
            //East
            if(dir=='E'){
                x++;
            }
            //west
            if(dir=='W'){
                x--;
            }

        }
        int X2=x*x;
        //x2=x*x cause (x-0)*(x-0);
        int Y2=y*y;
        //y2=(y-0)*(y-0);
        return ((float)Math.sqrt(X2+Y2));
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(shortestPath(path));
    }
    
}
