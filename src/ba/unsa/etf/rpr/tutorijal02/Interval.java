package ba.unsa.etf.rpr.tutorijal02;

import java.util.Objects;

public class Interval {
    double pocetnaT;
    double krajnjaT;
    boolean pocetnaPripada;
    boolean krajnjaPripada;

    public Interval(double pocetnaT, double krajnjaT, boolean pocetnaPripada, boolean krajnjaPripada)  {
        if(pocetnaT>krajnjaT)
            throw new IllegalArgumentException("losi argumenti");
        this.pocetnaT = pocetnaT;
        this.krajnjaT = krajnjaT;
        this.pocetnaPripada = pocetnaPripada;
        this.krajnjaPripada = krajnjaPripada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return Double.compare(interval.pocetnaT, pocetnaT) == 0 && Double.compare(interval.krajnjaT, krajnjaT) == 0 && pocetnaPripada == interval.pocetnaPripada && krajnjaPripada == interval.krajnjaPripada;
    }

    @Override
    public String toString() {
       String s="";
       if(this.isNull()) {
           s = s + "()";
           return s;
       }
       if(this.pocetnaPripada)
           s=s+"[";
       else
           s=s+"(";
       s=s+""+pocetnaT+","+krajnjaT;
       if(this.krajnjaPripada)
           s=s+"]";
       else
           s=s+")";
    return s;

    }

    public Interval() {
        this.pocetnaT = 0;
        this.krajnjaT = 0;
        this.pocetnaPripada = false;
        this.krajnjaPripada = false;

    }
    public boolean isNull(){
        if(pocetnaT==0 && krajnjaT==0 && this.pocetnaPripada==false && this.krajnjaPripada==false)
            return true;
        return false;
    }
    public boolean isIn(double tacka){
        final double decimale=0.00001;
        if(tacka>=pocetnaT && tacka<krajnjaT)
            return true;
        return false;
    }
    public Interval intersect(Interval interval){
        Interval presjek=new Interval();
        return presjek;


    }
    public static Interval intersect(Interval interval1, Interval interval2){
        Interval presjek=new Interval();
        return presjek;


    }


}
