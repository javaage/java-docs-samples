/*==============================================================*/
/* DBMS name:      PostgreSQL 9.x                               */
/* Created on:     12/29/2017 9:18:09 AM                        */
/*==============================================================*/

drop table LA_COURSE;

drop table LA_CRS_HISTORY;

drop table LA_GOLDEN_SAMPLE;

drop table LA_RL_HISTORY;

drop table LA_ROLE;

drop table LA_USER;

/*==============================================================*/
/* Table: LA_COURSE                                             */
/*==============================================================*/
create table LA_COURSE (
   CRS_ID               SERIAL not null,
   CRS_NAME             varchar              not null,
   CRS_PRICE            float                not null,
   CRS_STARTDATE        DATE                 null,
   CRS_ENDDATE          DATE                 null,
   CRS_ACTIVE           BOOL                 not null,
   constraint PK_LA_COURSE primary key (CRS_ID)
);

/*==============================================================*/
/* Table: LA_CRS_HISTORY                                        */
/*==============================================================*/
create table LA_CRS_HISTORY (
   HSTR_USR_ID          varchar              not null,
   HSTR_CRS_ID          int                  not null
);

/*==============================================================*/
/* Table: LA_GOLDEN_SAMPLE                                      */
/*==============================================================*/
create table LA_GOLDEN_SAMPLE (
   SMPL_NAME            varchar              not null,
   SMPL_ROLE            varchar              not null,
   SMPL_RL_NAME         varchar              not null,
   SMPL_MANDATORY       varchar              not null,
   SMPL_OPTIONAL        varchar              not null,
   SMPL_UPDATE_TIME     TIMESTAMP            not null,
   SMPL_ACTIVE          BOOL                 not null
);

/*==============================================================*/
/* Table: LA_RL_HISTORY                                         */
/*==============================================================*/
create table LA_RL_HISTORY (
   HSTR_USR_ID          varchar              not null,
   HSTR_RL_NAME         varchar              not null,
   HSTR_RL_HISTORY      varchar              not null,
   HSTR_UPDATE_TIME     TIMESTAMP            not null
);

/*==============================================================*/
/* Table: LA_ROLE                                               */
/*==============================================================*/
create table LA_ROLE (
   RL_NAME              varchar              not null,
   RL_BU                varchar              null,
   RL_TITLE             varchar              null,
   RL_GRADE             varchar              null,
   RL_ACTIVE            BOOL                 not null,
   constraint PK_LA_ROLE primary key (RL_NAME)
);

/*==============================================================*/
/* Table: LA_USER                                               */
/*==============================================================*/
create table LA_USER (
   USR_ID               varchar              not null,
   USR_NAME             varchar              not null,
   USR_BUDGET           float                not null,
   USR_BALANCE          float                not null,
   USR_BU               varchar              null,
   USR_TITLE            varchar              null,
   USR_GRADE            varchar              null,
   USR_RL_NAME          varchar              null,
   USR_ACTIVE           BOOL                 not null,
   constraint PK_LA_USER primary key (USR_ID)
);

