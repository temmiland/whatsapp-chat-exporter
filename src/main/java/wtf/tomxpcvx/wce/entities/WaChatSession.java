package wtf.tomxpcvx.wce.entities;

import lombok.*;

import java.sql.Timestamp;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class WaChatSession {

    private int zPk;
    private int zEnt;
    private int zOpt;
    private Integer zArchived;
    private Integer zContactAbId;
    private String zContactIdentifier;
    private String zContactJid;
    private String zETag;
    private Integer zFlags;
    private Integer zGroupInfo;
    private Integer zHidden;
    private Integer zIdentityVerificationEpoch;
    private Integer zIdentityVerificationState;
    private Integer zLastMessage;
    private Timestamp zLastMessageDate;
    private String zLastMessageText;
    private Timestamp zLocationSharingEndDate;
    private Integer zMessageCounter;
    private String zPartnerName;
    private Integer zProperties;
    private Integer zRemoved;
    private String zSavedInput;
    private Integer zSessionType;
    private Integer zSpotlightStatus;
    private Integer zUnreadCount;

}
