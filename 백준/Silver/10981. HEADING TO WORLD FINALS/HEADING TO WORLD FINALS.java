import java.io.*;
import java.util.*;

public class Main {
    static class Team {
        String univ;
        String team;
        int correct;
        int penalty;

        Team (String u, String t, int c, int p) {
            this.univ = u;
            this.team = t;
            this.correct = c;
            this.penalty = p;
        }

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String univName = "";
        String teamName = "";
        int correct = 0;
        int penalty = 0;

        List<Team> teams = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            univName = st.nextToken();
            teamName = st.nextToken();
            correct = Integer.parseInt(st.nextToken());
            penalty = Integer.parseInt(st.nextToken());

            teams.add(new Team(univName, teamName, correct, penalty));
        }

        teams.sort((a, b) -> {
            if (a.correct != b.correct) {
                return Integer.compare(b.correct, a.correct);
            }
            return Integer.compare(a.penalty, b.penalty);
        });

        StringBuilder sb = new StringBuilder();
        Set<String> pickedUnis = new HashSet<>();

        for (Team team : teams) {
            if (pickedUnis.add(team.univ)) {
                sb.append(team.team).append('\n');
                if (pickedUnis.size() == k) break;
            }
        }

        System.out.print(sb.toString());
    }
}