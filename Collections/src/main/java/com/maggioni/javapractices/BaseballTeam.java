package com.maggioni.javapractices;

import java.util.Set;

/**
 *
 * http://www.javapractices.com/topic/TopicAction.do?Id=173
 */
public final class BaseballTeam {

    public BaseballTeam(String aTeamName, String aHeadCoachName) {
        //..elided
    }

    public void setPlayers(Set<Player> aPlayers) {
        fPlayers = aPlayers;
    }

    public Set<Player> getPlayers() {
        return fPlayers;
    }

  //..elided
    // PRIVATE
    private Set<Player> fPlayers;
    private String fTeamName;
    private String fHeadCoachName;

    private static class Player {

        public Player() {
        }
    }
}
