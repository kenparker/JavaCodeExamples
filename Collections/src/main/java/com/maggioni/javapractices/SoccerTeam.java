
package com.maggioni.javapractices;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * http://www.javapractices.com/topic/TopicAction.do?Id=173
 */
public final class SoccerTeam {

    public SoccerTeam(String aTeamName, String aHeadCoachName) {
        //..elided
    }

    public void addPlayer(Player aPlayer) {
        fPlayers.add(aPlayer);
    }

    public void removePlayer(Player aPlayer) {
        fPlayers.remove(aPlayer);
    }

    public Set<Player> getPlayers() {
        return Collections.unmodifiableSet(fPlayers);
    }

  //..elided
    // PRIVATE 
    private Set<Player> fPlayers = new LinkedHashSet<>();
    private String fTeamName;
    private String fHeadCoachName;

    private static class Player {

        public Player() {
        }
    }
}
