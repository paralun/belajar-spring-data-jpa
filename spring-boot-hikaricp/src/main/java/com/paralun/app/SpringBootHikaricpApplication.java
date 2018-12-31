package com.paralun.app;

import com.paralun.app.model.Barang;
import com.paralun.app.repository.BarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHikaricpApplication implements CommandLineRunner {

    @Autowired
    BarangRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHikaricpApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Barang barang = new Barang();
        barang.setNamaBrg("Aqua");
        barang.setKategori("Minuman");
        barang.setHarga(3000L);
        barang.setStok(40);

        repo.save(barang);
    }
}

