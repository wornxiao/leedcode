package xxl.job.admin.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindKleast {

    public static void main(String[] args) {
        int[][] pint={{3,3},{5,-1},{-2,4}};
        int[][] ints = kClosest(pint, 2);
        System.out.println(ints[0]);
    }


    public static int[][] kClosest(int[][] points, int k) {
        Queue<Point> queue=new PriorityQueue<>(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o2.getPow()-o1.getPow();
            }
        });


        for (int i=0;i<points.length;i++){
            int[] point = points[i];
            Point poin = new Point(point[0], point[1]);
            Point peek = queue.peek();
            if(null==peek){
                queue.add(poin);
                continue;
            }
            if(queue.size()<k){
                queue.add(poin);
                continue;
            }
            Point pee = queue.peek();
            int pow = pee.getPow();
            int pow1 = poin.getPow();
            if(pow-pow1>=0){
                queue.poll();
                queue.add(poin);
            }
        }
        int[][] result=new int[queue.size()][2];
        int index=0;
        while(!queue.isEmpty()){
            Point poll = queue.poll();
            int[] array = poll.getArray();
            result[index]=array;
            index++;
        }
        return result;
    }

    static class Point implements Comparable<Point>{
        private  int x;
        private int y;
        Point(int x,int y){
            this.x=x;
            this.y=y;
        }

        public int[] getArray(){
            return new int[]{x,y};
        }

        @Override
        public int compareTo(Point newPoint) {
            return newPoint.getPow()-this.getPow();
        }
        public int getPow(){
            return (int)(Math.pow(this.x,2)+Math.pow(this.y,2));
        }
    }
}
