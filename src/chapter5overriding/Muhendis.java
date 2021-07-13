package chapter5overriding;

public class Muhendis extends İnsan{
    int maas;
    int Maas(){
        maas ++ ;
        return maas;
    } int yemek(){
        return super.yemek();
//        kilo = kilo + 2 ;
//        return  kilo;

    }
}
