package org.example;

import java.util.Scanner;

public class Detail {
    public float TemperatureTop(float i) {
            if (i <= 42.0 && i >= 37.3)
                return i;
        return 0;
    }

    public String symptomDuration(int i) { //症状持续14天以内或者14天以上
        String a = "";
        if (i >= 0 && i <= 14) {
            a = "持续14天以内";
            System.out.println(a);
        } else if (i > 14) {
            a = "持续14天以上";
            System.out.println(a);
        }
        return a;
    }

    public int symptom(int i) {
        return i; //1表示有症状,0表示没有症状
    }
}
