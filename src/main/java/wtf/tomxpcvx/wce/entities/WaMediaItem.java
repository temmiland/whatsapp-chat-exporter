package wtf.tomxpcvx.wce.entities;

import lombok.*;

import java.sql.Blob;
import java.sql.Timestamp;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class WaMediaItem {

    private int zPk;
    private int zEnt;
    private int zOpt;
    private Float zAspectRatio;
    private String zAuthorName;
    private Integer zCloudStatus;
    private String zCollectionName;
    private Integer zFileSize;
    private Float zHAccuracy;
    private Float zLatitude;
    private Float zLongitude;
    private Blob zMediaKey;
    private String zMediaLocalPath;
    private Integer zMediaOrigin;
    private String zMediaUrl;
    private Timestamp zMediaUrlDate;
    private Integer zMessage;
    private Blob zMetaData;
    private Integer zMovieDuration;
    private String zThumbnailLocalPath;
    private String zTitle;
    private String zVCardName;
    private String zVCardString;
    private String zXMPPThumbPath;

}
