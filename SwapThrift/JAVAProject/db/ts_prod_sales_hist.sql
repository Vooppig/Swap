CREATE TABLE TS_PROD_SALES_HIST(HIST_ID Serial, HIST_DATE DATE NOT NULL);
ALTER TABLE TS_PROD_SALES_HIST
ADD HIST_DATETIME TIMESTAMP;
ALTER TABLE TS_PROD_SALES_HIST
ADD USER_ID INT NOT NULL;
CREATE UNIQUE INDEX PK_TS_PROD_SALES_HIST ON TS_PROD_SALES_HIST(HIST_ID);
ALTER TABLE TS_PROD_SALES_HIST
ADD CONSTRAINT PK_TS_PROD_SALES_HIST PRIMARY KEY USING INDEX PK_TS_PROD_SALES_HIST;
CREATE INDEX FK_TS_PROD_SALES_HIST_USER ON TS_PROD_SALES_HIST(USER_ID);
ALTER TABLE TS_PROD_SALES_HIST
ADD CONSTRAINT FK_TS_PROD_SALES_HIST_USER FOREIGN KEY (USER_ID) REFERENCES TS_USER_TABLE (ID);