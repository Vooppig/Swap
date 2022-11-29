create table ts_Report(
    id Serial,
    r_date date not null,
    r_text text,
    user_id int not null,
    prod_id int,
    user_reported_id int,
    ts_report_datetime timestamp
);
create unique index pk_ts_report on ts_report (id, r_date);
alter table ts_Report
add constraint pk_ts_report primary key using index pk_ts_report;
alter table ts_Report
add constraint fk_ts_report foreign key (user_id) references ts_user_table (id);