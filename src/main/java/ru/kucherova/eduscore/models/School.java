package ru.kucherova.eduscore.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "schools")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "global_id")
    private Long globalId;
    @Column(name = "year")
    private String year;
    @Column(name = "adm_area")
    private String admArea;
    @Column(name = "district")
    private String district;
    @Column(name = "passes_over_220")
    private Integer passesOver220;
    @Column(name = "passes_under_160")
    private Integer passesUnder160;
    @Column(name = "address")
    private String address;
}
