package com.example.gaitlabapp.model.patients;


import lombok.Data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.nio.file.WatchEvent;


@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "png")
public class IPngModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "png_id")
    private Integer pngId;
    @Column(name = "label")
    private String label;
    @Column(name = "file_name")
    private String fileName;
    private String image;
    private byte image2;
    @Column(name = "sub_dir")
    private String subDir;
    @Column(name = "level")
    private Integer level;
    @Column(name = "sort_order")
    private Integer sortOrder;
    @Column(name = "active")
    private Boolean active;

}
