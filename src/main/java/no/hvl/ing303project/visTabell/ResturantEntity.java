package no.hvl.ing303project.visTabell;

import jakarta.persistence.*;

@Entity
@Table(name="din_tabell")
public class ResturantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String navn;
    private String sted;
}
