package com.example.gaitlabapp.model.visits;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Data
@Table(name = "apt_set_dates")
public class IAppointmentSetDates {
    @Id
    @GeneratedValue
    @Column(name = "set_dates_id")
    private Integer set_dates_id;
    @Column(name = "name")
    private String name;
    @Column(name = "active")
    private Boolean active;
    @Column(name = "apt_date")
    private String apt_date;

}
