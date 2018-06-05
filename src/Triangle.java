public class Triangle {

    private double kat1;
    private double kat2;

    public Triangle(double kat1, double kat2) {
        this.kat1 = kat1;
        this.kat2 = kat2;
    }

    public void setKat1(double kat1) {
        this.kat1 = kat1;
    }

    public void setKat2(double kat2) {
        this.kat2 = kat2;
    }

    public double getKat1() {
        return kat1;
    }

    public double getKat2() {
        return kat2;
    }

    public boolean isRightTriangle(Triangle triangle){
        if(kat1 +kat2 ==90){
            return true;
        }
        else{
            return false;
        }
    }
}
