package ke_thua.LopPoint2DVaLopPoint3D;

public class Point3D extends Point2D {
    public float z=0.0f;


    public Point3D(){
    }
    public Point3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
     public void setXYZ( float x, float y,float z){
        this.x =x;
        this.y=y;
        this.z= z;
     }
     public float[] getXYZ(){
        float []arr={this.getX(),this.getY(),this.getZ()};
        return arr;
     }
     @Override
    public String toString(){
        return "Array : "
                + getXYZ()
                +super.toString();
     }

}
