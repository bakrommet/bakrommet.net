package net.bakrommet.app.data;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.bakrommet.app.model.football.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static net.bakrommet.app.data.constants.TeamConstants.*;

public class TeamDao {

    private static final Map<String, Team> ALL_TEAMS = ImmutableMap.<String, Team>builder()
            .put(RUSSIA,        new Team(RUSSIA, "Russland"))
            .put(GERMANY,       new Team(GERMANY, "Tyskland"))
            .put(BRAZIL,        new Team(BRAZIL, "Brasil"))
            .put(PORTUGAL,      new Team(PORTUGAL, "Portugal"))
            .put(ARGENTINA,     new Team(ARGENTINA, "Argentina"))
            .put(BELGIUM,       new Team(BELGIUM, "Belgia"))
            .put(POLAND,        new Team(POLAND, "Polen"))
            .put(FRANCE,        new Team(FRANCE, "Frankrike"))
            .put(SPAIN,         new Team(SPAIN, "Spania"))
            .put(PERU,          new Team(PERU, "Peru"))
            .put(SWITZERLAND,   new Team(SWITZERLAND, "Sveits"))
            .put(ENGLAND,       new Team(ENGLAND, "England"))
            .put(COLOMBIA,      new Team(COLOMBIA, "Columbia"))
            .put(MEXICO,        new Team(MEXICO, "Mexico"))
            .put(URUGUAY,       new Team(URUGUAY, "Uruguay"))
            .put(CROATIA,       new Team(CROATIA, "Kroatia"))
            .put(DENMARK,       new Team(DENMARK, "Danmark"))
            .put(ICELAND,       new Team(ICELAND, "Island"))
            .put(COSTA_RICA,    new Team(COSTA_RICA, "Costa Rica"))
            .put(SWEDEN,        new Team(SWEDEN, "Sverige"))
            .put(TUNISIA,       new Team(TUNISIA, "Tunis"))
            .put(EGYPT,         new Team(EGYPT, "Egypt"))
            .put(SENEGAL,       new Team(SENEGAL, "Senegal"))
            .put(IRAN,          new Team(IRAN, "Iran"))
            .put(SERBIA,        new Team(SERBIA, "Serbia"))
            .put(NIGERIA,       new Team(NIGERIA, "Nigeria"))
            .put(AUSTRALIA,     new Team(AUSTRALIA, "Australia"))
            .put(JAPAN,         new Team(JAPAN, "Japan"))
            .put(MOROCCO,       new Team(MOROCCO, "Marokko"))
            .put(PANAMA,        new Team(PANAMA, "Panama"))
            .put(SOUTH_KOREA,   new Team(SOUTH_KOREA, "Sør-Korea"))
            .put(SAUDI_ARABIA,  new Team(SAUDI_ARABIA, "Saudi Arabia")).build();


    public static List<Team> getAllTeams() {
        return ImmutableList.copyOf(ALL_TEAMS.values());
    }

    public static Team getTeam(String id) {
        return ALL_TEAMS.get(id);
    }

    public static List<Team> getTeams(String... ids){
        List<Team> listOfTeams = new ArrayList<>();
        if (ids != null) {
            for (String id : ids) {
                Team team = getTeam(id);
                if (team != null) {
                    listOfTeams.add(team);
                }
            }
        }
        return listOfTeams;
    }

}
