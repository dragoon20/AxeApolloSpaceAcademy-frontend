# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table anggota (
  id                        integer auto_increment not null,
  email                     varchar(255),
  sandi                     varchar(255),
  nama                      varchar(255),
  no_handphone              varchar(255),
  alamat                    varchar(255),
  activation_code           varchar(255),
  is_activated              integer,
  constraint pk_anggota primary key (id))
;

create table bandara (
  id                        integer auto_increment not null,
  nama                      varchar(255),
  kode                      varchar(255),
  daerah                    varchar(255),
  biaya                     integer,
  constraint pk_bandara primary key (id))
;

create table log_login (
  id                        integer auto_increment not null,
  anggota_id                integer,
  timestamp                 varchar(255),
  constraint pk_log_login primary key (id))
;

create table log_pencarian (
  id                        integer auto_increment not null,
  asal                      varchar(255),
  tujuan                    varchar(255),
  tanggal_berangkat         varchar(255),
  tanggal_kembali           varchar(255),
  jumlah_penumpang          integer,
  timestamp                 varchar(255),
  sekali_jalan              integer,
  constraint pk_log_pencarian primary key (id))
;

create table pemesan (
  id                        integer auto_increment not null,
  constraint pk_pemesan primary key (id))
;

create table pemesanan (
  id                        integer auto_increment not null,
  kode_booking              varchar(255),
  penerbangan_id            integer,
  constraint pk_pemesanan primary key (id))
;

create table penerbangan (
  id                        integer auto_increment not null,
  kode_penerbangan          varchar(255),
  jam_berangkat             varchar(255),
  jam_tiba                  varchar(255),
  tanggal                   varchar(255),
  harga                     integer,
  bandara_asal_id           integer,
  bandara_tujuan_id         integer,
  pesawat_id                integer,
  constraint pk_penerbangan primary key (id))
;

create table penumpang (
  id                        integer auto_increment not null,
  pemesanan_id              integer,
  titel                     varchar(255),
  nama                      varchar(255),
  no_kursi                  varchar(255),
  is_checkin                integer,
  constraint pk_penumpang primary key (id))
;

create table pesawat (
  id                        integer auto_increment not null,
  nama                      varchar(255),
  total_kursi               integer,
  constraint pk_pesawat primary key (id))
;

alter table log_login add constraint fk_log_login_anggota_1 foreign key (anggota_id) references anggota (id) on delete restrict on update restrict;
create index ix_log_login_anggota_1 on log_login (anggota_id);
alter table pemesanan add constraint fk_pemesanan_penerbangan_2 foreign key (penerbangan_id) references penerbangan (id) on delete restrict on update restrict;
create index ix_pemesanan_penerbangan_2 on pemesanan (penerbangan_id);
alter table penerbangan add constraint fk_penerbangan_bandara_asal_3 foreign key (bandara_asal_id) references bandara (id) on delete restrict on update restrict;
create index ix_penerbangan_bandara_asal_3 on penerbangan (bandara_asal_id);
alter table penerbangan add constraint fk_penerbangan_bandara_tujuan_4 foreign key (bandara_tujuan_id) references bandara (id) on delete restrict on update restrict;
create index ix_penerbangan_bandara_tujuan_4 on penerbangan (bandara_tujuan_id);
alter table penerbangan add constraint fk_penerbangan_pesawat_5 foreign key (pesawat_id) references pesawat (id) on delete restrict on update restrict;
create index ix_penerbangan_pesawat_5 on penerbangan (pesawat_id);
alter table penumpang add constraint fk_penumpang_pemesanan_6 foreign key (pemesanan_id) references pemesanan (id) on delete restrict on update restrict;
create index ix_penumpang_pemesanan_6 on penumpang (pemesanan_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table anggota;

drop table bandara;

drop table log_login;

drop table log_pencarian;

drop table pemesan;

drop table pemesanan;

drop table penerbangan;

drop table penumpang;

drop table pesawat;

SET FOREIGN_KEY_CHECKS=1;

