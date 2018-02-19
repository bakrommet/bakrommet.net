package net.bakrommet.app.data;

import com.google.common.collect.ImmutableMap;
import net.bakrommet.app.model.football.Group;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

import static net.bakrommet.app.data.constants.GroupConstants.*;
import static net.bakrommet.app.data.constants.TeamConstants.*;
import static net.bakrommet.app.data.TeamDao.getTeams;

@Repository
public class GroupDao {

    private Map<String, Group> ALL_GROUPS = ImmutableMap.<String, Group>builder()
            .put(GROUP_A, new Group(GROUP_A,
                    getTeams(RUSSIA, GERMANY, BRAZIL, PORTUGAL)))
            .put(GROUP_B, new Group(GROUP_B,
                    getTeams(ARGENTINA, BELGIUM, POLAND, FRANCE)))
            .put(GROUP_C, new Group(GROUP_C,
                    getTeams(SPAIN, PERU, SWITZERLAND, ENGLAND)))
            .put(GROUP_D, new Group(GROUP_D,
                    getTeams(COLOMBIA, MEXICO, URUGUAY, CROATIA)))
            .put(GROUP_E, new Group(GROUP_E,
                    getTeams(DENMARK, ICELAND, COSTA_RICA, SWEDEN)))
            .put(GROUP_F, new Group(GROUP_F,
                    getTeams(TUNISIA, EGYPT, SENEGAL, IRAN)))
            .put(GROUP_G, new Group(GROUP_G,
                    getTeams(SERBIA, NIGERIA, AUSTRALIA, JAPAN)))
            .put(GROUP_H, new Group(GROUP_H,
                    getTeams(MOROCCO, PANAMA, SOUTH_KOREA, SAUDI_ARABIA)))
            .build();

    public Optional<Group> getGroup(String groupId) {
        return Optional.ofNullable(ALL_GROUPS.get(groupId));
    }
}
