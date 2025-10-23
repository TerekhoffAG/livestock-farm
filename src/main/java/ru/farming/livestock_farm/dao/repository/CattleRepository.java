package ru.farming.livestock_farm.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.farming.livestock_farm.dao.CattleEntity;

import java.util.UUID;

@Repository
public interface CattleRepository extends JpaRepository<CattleEntity, UUID> {
}
