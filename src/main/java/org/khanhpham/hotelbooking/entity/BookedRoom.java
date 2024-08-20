package org.khanhpham.hotelbooking.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "booked_room")
public class BookedRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long bookingId;
    @Column(name = "check_in_date", nullable = false)
    private LocalDateTime checkInDate;
    @Column(name = "check_out_date", nullable = false)
    private LocalDateTime checkOutDate;
    @Column(name = "num_guests", nullable = false)
    private int numOfGuests;
    @Column(name = "guest_name", nullable = false)
    private String guestName;
    @Column(name = "guest_phone", nullable = false)
    private String guestPhone;
    @Column(name = "guest_email", nullable = false)
    private String guestEmail;
    @Column(name = "num_adults", nullable = false)
    private int numOfAdults;
    @Column(name = "num_children", nullable = false)
    private int numOfChildren;
    @Column(name = "confirm_code", nullable = false)
    private String bookingConfirmationCode;
    @Column(name = "booking_note")
    private String bookingNote;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id")
    private Room room;
    private boolean isPaid;
    private boolean isCancelled;

}
