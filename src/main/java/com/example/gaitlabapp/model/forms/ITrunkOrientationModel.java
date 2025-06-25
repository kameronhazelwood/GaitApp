package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Data
@Table(name = "trunkOrientation")
public class ITrunkOrientationModel {
    @Id
    @GeneratedValue
    private Integer trunkOreinId;
    @Column(name = "latTrunkTilMaxR")
    private String latTrunkTilMaxR;
    @Column(name = "latTrunkTilMaxL")
    private String latTrunkTilMaxL;
    @Column(name = "forTrunkTilMaxR")
    private String forTrunkTilMaxR;
    @Column(name = "forTrunkTilMaxL")
    private String forTrunkTilMaxL;
    @Column(name = "trunkRotMaxR")
    private String trunkRotMaxR;
    @Column(name = "trunkRotMaxL")
    private String trunkRotMaxL;
    @Column(name =  "latTrunkTilMaxR_interp")
    private String latTrunkTilMaxR_interp;
    @Column(name = "latTrunkTilMaxL_interp")
    private String latTrunkTilMaxL_interp;
    @Column(name = "forTrunkTilMaxR_interp")
    private String forTrunkTilMaxR_interp;
    @Column(name = "forTrunkTilMaxL_interp")
    private String forTrunkTilMaxL_interp;
    @Column(name = "trunkRotMaxR_interp")
    private String trunkRotMaxR_interp;
    @Column(name = "trunkRotMaxL_interp")
    private String trunkRotMaxL_interp;




}
