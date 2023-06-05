package com.usd.soccer.utils;

import com.usd.soccer.domain.enums.TeamStatus;

import java.util.UUID;

public class Constants {

    private Constants() {
    }

    public static final UUID UUID_VALUE = UUID.fromString("d815d301-8bae-4dd0-a292-56e0cb7509d6");
    public static final String TEAM_NAME = "USD";
    public static final String TEAM_DESCRIPTION = "Union Sportif de Drummondville";
    public static final String TEAM_MASCOT = "https://medias.usd.com/images/mascote.jpg";
    public static final TeamStatus TEAM_STATUS = TeamStatus.UNKNOWN;
    public static final String CREATE_BY_USER = "Anonymous";
    public static final String MODIFIED_BY_USER = "Anonymous";
    public static final int VERSION = 0;

}
