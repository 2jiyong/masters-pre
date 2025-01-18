package week2.mission1.p3;

import java.util.ArrayList;

public class Maze {

    public static int[][] myMaze ={
            {0, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 0}
    };

    public static ArrayList<Position> positionArray = new ArrayList<>();

    public static boolean[][] visited = new boolean[8][8];

    public static boolean inRange(int x, int y){
        return x>=0 && x<8 && y>=0 && y<8;
    }

    public static boolean canGo(int x, int y){
        return inRange(x,y) && myMaze[x][y]==0 && !visited[x][y];
    }

    public static void dfs(){
        int x;
        int y;
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};

        while(true) {
            x=positionArray.getLast().x;
            y=positionArray.getLast().y;

            boolean isMoved=false;

            if (x == 7 && y == 7) {
                System.out.println("탈출 순서");
                StringBuilder sb = new StringBuilder();
                for (int i =0; i<positionArray.size(); i++){
                    sb.append("(").append(positionArray.get(i).x).append(",").append(positionArray.get(i).y).append(")");
                    if (i<positionArray.size()-1){
                        sb.append("->");
                    }
                }
                System.out.println(sb);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (canGo(nx, ny)) {
                    isMoved = true;
                    visited[nx][ny] = true;
                    positionArray.add(new Position(nx, ny));
                    break;
                }
            }
            if (!isMoved) {
                positionArray.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("미로");
        for (int[] row : myMaze) {
            for (int col : row) {
                if (col==1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        visited[0][0]=true;
        positionArray.add(new Position(0,0));
        dfs();
    }
}
