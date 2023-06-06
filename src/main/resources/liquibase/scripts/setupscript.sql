-- liquibase formatted sql

-- changeset vasilydemin:1
CREATE TABLE chat_config(
                            id bigserial primary key,
                            chat_id bigint,
                            chat_state smallint,
                            previous_chat_state smallint default 2
);
CREATE TABLE users(
                      id bigserial primary key,
                      first_name text,
                      second_name text,
                      nick_name text,
                      chat_id bigint
);
-- INSERT INTO users (first_name, second_name, nick_name, chat_id)
-- VALUES ('Vasily', 'Demin', 'CatOgre', 334390754);
-- INSERT INTO chat_config (chat_id, chat_state)
-- VALUES (334390754, 1);