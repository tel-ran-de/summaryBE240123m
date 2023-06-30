package summary11.matchesDemo;

import java.util.Calendar;

public class Match {
    private Calendar date;
    private String team1;
    private String result;
    private String team2;
    private String watchers;
    private String stadium;

    public Match(Calendar date, String team1, String result, String team2, String watchers, String stadium) {
        this.date = date;
        this.team1 = team1;
        this.result = result;
        this.team2 = team2;
        this.watchers = watchers;
        this.stadium = stadium;
    }

    public Calendar getDate() {
        return date;
    }


    public String getTeam1() {
        return team1;
    }


    public int getResult1() {
        return Integer.parseInt(result.split(":")[0]);
    }

    public int getResult2() {
        return Integer.parseInt(result.split(":")[1]);
    }
    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public int getWatchers() {
        if (watchers.contains("NULL")) {
            return 0;
        } else {
        return Integer.parseInt(watchers);}
    }


    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
}
