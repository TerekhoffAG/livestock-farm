package ru.farming.livestock_farm.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.farming.livestock_farm.api.dto.CattleDto;

import java.util.UUID;

@Tag(name = "КРС", description = "методы взаимодействия с КРС")
@RequestMapping("/v1/cattle")
public interface CattleApi {

    @Operation(summary = "Получение КРС по идентификатору")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ок", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CattleDto.class))
            })
    })
    @GetMapping("/{uuid}")
    ResponseEntity<CattleDto> get(
            @Parameter(description = "Идентификатор КРС", required = true)
            @PathVariable UUID uuid
    );

    @Operation(summary = "Создание КРС")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ок", content = {
                    @Content(
                            mediaType = "text/plain; charset=utf-8",
                            schema = @Schema(title = "uuid созданной сущности", implementation = UUID.class)
                    )
            })
    })
    @PostMapping()
    ResponseEntity<UUID> create(@RequestBody CattleDto createRequest);

    @Operation(summary = "Обновление КРС")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Ок"),
    })
    @PutMapping("/{uuid}")
    ResponseEntity<Void> update(@PathVariable UUID uuid, @RequestBody CattleDto createRequest);

    @Operation(summary = "Удаление КРС")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Ок"),
    })
    @DeleteMapping("/{uuid}")
    ResponseEntity<Void> delete(@PathVariable UUID uuid);
}
