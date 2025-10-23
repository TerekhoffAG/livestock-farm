--liquibase formatted sql

--changeset lf:1

create table lf_cattle (
  id uuid not null,
  unsm_fed varchar(11)
  unsm_dgl varchar(15)
  nickname varchar(255),
  birth_date date,
  leaving_date date,
  breed varchar(255),
  state varchar(255),
  breed_purpose varchar(255),
  primary key (id)
);

comment on table lf_cattle is 'КРС';
comment on column lf_cattle.id is 'Суррогатный идентификатор';
comment on column lf_cattle.nickname is 'Кличка';
comment on column lf_cattle.birth_date is 'Дата рождения';
comment on column lf_cattle.leaving_date is 'Дата выбытия';
comment on column lf_cattle.breed is 'Порода';
comment on column lf_cattle.state is 'Состояние животного';
comment on column lf_cattle.breed_purpose is 'Цель разведения';