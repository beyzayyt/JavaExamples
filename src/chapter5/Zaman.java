package chapter5;

class Zaman {
    /*//int default 0
    int hour, minute, second;
    Zaman zamanNesnesi = new Zaman();

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
    }*/


    int second;

    Zaman() {
        second = 5;
    }

    Zaman(int sec, int min, int h) {
        if (h >= 0 && h < 24) {
            second += h * 60 * 60;
        }
        if (min >= 0 && min < 60) {
            second += min * 60;
        }
        if (sec >= 0 && sec < 60) {
            second += sec;
        }
    }

    public void ilerle() {
        second++;
    }

    /**
     * @param sec
     */


    void ilerle(int sec) {
        second += sec;
        if (second < 0) {
            second = 0;
        }
    }

    void zamaniYaz() {
        int hour = second / (60 * 60);
        int minute = (second / 60) % 60;
        System.out.println(hour + " " + minute + " " + " " + (second % 60));
    }

}





