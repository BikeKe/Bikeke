package fpt.edu.bikeke.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import fpt.edu.bikeke.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CustomerTrip")
public class CustomerTrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "routeSlotId")
    private RouteSlot routeSlot;

    @ManyToOne
    @JoinColumn(name = "pickupStationId")
    private Station pickupStation;

    @ManyToOne
    @JoinColumn(name = "headtoStationId")
    private Station headtoStation;
    private Float amount;

    @ManyToOne
    @JoinColumn(name = "paymentMethodId")
    private PaymentMethod paymentMethod;

    private Timestamp createdDate;
    @Enumerated(EnumType.STRING)
    private EnumActive status;

    @OneToMany(fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Trip> tripList;
}
