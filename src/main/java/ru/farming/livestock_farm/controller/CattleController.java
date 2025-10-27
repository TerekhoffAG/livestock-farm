package ru.farming.livestock_farm.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.farming.livestock_farm.api.CattleApi;
import ru.farming.livestock_farm.api.dto.CattleDto;

import java.util.UUID;

@RestController
public class CattleController implements CattleApi {
    @Override
    public ResponseEntity<CattleDto> get(UUID uuid) {
        return null;
    }

    @Override
    public ResponseEntity<UUID> create(CattleDto createRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Void> update(UUID uuid, CattleDto createRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(UUID uuid) {
        return null;
    }
}
