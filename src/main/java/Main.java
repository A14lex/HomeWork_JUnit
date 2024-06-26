import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        //Maven
        //Взято из ДЗ "Сортировки"
        int[][] teams = {
                {45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}
        };

        int[] nationalTeam = mergeAll(teams);
        System.out.println(Arrays.toString(nationalTeam)); // [51, 45, 31, 31, 30, 24, 22, 20, 18, 17]
    }

    /**
     * Метод для слияния всех команд в одну национальную
     */
    public static int[] mergeAll(int[][] teams) {
        int[] resultTeams = new int[10];//
        // Ваш код
        for (int[] teamsProm :
                teams) {

            resultTeams = merge(resultTeams, teamsProm);

        }
        return resultTeams;
    }

    /**
     * Метод для слияния двух команд в одну
     */
    public static int[] merge(int[] teamA, int[] teamB) {

        int[] c = new int[10];

        int ia = 0;
        int ib = 0;
        int ic = 0;


        while (ia < teamA.length || ib < teamB.length) {
            if (ic == 10) {
                break;
            }
            if (teamA[ia] >= teamB[ib]) {
                c[ic] = teamA[ia];
                ia += 1;
            } else {
                c[ic] = teamB[ib];
                ib += 1;


            }

            ic += 1;


        }

        return c;
    }
}