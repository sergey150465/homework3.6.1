import java.util.Arrays;


public class AgeRange {

    public static void main(String[] args) {
        int[][] regionalTeams = {
                {45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}};
        System.out.println(Arrays.toString(nationalTeam(regionalTeams)));
    }

    public static int[] nationalTeam(int[][] regionalTeams) {
        int[] team = regionalTeams[0];
        for (int i = 1; i < regionalTeams.length; i++) {
            team = merge(team, regionalTeams[i]);
        }
        return team;
    }

    public static int[] merge(int team[], int regionalTeams[]) {
        int[] teamResult = new int[10];
        int iTeam = 0;
        int iRegionalTeams = 0;
        int iResult = 0;
        while (iResult < 10) {
            if (iTeam == team.length) {
                teamResult[iResult] = regionalTeams[iRegionalTeams];
                iRegionalTeams += 1;
            } else {
                if (iRegionalTeams == regionalTeams.length) {
                    teamResult[iResult] = team[iTeam];
                    iTeam += 1;
                } else {
                    if (team[iTeam] >= regionalTeams[iRegionalTeams]) {
                        teamResult[iResult] = team[iTeam];
                        iTeam += 1;
                    } else {
                        teamResult[iResult] = regionalTeams[iRegionalTeams];
                        iRegionalTeams += 1;
                    }
                }
            }
            iResult += 1;
        }
        return teamResult;
    }

}


