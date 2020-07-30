package com.exchange.repository;

import com.exchange.entity.CursValutar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CursValutarRepository extends JpaRepository<CursValutar, Long> {

    Optional<CursValutar> getByCurrency(String currencyCode);

}
