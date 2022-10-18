//Класс трёхмерной точки в пространстве наследуемый от двумерной точки
public class Point3d extends Point2d {
    //Объявляем переменные координат привантно, чтобы к ним не было доступа вне класса. Объявляем ещё раз, потому что они не наследовались от двумерной.
    private double xCoord;
    private double yCoord;
    private double zCoord;

    Point3d(double x, double y, double z) {
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
    }

    Point3d(){
        this(0.0, 0.0, 0.0);
    }

    public double getZ() {
        return zCoord;
    }

    public void setZ(double z) {
        this.zCoord = z;
    }





    public boolean compare(Point3d point){
        return (this.xCoord == point.getX() && this.yCoord == point.getY() && this.zCoord == point.getZ());
    }




    public double distanceTo(Point3d point){
        return Math.sqrt(Math.pow(this.xCoord - point.getX(), 2) + Math.pow(this.yCoord - point.getY(), 2) + Math.pow(this.zCoord - point.getZ(), 2));
    }

    
}