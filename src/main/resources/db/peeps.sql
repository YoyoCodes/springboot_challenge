DROP TABLE IF EXISTS peeps;

CREATE TABLE peeps (
  id bigserial PRIMARY KEY,
  content varchar(250) NOT NULL
);