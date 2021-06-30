package chapter3;

public class Main3 {
    public static void main(String[] args) {
       /* System.out.println("3");
        int a = 6, b = 7, c=0;
        c = ++a + b;
        System.out.println("c: " + c);
        int n = 6;
        System.out.println("n:" + n);
        {
            int k = 8;
            System.out.println("k:" + k);
            n = 8;
        }
        System.out.println("n:" + n);
        // no access
        //System.out.println(k);
        int d = --a + b++ + c--;
        System.out.println("d:" + d);
        int x = 7, y = 5, z = 9;
        int t = ++x + y-- * z-- / x ;
        System.out.println(t);
        boolean bool = x + y < x * z && z + y >= x + y;
        System.out.println("bool : " + bool);
        int k = (c++ + b) * (--c + a++);
        System.out.println("k:" + k);
        float r = 223.5f, u = 87.4f;
        if(r<u){
            System.out.println("bigger : " +u );
        }
        else if(r == u)
        {
            System.out.println("equal : " +r );
        }
        else
        {
            System.out.println("bigger:"+r);
        }
        int gun = 2;
        switch (gun)
        {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 6 : System.out.println("Saturday");
        }*/
     /*   int i=1;
        while(i<10)
        {
          i +=1;
          System.out.println("i:"+i);
        }*/
        /*int i=0;
        do {
            {
                i += 1;
                System.out.println("i:" +i);
            }
        }
        while (i<5);
        */
        int i;
        for (i = 0; i < 6; i++) {
            i += 1;
            System.out.println(i);
            i -=1;
            System.out.println(i);
        }
    }
}
