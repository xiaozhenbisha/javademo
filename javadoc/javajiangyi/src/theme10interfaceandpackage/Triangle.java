package theme10interfaceandpackage;

/**
 * @author wzn
 * @create 2022-07-24 15:29
 */

class Triangle implements Shapes {
    public int width,height;
    public double getArea()
    {
        return(width*height);
    }
    public double getPerimeter()
    {
        return(2*width+2*height);
    }
    public Triangle (int width,int height)
    {
        this.width=width;
        this.height=height;
    }
}
