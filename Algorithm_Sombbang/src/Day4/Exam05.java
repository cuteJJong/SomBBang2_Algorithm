package Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 수 정렬하기 3 언어 제한
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
5 초 (하단 참고)	8 MB (하단 참고)	310123	73929	56455	23.792%
문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

예제 입력 1
10
5
2
3
1
4
2
3
5
1
7
예제 출력 1
1
1
2
2
3
3
4
5
5
7
* */
public class Exam05 {

    private static final int MAX = 10_000;
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //Counting Sort
        int[] cnt = new int[MAX + 1];

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            cnt[x]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= MAX ; i++) {   // O(K)
            for (int j = 0; j < cnt[i]; j++) {
                sb.append(i).append("\n");  //O(N)
            }
        }
        System.out.println(sb);
    }
}
