CREATE DATABASE test;

CREATE TABLE public.contacts
(
  id bigserial not null
    constraint contacts_pkey
    primary key,
  name varchar(255)
);
ALTER TABLE public.contacts
  OWNER TO postgres;

