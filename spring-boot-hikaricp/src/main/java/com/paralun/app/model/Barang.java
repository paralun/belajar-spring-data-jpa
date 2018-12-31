package com.paralun.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "t_barang")
public class Barang implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BRG_SEQ")
    @SequenceGenerator(name = "BRG_SEQ", sequenceName = "BRG_SEQ")
    @Column(name = "kode")
    private Long kode;
    @Column(name = "nama_brg")
    private String namaBrg;
    @Column(name = "kategori")
    private String kategori;
    @Column(name = "harga")
    private Long harga;
    @Column(name = "stok")
    private int stok;
}
