create table users1
(
    id        serial
        constraint users_pk
            primary key,
    firstname    varchar,
    username  varchar,
    email     varchar,
    password  varchar
);

alter table users1
    owner to postgres;

create unique index users_id_uindex
    on users1 (id);