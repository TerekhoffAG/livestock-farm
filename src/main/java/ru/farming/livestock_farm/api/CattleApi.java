package ru.farming.livestock_farm.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.farming.livestock_farm.api.dto.CattleDto;

import java.util.UUID;

@RequestMapping("/v1/cattle")
public interface CattleApi {

    @GetMapping("/{uuid}")
    ResponseEntity<CattleDto> get(@PathVariable UUID uuid);

    @PostMapping()
    ResponseEntity<UUID> create(@RequestBody CattleDto createRequest);

    @PutMapping("/{uuid}")
    ResponseEntity<Void> update(@PathVariable UUID uuid, @RequestBody CattleDto createRequest);
}
