create table ts_user_table(
    id SERIAL,
    name varchar(20) not null,
    created_date date,
    user_pass varchar(32)
);
create unique index pk_ts_user_table on ts_user_table (id);
alter table ts_user_table
add constraint pk_ts_user_table primary key using index pk_ts_user_table;
