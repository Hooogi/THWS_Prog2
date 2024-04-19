package lect_14;

public class Kugelvolumen
{
    public static double berechneKugelvolumen(double radius)
    {
        if(radius < 0) throw new RuntimeException("Radius kleiner 0");
        return 4.0/3*Math.PI*radius*radius*radius;
    }
}