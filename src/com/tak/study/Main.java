package com.tak.study;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //입력할 갯수
        int N = sc.nextInt();

        //입력한 숫자 담음
        int[] arr = new int[N];

        //입력한 갯수만큼 반복
        for (int i = 0; i < N; i++) {
            //위에 선언한 배열에 입력 값 담아줌
            arr[i] = sc.nextInt();
        }

        //Scanner 누수 방지
        sc.close();

        //배열에 저장된 값 !!오름차순정렬!!
        Arrays.sort(arr);

        //arr[0] : 내림차순에서 첫번째
        //arr[N - 1] : 배열의 마지막
        //N - 1의 이유는 배열은 0부터 시작함. 고로 입력갯수(N)는 5개면 [배열은 0~4] [입력갯수는 1~5]이다. 결과적으로 배열의 마지막자리인 4를 찾아야하므로 -1.
        System.out.print(arr[0] + " " + arr[N - 1]);
    }
}
