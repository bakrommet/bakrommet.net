package net.bakrommet.app.model.football;

import java.util.List;

public class Group {

    private String id;
    private List<Team> teams;

    public Group(String id, List<Team> teams) {
        this.id = id;
        this.teams = teams;
    }

    public String getId() {
        return id;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public String getPrettyName() {
        return "Gruppe " + id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getPrettyName() + "\n");
        getTeams().forEach(team -> {
            sb.append(team.getName() + "\n");
        });
        return sb.toString();
    }
}
