package CHAPTER7;

class Tri {
    double bottom;
    double height;
    
    public Tri(double bt, double hg) {
        bottom = bt;
        height = hg;
    }
      
    public void setBottom(double bt) {
        bottom = bt;
    }
    
    public void setHeight(double hg) {
        height = hg;
    }
    
    public double getArea() {
        return bottom * height / 2;
    }
}

class Q07_1{
    public static void main(String[] args) {
        Tri tr = new Tri(10.2, 17.3);
        System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ: " + tr.getArea());
        
        tr.setBottom(7.5);
        tr.setHeight(9.2);
        System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ: " + tr.getArea());	
    }
}
