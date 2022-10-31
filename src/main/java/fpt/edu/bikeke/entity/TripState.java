package fpt.edu.bikeke.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import fpt.edu.bikeke.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TripState")
public class TripState {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "tripId")
    private Trip trip;
    private Timestamp createdDate;

    private String stateFrom;
    private String stateTo;
    @ManyToOne
    @JoinColumn(name = "accountId")
    private Account account;


}
