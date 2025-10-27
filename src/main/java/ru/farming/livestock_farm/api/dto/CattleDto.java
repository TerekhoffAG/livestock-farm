package ru.farming.livestock_farm.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.farming.livestock_farm.dao.CattleEntity;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class CattleDto {

    @Schema(title = "Имя животного (кличка)")
    private String nickname;

    @Schema(title = "Дата рождения")
    private LocalDate birthDate;

    @Schema(title = "Дата выбытия")
    private LocalDate leavingDate;

    @Schema(title = "Порода")
    private String breed;

    @Schema(title = "Пол")
    private CattleEntity.Sex sex;

    @Schema(title = "Состояние животного")
    private CattleEntity.State state;

    @Schema(title = "Цель разведения")
    private CattleEntity.Purpose breedPurpose;
}
