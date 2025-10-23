package ru.farming.livestock_farm.api.dto;

import ru.farming.livestock_farm.dao.CattleEntity;

import java.time.LocalDate;

public class CattleDto {
    private String nickname;

    private LocalDate birthDate;

    private LocalDate leavingDate;

    private String breed;

    private CattleEntity.Sex sex;

    private CattleEntity.State state;

    private CattleEntity.Purpose breedPurpose;
}
