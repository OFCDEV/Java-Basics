package OOPs;

public class inheritance {
    double h;
    double w;
    double l;

    inheritance(){
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    inheritance(double side){
        this.h = side;
        this.w = side;
        this.l = side;
    }

    inheritance(double l,double h,double w){
        this.h = h;
        this.w = w;
        this.l = l;
    }

    inheritance(inheritance old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    public void info(){
        System.out.println("Box is running");
    }
}
