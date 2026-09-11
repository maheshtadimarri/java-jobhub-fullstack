create table users (
 id bigserial primary key,
 email varchar(320) not null unique,
 credential_hash varchar(255) not null,
 role varchar(32) not null,
 enabled boolean not null default true,
 created_at timestamp with time zone not null
);
