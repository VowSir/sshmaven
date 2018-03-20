package io.man.mavenweb.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter@Setter@NoArgsConstructor
@Entity
@Table(name = "t_dep")
public class Dep {

    @Id
//    @GenericGenerator(name = "myuuid",strategy = "uuid")
//    @GeneratedValue(generator = "myuuid")
    private Long uuid;

    private String name;

    private String tele;

}
