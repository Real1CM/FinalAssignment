package org.example;

import java.util.Scanner;

public class Symptom {
//    public Scanner scanner = new Scanner(System.in);
//    public Detail detail;

    public Boolean selectSymptom(int i) {
        int detailNum = 0;
        Detail detail = new Detail();
        switch (i) {
            case 1: {
                System.out.println("目前体温是否大于37.3?(1表示是,0表示否)");
//                int temperatureNow = scanner.nextInt();
                int temperatureNow = 1;
                detailNum = detailNum + detail.symptom(temperatureNow);

                System.out.println("最高体温是多少?");
//                int temperatureTop = scanner.nextInt();
                int temperatureTop = 1;
                System.out.println(detail.TemperatureTop(temperatureTop));

                System.out.println("发热时有没有发热体温持续不退、体温一直大于38℃情况?(1表示是,0表示否)");
//                int temperatureDetail = scanner.nextInt();
                int temperatureDetail = 1;
                detailNum = detailNum + detail.symptom(temperatureDetail);

                System.out.println("发热后有没有吃退热药?(1表示是,0表示否)");
//                int feverMedicine = scanner.nextInt();
                int feverMedicine = 1;
                detailNum = detailNum + detail.symptom(feverMedicine);
                break;
            }
            case 2:
                break;
            case 3: {
                System.out.println("有没有咳痰?(1表示是,0表示否)");
//                int cough = scanner.nextInt();
                int cough = 1;
                detailNum = detailNum + detail.symptom(cough);
                break;
            }
            case 4:
                break;

            case 5:
                break;
            case 6: {
                System.out.println("有没有胸闷加重?(1表示是,0表示否)");
//                int tightChest = scanner.nextInt();
                int tightChest = 1;
                detailNum = detailNum + detail.symptom(tightChest);
                break;
            }
            case 7: {
                System.out.println("有没有气急加重?(1表示是,0表示否)");
//                int shortBreath = scanner.nextInt();
                int shortBreath = 1;
                detailNum = detailNum + detail.symptom(shortBreath);
                break;
            }
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11: {
                System.out.println("有没有腹泻加重?(1表示是,0表示否)");
//                int diarhea = scanner.nextInt();
                int diarhea = 1;
                detailNum = detailNum + detail.symptom(diarhea);
                break;
            }
        }
        return true;
    }

    public int contactHistory(int i) {
        if (i <= 4)
            return 0;
        else
            return 1;
    }
}
