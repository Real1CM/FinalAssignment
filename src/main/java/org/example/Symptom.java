package org.example;

import java.util.Scanner;

public class Symptom {
    public Scanner scanner = new Scanner(System.in);
    public Detail detail;

    public void selectSymptom(int i) {
        switch (i) {
            case 1: {
                System.out.println("目前提问时体温是否大于37.3?(1表示是,0表示否)");
                int temperatureNow = scanner.nextInt();
                detail.symptom(temperatureNow);

                System.out.println("最高体温是多少?");
                int temperatureTop = scanner.nextInt();
                System.out.println(detail.TemperatureTop(temperatureTop));

                System.out.println("发热时有没有发热体温持续不退、体温一直大于38℃情况?(1表示是,0表示否)");
                int temperatureDetail = scanner.nextInt();
                detail.symptom(temperatureDetail);

                System.out.println("发热后有没有吃退热药?(1表示是,0表示否)");
                int feverMedicine = scanner.nextInt();
                detail.symptom(feverMedicine);
                break;
            }
            case 2:
                break;
            case 3: {
                System.out.println("有没有咳痰?(1表示是,0表示否)");
                int cough = scanner.nextInt();
                detail.symptom(cough);
                break;
            }
            case 4:
                break;

            case 5:
                break;
            case 6: {
                System.out.println("有没有胸闷加重?(1表示是,0表示否)");
                int tightChest = scanner.nextInt();
                detail.symptom(tightChest);
                break;
            }
            case 7: {
                System.out.println("有没有气急加重?(1表示是,0表示否)");
                int shortBreath = scanner.nextInt();
                detail.symptom(shortBreath);
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
                int diarhea = scanner.nextInt();
                detail.symptom(diarhea);
                break;
            }
            default:
                break;
        }
    }

    public int contactHistory(int i) {
        if (i <= 4)
            return 1;
        else
            return 0;
    }
}
