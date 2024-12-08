package dev.macktireh.EventManager.events;

import dev.macktireh.EventManager.shared.BaseEntity;
import dev.macktireh.EventManager.users.UserEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "event_registrations")
public class EventRegistrationEntity extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "event_id")
    private EventEntity event;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity participants;

    @Enumerated(EnumType.STRING)
    private RegistrationStatus status;

}
