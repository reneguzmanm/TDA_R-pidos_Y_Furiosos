/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     03/11/2017 15:16:31                          */
/*==============================================================*/


drop table if exists AUTOMOVIL;

drop table if exists CIUDAD;

drop table if exists CLIENTE;

drop table if exists COLOR;

drop table if exists COMUNA;

drop table if exists DETALLE_ORDEN;

drop table if exists DETALLE_PRESUPUESTO;

drop table if exists FACTURA;

drop table if exists MARCA;

drop table if exists MECANICO;

drop table if exists MODELO;

drop table if exists ORDEN_SERVICIO;

drop table if exists PRESUPUESTO;

drop table if exists REPUESTO;

drop table if exists TALLER;

drop table if exists TELEFONO;

drop table if exists TELEFONOS_CLIENTE;

/*==============================================================*/
/* Table: AUTOMOVIL                                             */
/*==============================================================*/
create table AUTOMOVIL
(
   PATENTE_VEHICULO     varchar(10) not null,
   RUT_CLIENTE          varchar(20),
   ID_MODELO            int,
   ID_COLOR_VEHICULO    bigint not null,
   NUM_MOTOR            varchar(20),
   KILOMETRAJE          int,
   ANO                  smallint,
   primary key (PATENTE_VEHICULO)
);

/*==============================================================*/
/* Table: CIUDAD                                                */
/*==============================================================*/
create table CIUDAD
(
   ID_CIUDAD            int not null auto_increment,
   NOMBRE_CIUDAD        varchar(20),
   primary key (ID_CIUDAD)
);

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE
(
   RUT_CLIENTE          varchar(20) not null,
   ID_COMUNA            int not null,
   NOMBRE_CLIENTE       varchar(20),
   APELLIDOP_CLIENTE    varchar(30),
   APELLIDOM_CLIENTE    varchar(30),
   DIRECCION_CLIENTE    varchar(40),
   primary key (RUT_CLIENTE)
);

/*==============================================================*/
/* Table: COLOR                                                 */
/*==============================================================*/
create table COLOR
(
   ID_COLOR_VEHICULO    bigint not null,
   COLOR                varchar(20),
   primary key (ID_COLOR_VEHICULO)
);

/*==============================================================*/
/* Table: COMUNA                                                */
/*==============================================================*/
create table COMUNA
(
   ID_COMUNA            int not null auto_increment,
   ID_CIUDAD            int not null,
   NOMBRE_COMUNA        varchar(20),
   primary key (ID_COMUNA)
);

/*==============================================================*/
/* Table: DETALLE_ORDEN                                         */
/*==============================================================*/
create table DETALLE_ORDEN
(
   ID_REP_O             int not null,
   NUM_ORDEN            int not null,
   FOLIO                int not null,
   CANTIDAD_REPUESTO_OR smallint,
   PRECIO_UNITARIO_OR   int,
   primary key (ID_REP_O)
);

/*==============================================================*/
/* Table: DETALLE_PRESUPUESTO                                   */
/*==============================================================*/
create table DETALLE_PRESUPUESTO
(
   ID_REP_P             int not null,
   NUM_PRESUPUESTO_CLIENTE int not null,
   CANTIDAD_REPUESTO_P  smallint,
   PRECIO_UNITARIO_P    int,
   primary key (ID_REP_P)
);

/*==============================================================*/
/* Table: FACTURA                                               */
/*==============================================================*/
create table FACTURA
(
   FOLIO                int not null auto_increment,
   PRECIO_NETO          int,
   PRECIO_IVA           int,
   COSTO_IVA            int,
   FECHA_EMISION        datetime,
   METODO_PAGO          varchar(20),
   MANO_OBRA            int,
   primary key (FOLIO)
);

/*==============================================================*/
/* Table: MARCA                                                 */
/*==============================================================*/
create table MARCA
(
   ID_MARCA             int not null auto_increment,
   NOMBRE_MARCA         varchar(20),
   primary key (ID_MARCA)
);

/*==============================================================*/
/* Table: MECANICO                                              */
/*==============================================================*/
create table MECANICO
(
   RUT_MECANICO         varchar(20) not null,
   ID_TALLER            int,
   NOMBRE_MECANICO      varchar(20),
   APELLIDO_MECANICO    varchar(20),
   primary key (RUT_MECANICO)
);

/*==============================================================*/
/* Table: MODELO                                                */
/*==============================================================*/
create table MODELO
(
   ID_MODELO            int not null auto_increment,
   ID_MARCA             int,
   NOMBRE_MODELO        varchar(30),
   primary key (ID_MODELO)
);

/*==============================================================*/
/* Table: ORDEN_SERVICIO                                        */
/*==============================================================*/
create table ORDEN_SERVICIO
(
   NUM_ORDEN            int not null auto_increment,
   PATENTE_VEHICULO     varchar(10) not null,
   RUT_MECANICO         varchar(20) not null,
   OBSERVACION_GRAL     varchar(500),
   FECHA_INICIO         datetime,
   FECHA_TERMINO        datetime,
   ESTADO_ORDEN         varchar(20),
   primary key (NUM_ORDEN)
);

/*==============================================================*/
/* Table: PRESUPUESTO                                           */
/*==============================================================*/
create table PRESUPUESTO
(
   NUM_PRESUPUESTO_CLIENTE int not null auto_increment,
   PATENTE_VEHICULO     varchar(10) not null,
   RUT_MECANICO         varchar(20) not null,
   TOTAL_PRESUPUESTO    int,
   DESCRIPCION_PRESUPUESTO varchar(300),
   primary key (NUM_PRESUPUESTO_CLIENTE)
);

/*==============================================================*/
/* Table: REPUESTO                                              */
/*==============================================================*/
create table REPUESTO
(
   ID_REPUESTO          int not null auto_increment,
   ID_MODELO            int not null,
   DESCRIPCION_REPUESTO varchar(30),
   STOCK_REPUESTO       int,
   PRECIO_REPUESTO      int,
   primary key (ID_REPUESTO)
);

/*==============================================================*/
/* Table: TALLER                                                */
/*==============================================================*/
create table TALLER
(
   ID_TALLER            int not null auto_increment,
   ID_COMUNA            int not null,
   DIRECCION_TALLER     varchar(20),
   EMAIL_TALLER         varchar(30),
   primary key (ID_TALLER)
);

/*==============================================================*/
/* Table: TELEFONO                                              */
/*==============================================================*/
create table TELEFONO
(
   NUM_TELEFONO_CLI     varchar(20) not null,
   ID_TALLER            int,
   primary key (NUM_TELEFONO_CLI)
);

/*==============================================================*/
/* Table: TELEFONOS_CLIENTE                                     */
/*==============================================================*/
create table TELEFONOS_CLIENTE
(
   ID_TELEFONO_CLIENTE  varchar(15) not null,
   RUT_CLIENTE          varchar(20) not null,
   primary key (ID_TELEFONO_CLIENTE)
);

alter table AUTOMOVIL add constraint FK_ESTA_PINTADO foreign key (ID_COLOR_VEHICULO)
      references COLOR (ID_COLOR_VEHICULO) on delete restrict on update restrict;

alter table AUTOMOVIL add constraint FK_ES_DUENO foreign key (RUT_CLIENTE)
      references CLIENTE (RUT_CLIENTE) on delete restrict on update restrict;

alter table AUTOMOVIL add constraint FK_PERTENECE foreign key (ID_MODELO)
      references MODELO (ID_MODELO) on delete restrict on update restrict;

alter table CLIENTE add constraint FK_VIVE foreign key (ID_COMUNA)
      references COMUNA (ID_COMUNA) on delete restrict on update restrict;

alter table COMUNA add constraint FK_ESTA_UBICADA foreign key (ID_CIUDAD)
      references CIUDAD (ID_CIUDAD) on delete restrict on update restrict;

alter table DETALLE_ORDEN add constraint FK_RELATIONSHIP_19 foreign key (FOLIO)
      references FACTURA (FOLIO) on delete restrict on update restrict;

alter table DETALLE_ORDEN add constraint FK_SE_DETALLA foreign key (NUM_ORDEN)
      references ORDEN_SERVICIO (NUM_ORDEN) on delete restrict on update restrict;

alter table DETALLE_PRESUPUESTO add constraint FK_SE_COMPONE foreign key (NUM_PRESUPUESTO_CLIENTE)
      references PRESUPUESTO (NUM_PRESUPUESTO_CLIENTE) on delete restrict on update restrict;

alter table MECANICO add constraint FK_TRABAJA foreign key (ID_TALLER)
      references TALLER (ID_TALLER) on delete restrict on update restrict;

alter table MODELO add constraint FK_TIENE foreign key (ID_MARCA)
      references MARCA (ID_MARCA) on delete restrict on update restrict;

alter table ORDEN_SERVICIO add constraint FK_ES_REPARADO foreign key (PATENTE_VEHICULO)
      references AUTOMOVIL (PATENTE_VEHICULO) on delete restrict on update restrict;

alter table ORDEN_SERVICIO add constraint FK_REPARA foreign key (RUT_MECANICO)
      references MECANICO (RUT_MECANICO) on delete restrict on update restrict;

alter table PRESUPUESTO add constraint FK_REALIZA foreign key (RUT_MECANICO)
      references MECANICO (RUT_MECANICO) on delete restrict on update restrict;

alter table PRESUPUESTO add constraint FK_SE_INGRESA foreign key (PATENTE_VEHICULO)
      references AUTOMOVIL (PATENTE_VEHICULO) on delete restrict on update restrict;

alter table REPUESTO add constraint FK_USA foreign key (ID_MODELO)
      references MODELO (ID_MODELO) on delete restrict on update restrict;

alter table TALLER add constraint FK_SE_UBICA foreign key (ID_COMUNA)
      references COMUNA (ID_COMUNA) on delete restrict on update restrict;

alter table TELEFONO add constraint FK_SE_CONTACTA foreign key (ID_TALLER)
      references TALLER (ID_TALLER) on delete restrict on update restrict;

alter table TELEFONOS_CLIENTE add constraint FK_ES_CONTACTADO foreign key (RUT_CLIENTE)
      references CLIENTE (RUT_CLIENTE) on delete restrict on update restrict;

