package org.example;

public class Detail {
    public int symptom(int i) {
        return i; //1表示有症状,0表示没有症状
    }

    public float TemperatureTop(float i) {
        while (true) {
            if (i <= 42 && i >= 37.3)
                return i;
        }
    }

    public void symptomDuration(int i) { //症状持续14天以内或者14天以上
        if (i <= 14)
            System.out.println("持续14天以内");
        else if (i > 14)
            System.out.println("持续14天以上");
    }
}
