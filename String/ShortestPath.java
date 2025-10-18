//To find Shortest Path..

package String;

public class ShortestPath {
    static float getShortestPath(String path){
        int x = 0;
        int y = 0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'N'){ //North.
                y++;
            } else if (dir == 'S') { //South.
                y--;
            } else if (dir == 'W') { //West.
                x--;
            } else { //East.
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(y2 + x2);
    }
    public static void main(String[] args){
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
