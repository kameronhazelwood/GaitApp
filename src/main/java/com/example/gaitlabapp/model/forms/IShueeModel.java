package com.example.gaitlabapp.model.forms;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Setter
@Getter
@Data
@Entity
@NoArgsConstructor
@Table(name = "Shuee")
public class IShueeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shueeId")
    private Integer shueeId;
    @Column(name = "moneyWalletThumbR")
    private String moneyWalletThumbR;
    @Column(name = "moneyWalletThumbL")
    private String moneyWalletThumbL;
    @Column(name = "moneyWalletFingerR")
    private String moneyWalletFingerR;
    @Column(name = "moneyWalletFingerL")
    private String moneyWalletFingerL;
    @Column(name = "foldPaperThumbR")
    private String foldPaperThumbR;
    @Column(name = "foldPaperThumbL")
    private String foldPaperThumbL;
    @Column(name = "foldPaperFingerR")
    private String foldPaperFingerR;
    @Column(name = "foldPaperFingerL")
    private String foldPaperFingerL;
    @Column(name = "tearPaperThumbR")
    private String tearPaperThumbR;
    @Column(name = "tearPaperThumbL")
    private String tearPaperThumbL;
    @Column(name = "tearPaperFingerR")
    private String tearPaperFingerR;
    @Column(name = "tearPaperFingerL")
    private String tearPaperFingerL;
    @Column(name = "handToMouthR")
    private String handToMouthR;
    @Column(name = "handToMouthL")
    private String handToMouthL;
    @Column(name = "earWithPalmR")
    private String earWithPalmR;
    @Column(name = "earWithPalmL")
    private String earWithPalmL;
    @Column(name = "stickerOnBallR")
    private String stickerOnBallR;
    @Column(name = "stickerOnBallL")
    private String stickerOnBallL;
    @Column(name = "socksOnR")
    private String socksOnR;
    @Column(name = "socksOnL")
    private String socksOnL;
    @Column(name = "fastenShoeR")
    private String fastenShoeR;
    @Column(name = "fastenShoeL")
    private String fastenShoeL;
    @Column(name = "crawlR")
    private String crawlR;
    @Column(name = "crawlL")
    private String crawlL;
    @Column(name = "wristFlexGraspR")
    private String wristFlexGraspR;
    @Column(name = "wristFlexGraspL")
    private String wristFlexGraspL;
    @Column(name = "wristFlexRelR")
    private String wristFlexRelR;
    @Column(name = "wristFlexRelL")
    private String wristFlexRelL;
    @Column(name = "wristNeutGraspR")
    private String wristNeutGraspR;
    @Column(name = "wristNeutGraspL")
    private String wristNeutGraspL;
    @Column(name = "wristNeutRelR")
    private String wristNeutRelR;
    @Column(name = "wristNeutRelL")
    private String wristNeutRelL;
    @Column(name = "wristExtRelR")
    private String wristExtRelR;
    @Column(name = "wristExtRelL")
    private String wristExtRelL;
    @Column(name = "wristExtGraspR")
    private String wristExtGraspR;
    @Column(name = "wristExtGraspL")
    private String wristExtGraspL;
    @Column(name = "shueeComments")
    private String shueeComments;
    @Column(name = "stringBeadThumbR")
    private String stringBeadThumbR;
    @Column(name = "stringBeadThumbL")
    private String stringBeadThumbL;
    @Column(name = "stringBeadFingerR")
    private String stringBeadFingerR;
    @Column(name = "stringBeadFingerL")
    private String stringBeadFingerL;
    @Column(name = "tearPapeR_SFA")
    private String tearPapeR_SFA;
    @Column(name = "foldPaperR_SFA")
    private String foldPaperR_SFA;
    @Column(name = "moneyFromWalletR_SFA")
    private String moneyFromWalletR_SFA;
    @Column(name = "unscrewBottleR")
    private String unscrewBottleR;
    @Column(name = "unscrewBottleL")
    private String unscrewBottleL;
    @Column(name = "unscrewBottleL_SFA")
    private String unscrewBottleL_SFA;
    @Column(name = "pullPlaydoughR")
    private String pullPlaydoughR;
    @Column(name = "pullPlaydoughL")
    private String pullPlaydoughL;
    @Column(name = "pullPlaydoughR_SFA")
    private String pullPlaydoughR_SFA;
    @Column(name = "pullPlaydoughL_SFA")
    private String pullPlaydoughL_SFA;
    @Column(name = "cutPlaydoughL")
    private String cutPlaydoughL;
    @Column(name = "cutPlaydoughR")
    private String cutPlaydoughR;
    @Column(name = "cutPlaydoughR_SFA")
    private String cutPlaydoughR_SFA;
    @Column(name = "cutPlaydoughL_SFA")
    private String cutPlaydoughL_SFA;
    @Column(name = "throwLargeBallR")
    private String throwLargeBallR;
    @Column(name = "throwLargeBallL")
    private String throwLargeBallL;
    @Column(name = "acceptCoinsR")
    private String acceptCoinsR;
    @Column(name = "acceptCoinsL")
    private String acceptCoinsL;
    @Column(name = "receive5R")
    private String receive5R;
    @Column(name = "receive5L")
    private String receive5L;
    @Column(name = "staticHouse")
    private String staticHouse;









}
