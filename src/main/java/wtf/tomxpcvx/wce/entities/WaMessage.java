package wtf.tomxpcvx.wce.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor @AllArgsConstructor @Builder @Getter @Setter @ToString
@Entity @Table(name = "ZWAMESSAGE")
public class WaMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Z_PK")
    private int zPk;
    @Column(name="Z_ENT")
    private int zEnt;
    @Column(name="Z_OPT")
    private int zOpt;

    @Column(name="ZCHATSESSION")
    private Integer zChatSession;
    @Column(name="ZCHILDMESSAGESDELIVEREDCOUNT")
    private Integer zChildMessagesDeliveredCount;
    @Column(name="ZCHILDMESSAGESPLAYEDCOUNT")
    private Integer zChildMessagesPlayedCount;
    @Column(name="ZCHILDMESSAGESREADCOUNT")
    private Integer zChildMessagesReadCount;
    @Column(name="ZDATAITEMVERSION")
    private Integer zDataItemVersion;
    @Column(name="ZDOCID")
    private Integer zDocId;
    @Column(name="ZENCRETRYCOUNT")
    private Integer zEncRetryCount;
    @Column(name="ZFILTEREDRECIPIENTCOUNT")
    private Integer zFilteredRecipientCount;
    @Column(name="ZFLAGS")
    private Integer zFlags;
    @Column(name="ZFROMJID")
    private String zFromJid;
    @Column(name="ZGROUPEVENTTYPE")
    private Integer zGroupEventType;
    @Column(name="ZGROUPMEMBER")
    private Integer zGroupMember;
    @Column(name="ZISFROMME")
    private Integer zIsFromMe;
    @Column(name="ZLASTSESSION")
    private Integer zLastSession;
    @Column(name="ZMEDIAITEM")
    private Integer zMediaItem;
    @Column(name="ZMEDIASECTIONID")
    private String zMediaSectionId;
    @Column(name="ZMESSAGEDATE")
    private Timestamp zMessageDate;
    @Column(name="ZMESSAGEERRORSTATUS")
    private Integer zMessageErrorStatus;
    @Column(name="ZMESSAGEINFO")
    private Integer zMessageInfo;
    @Column(name="ZMESSAGESTATUS")
    private Integer zMessageStatus;
    @Column(name="ZMESSAGETYPE")
    private Integer zMessageType;
    @Column(name="ZPHASH")
    private String zPHash;
    @Column(name="ZPARENTMESSAGE")
    private Integer zParentMessage;
    @Column(name="ZPUSHNAME")
    private String zPushName;
    @Column(name="ZSENTDATE")
    private Timestamp zSendDate;
    @Column(name="ZSORT")
    private Integer zSort;
    @Column(name="ZSPOTLIGHTSTATUS")
    private Integer zSpotlightStatus;
    @Column(name="ZSTANZAID")
    private String zStanzaId;
    @Column(name="ZSTARRED")
    private Integer zStarred;
    @Column(name="ZTEXT")
    private String zText;
    @Column(name="ZTOJID")
    private String zToJid;

}
