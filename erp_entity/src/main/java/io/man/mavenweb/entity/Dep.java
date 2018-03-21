package io.man.mavenweb.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter@Setter@NoArgsConstructor
@Entity
@Table(name = "t_dep")
public class Dep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uuid;

    private String name;

    private String tele;

}
