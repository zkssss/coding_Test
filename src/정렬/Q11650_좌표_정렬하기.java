package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q11650_좌표_정렬하기 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][2];

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 2; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    Arrays.sort(arr, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1]-o2[1];
      }
    });

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}
