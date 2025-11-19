package ru.farming.livestock_farm.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.farming.livestock_farm.api.CattleApi;
import ru.farming.livestock_farm.api.dto.CattleDto;
import ru.farming.livestock_farm.dao.CattleEntity;
import ru.farming.livestock_farm.service.CattleService;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class CattleController implements CattleApi {

    private final CattleService service;

    @Override
    public ResponseEntity<CattleDto> get(UUID uuid) {
        return null;
    }

    @Override
    public ResponseEntity<UUID> add(CattleDto createRequest) {
        CattleEntity cattle = CattleEntity.builder()
                .nickname(createRequest.getNickname())
                .build();
        CattleEntity entity = service.add(cattle);

        return ResponseEntity.ok(entity.getId());
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
