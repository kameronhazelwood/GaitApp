package com.example.gaitlabapp.model.forms;

import com.example.gaitlabapp.model.patients.IPatientModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Set;

@Setter
@Getter
@Data
@Entity
@NoArgsConstructor
@Table(name = "shuee")
public class IShueeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shuee_Id")
    private Integer shueeId;
    @Column(name = "money_Wallet_ThumbR")
    private String moneyWalletThumbR;
    @Column(name = "money_Wallet_ThumbL")
    private String moneyWalletThumbL;
    @Column(name = "money_Wallet_FingerR")
    private String moneyWalletFingerR;
    @Column(name = "money_Wallet_FingerL")
    private String moneyWalletFingerL;
    @Column(name = "fold_Paper_ThumbR")
    private String foldPaperThumbR;
    @Column(name = "fold_Paper_ThumbL")
    private String foldPaperThumbL;
    @Column(name = "fold_Paper_FingerR")
    private String foldPaperFingerR;
    @Column(name = "fold_Paper_FingerL")
    private String foldPaperFingerL;
    @Column(name = "tear_Paper_ThumbR")
    private String tearPaperThumbR;
    @Column(name = "tear_Paper_ThumbL")
    private String tearPaperThumbL;
    @Column(name = "tear_Paper_FingerR")
    private String tearPaperFingerR;
    @Column(name = "tear_Paper_FingerL")
    private String tearPaperFingerL;
    @Column(name = "hand_To_MouthR")
    private String handToMouthR;
    @Column(name = "hand_To_MouthL")
    private String handToMouthL;
    @Column(name = "ear_With_PalmR")
    private String earWithPalmR;
    @Column(name = "ear_With_PalmL")
    private String earWithPalmL;
    @Column(name = "sticker_On_BallR")
    private String stickerOnBallR;
    @Column(name = "sticker_On_BallL")
    private String stickerOnBallL;
    @Column(name = "socks_OnR")
    private String socksOnR;
    @Column(name = "socks_OnL")
    private String socksOnL;
    @Column(name = "fasten_ShoeR")
    private String fastenShoeR;
    @Column(name = "fasten_ShoeL")
    private String fastenShoeL;
    @Column(name = "crawlR")
    private String crawlR;
    @Column(name = "crawlL")
    private String crawlL;
    @Column(name = "wrist_Flex_GraspR")
    private String wristFlexGraspR;
    @Column(name = "wrist_Flex_GraspL")
    private String wristFlexGraspL;
    @Column(name = "wrist_Flex_RelR")
    private String wristFlexRelR;
    @Column(name = "wrist_Flex_RelL")
    private String wristFlexRelL;
    @Column(name = "wrist_Neut_GraspR")
    private String wristNeutGraspR;
    @Column(name = "wrist_Neut_GraspL")
    private String wristNeutGraspL;
    @Column(name = "wrist_Neut_RelR")
    private String wristNeutRelR;
    @Column(name = "wrist_Neut_RelL")
    private String wristNeutRelL;
    @Column(name = "wrist_Ext_RelR")
    private String wristExtRelR;
    @Column(name = "wrist_Ext_RelL")
    private String wristExtRelL;
    @Column(name = "wrist_Ext_GraspR")
    private String wristExtGraspR;
    @Column(name = "wrist_Ext_GraspL")
    private String wristExtGraspL;
    @Column(name = "shuee_Comments")
    private String shueeComments;
    @Column(name = "string_Bead_ThumbR")
    private String stringBeadThumbR;
    @Column(name = "string_Bead_ThumbL")
    private String stringBeadThumbL;
    @Column(name = "string_Bead_FingerR")
    private String stringBeadFingerR;
    @Column(name = "string_Bead_FingerL")
    private String stringBeadFingerL;
    @Column(name = "tear_PapeR_SFA")
    private String tearPapeR_SFA;
    @Column(name = "fold_PaperR_SFA")
    private String foldPaperR_SFA;
    @Column(name = "money_From_WalletR_SFA")
    private String moneyFromWalletR_SFA;
    @Column(name = "unscrew_BottleR")
    private String unscrewBottleR;
    @Column(name = "unscrew_BottleL")
    private String unscrewBottleL;
    @Column(name = "unscrew_BottleL_SFA")
    private String unscrewBottleL_SFA;
    @Column(name = "pull_PlaydoughR")
    private String pullPlaydoughR;
    @Column(name = "pull_PlaydoughL")
    private String pullPlaydoughL;
    @Column(name = "pull_PlaydoughR_SFA")
    private String pullPlaydoughR_SFA;
    @Column(name = "pull_PlaydoughL_SFA")
    private String pullPlaydoughL_SFA;
    @Column(name = "cut_PlaydoughL")
    private String cutPlaydoughL;
    @Column(name = "cut_PlaydoughR")
    private String cutPlaydoughR;
    @Column(name = "cut_PlaydoughR_SFA")
    private String cutPlaydoughR_SFA;
    @Column(name = "cut_PlaydoughL_SFA")
    private String cutPlaydoughL_SFA;
    @Column(name = "throw_Large_BallR")
    private String throwLargeBallR;
    @Column(name = "throw_Large_BallL")
    private String throwLargeBallL;
    @Column(name = "accept_CoinsR")
    private String acceptCoinsR;
    @Column(name = "accept_CoinsL")
    private String acceptCoinsL;
    @Column(name = "receive5R")
    private String receive5R;
    @Column(name = "receive5L")
    private String receive5L;
    @Column(name = "static_House")
    private String staticHouse;

    @Column(name = "patient_id")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patient_iD"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;







}
