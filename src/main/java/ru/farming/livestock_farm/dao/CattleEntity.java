package ru.farming.livestock_farm.dao;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "lf_cattle")
public abstract class CattleEntity {

    /**
     * Суррогатный идентификатор записи в БД
     */
    @Id
    @Column(name = "id")
    @UuidGenerator(style = UuidGenerator.Style.RANDOM)
    private UUID id;

    /**
     * Уникальный номер средств маркирования - федеральный (RU1b3161006)
     */
    @Column(name = "unsm_fed")
    private String unsmFed;

    /**
     * Уникальный номер средств маркирования - цифровой (643024127965072)
     */
    @Column(name = "unsm_dgl")
    private String unsmDgl;

    /**
     * Имя животного (кличка)
     */
    @Column(name = "nickname")
    private String nickname;

    /**
     * Дата рождения
     */
    @Column(name = "birth_date")
    private LocalDate birthDate;

    /**
     * Дата выбытия
     */
    @Column(name = "leaving_date")
    private LocalDate leavingDate;

    /**
     * Порода
     */
    @Column(name = "breed")
    private String breed;

    /**
     * Пол
     */
    @Column(name = "sex")
    @Enumerated(EnumType.STRING)
    private Sex sex;

    /**
     * Состояние животного
     */
    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private State state;

    /**
     * Цель разведения
     */
    @Column(name = "breed_purpose")
    @Enumerated(EnumType.STRING)
    private Purpose breedPurpose;

    public enum Sex {
        BULL, COW
    }

    public enum State {
        HEALTHY, SICK, SOLD, DECEASED
    }

    public enum Purpose {
        BREEDING, MEAT, GENETICS, MILK
    }
}
