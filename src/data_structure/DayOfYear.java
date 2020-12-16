package data_structure;

import java.util.Scanner;

public class DayOfYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int retry;

        System.out.println("그 해 경과 일수를 구합니다.");

        do{
            System.out.print("년 : ");
            int year = sc.nextInt();
            System.out.print("월 : ");
            int month = sc.nextInt();
            System.out.print("일 : ");
            int day = sc.nextInt();

            System.out.println("그 해 "+dayOfYear(year,month,day)+"일째입니다.");

            System.out.println("한번 더 실행할까요? 1.예 / 2.아니오");
            retry = sc.nextInt();
        }while(retry == 1);
    }

    //평년과 윤년에 따른 달의 일수
    static int[][] mdays = {
            {31,28,31,30,31,30,31,31,30,31,30,31},  //평년
            {31,29,31,30,31,30,31,31,30,31,30,31}  //윤년
    };
    //해당 연도가 평년인지 윤년인지 계산
    static int isLeap(int year){
        return (year %4 == 0 && year % 100 != 0 || year % 400 == 0 )? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d){
        int days = d;

        for(int i=1; i<m; i++){
            days += mdays[isLeap(y)][i-1];  //isLeap이 윤년이면 1, 평년이면 2가 들어간다.
        }
        return days;
    }
}
