package com.example.gaitlabapp.model.users;

import lombok.Data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Users")
public class IUsersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Integer userId;
    @Column(name = "username")
    private String username;
    @Column(name = "userPassword")
    private String userPassword;
    @Column(name = "userAccess")
    private String userAccess;
    @Column(name = "userLastLogin")
    private String userLastLogin;
    @Column(name = "userFacility")
    private String userFacility;
    @Column(name = "userActive")
    private Boolean userActive;
    @Column(name = "userEmail")
    private String userEmail;
    @Column(name = "userType")
    private String userType;
    @Column(name = "userCreditentials")
    private Integer userCredentials;
    @Column(name = "userAdmin")
    private Boolean userAdmin;
    @Column(name = "userCategory")
    private String userCategory;
}
