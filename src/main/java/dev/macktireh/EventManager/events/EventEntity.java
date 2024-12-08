package dev.macktireh.EventManager.events;

import java.time.LocalDateTime;
import java.util.Set;

import dev.macktireh.EventManager.shared.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "events")
public class EventEntity extends BaseEntity {

    private String name;

    private String description;

    private LocalDateTime date;

    private String location;

    private int attendees;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<EventRegistrationEntity> registrations;

}
