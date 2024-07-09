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
@Table(name = "users")
public class IUsersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "username")
    private String username;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "user_access")
    private String userAccess;
    @Column(name = "user_last_login")
    private String userLastLogin;
    @Column(name = "user_facility")
    private String userFacility;
    @Column(name = "user_active")
    private Boolean userActive;
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "user_type")
    private String userType;
    @Column(name = "user_creditentials")
    private Integer userCredentials;
    @Column(name = "user_admin")
    private Boolean userAdmin;
    @Column(name = "user_category")
    private String userCategory;
}
