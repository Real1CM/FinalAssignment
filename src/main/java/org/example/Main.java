package org.example;

import java.util.Scanner;

public class Main {
    public Scanner scanner = new Scanner(System.in);
    public Symptom symptom = new Symptom();
    public int symptonflag = 0, contactflag = 0;

    public int giveSuggestion() {
        System.out.println("是否有以下症状?");
        System.out.println("1.发热、2.咽喉痛、3.咳嗽、4.鼻塞、5.流鼻涕、6.胸闷、");
        System.out.println("7.气急、8.呼吸困难、9.全身酸痛、10.乏力、11.腹泻、12.都没有");
        System.out.println("如有症状请输入对应数字:");
        int symptonChosen = scanner.nextInt();
        int num = 11; //循环次数,最多11次
        if (symptonChosen != 12) {
            while (num > 0) {
                symptom.selectSymptom(symptonChosen);
                System.out.println("是否还有其他症状(按0退出)");
                int symptonChosen2 = scanner.nextInt();
                if (symptonChosen2 == 0)
                    break;
                num--;
            }
            symptonflag =1;
        }
        System.out.println("近14天有没有以下情况？");
        System.out.println("1.\t有武汉（湖北）等疫区旅游史或居住史\n" +
                "2.\t有接触过武汉（湖北）等疫区的人员\n" +
                "3.\t有接触过疑似或确诊新型冠状病毒感染者\n" +
                "4.\t身边有多人出现发热、乏力、咳嗽、咽痛等\n" +
                "5.\t都没有\n");
        System.out.println("请输入对应数字:");
        int contactChosen = scanner.nextInt();
        int num2 = 4; //循环次数,最多11次
        if (contactChosen != 5) {
            while (num2 > 0) {
                symptom.selectSymptom(contactChosen);
                System.out.println("是否还有其他症状(按0退出)");
                int contactChosen2 = scanner.nextInt();
                if (contactChosen2 == 0)
                    break;
                num2--;
            }
            contactflag = 1;
        }
        int flag = 0;
        if(symptonflag==1&&contactflag==1) {
            flag = 1;
            System.out.println("建议立刻发热门诊就诊，并且佩戴好口罩做好防护。佩戴医用外科口罩或N95口罩，避免乘坐公共交通工具");
        }
        else if(symptonflag==1&&contactflag==0) {
            flag =2;
            System.out.println("结合你提供的病情症状及接触史特点，建议继续在家监测体温，可适当服用治疗感冒的中成药，注意手卫生，多饮水，休息为主。若体温持续不退或体温大于38℃或不适症状加重，及时就诊。");
        }
        else if (symptonflag==0&&contactflag==1){
            flag = 3;
            System.out.println("建议你们全家及密切接触者居家隔离至少2周，在家期间建议戴口罩交流，条件允许时，尽量单独居住或居住在通风良好的单人房间。\n" +
                    "多休息，多饮水，注意手卫生和常用物品卫生消毒。若出现发热及呼吸道症状，需马上前往医院就诊。\n");
        }
        else if (symptonflag==0&&contactflag==0){
            flag = 4;
            System.out.println("建议您戴口罩、勤洗手，避免人群聚集，减少不必要外出。");
        }

        return flag;
    }
}
