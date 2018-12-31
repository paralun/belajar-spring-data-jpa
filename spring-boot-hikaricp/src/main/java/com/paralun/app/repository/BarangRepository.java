package com.paralun.app.repository;

import com.paralun.app.model.Barang;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarangRepository extends CrudRepository<Barang, Long> {
}
