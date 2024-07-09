package com.example.gaitlabapp.model.forms;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Setter
@Getter
@Data
@NoArgsConstructor
@Entity
@Table(name = "o2")
public class IO2Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "o2Id")
    private Integer o2Id;
    @Column(name = "time_test")
    private String timeTest;
    @Column(name = "start_Time")
    private String startTime;
    @Column(name = "o2Start")
    private String o2Start;
    @Column(name = "o2Finish")
    private String o2Finish;
    @Column(name = "sit_Time")
    private String sitTime;
}
