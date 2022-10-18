public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2){
        if (x1 != x2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    public double distance(){
        double x = x2 - x1;
        double y = y2 - y1;
        double dis = Math.pow((Math.pow(x,2)))
    }



}
