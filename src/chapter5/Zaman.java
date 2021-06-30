package chapter5;

class Zaman {
    //int default 0
    int hour, minute, second;

    void ilerle() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
        }
        else if (minute == 60) {
            minute = 0;
            hour++;
        }
        else if (hour == 24) {
            hour = 0;
        }
    }
    void zamaniYaz() {
        System.out.println("Time is: " +second +""+ minute  +""+hour);
    }
}


