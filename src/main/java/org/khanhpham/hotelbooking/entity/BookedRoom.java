package org.khanhpham.hotelbooking.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "booked_rooms")
public class BookedRoom extends AuditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long bookingId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

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

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    private boolean isPaid;

    private boolean isCancelled;
}
