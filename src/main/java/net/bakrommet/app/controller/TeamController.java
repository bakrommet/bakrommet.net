package net.bakrommet.app.controller;

import net.bakrommet.app.data.TeamDao;
import net.bakrommet.app.model.football.Team;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
@Controller
public class TeamController {

    @GetMapping(value = "/teams")
    public String teams(final Map<String, Object> model) {
        model.put("pageTitle", "Teams");
        return "teams";
    }

    @GetMapping(value = "/api/teams", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<Team> teamsApi() {
        return TeamDao.getAllTeams();
    }
}
