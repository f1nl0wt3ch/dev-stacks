-- DROP SEQUENCE
DROP SEQUENCE IF EXISTS ds_category_id_seq;
DROP TABLE IF EXISTS ds_category;
-- CREATE TABLE ds_category
CREATE SEQUENCE ds_category_id_seq;
CREATE TABLE ds_category ( 
  ds_category_id integer NOT NULL DEFAULT nextval('ds_category_id_seq') PRIMARY KEY,
  ds_name text NOT NULL,
  ds_created_date timestamp default now()
);
-- INSERT TEST DATA TO DS_CATEGORY
INSERT INTO ds_category(ds_name) VALUES ('Frontend Development'),('Backend Development'),('Mobile Development'),('AWS Cloud'),('Azure Cloud');


-- DROP SEQUENCE
DROP SEQUENCE IF EXISTS ds_stack_id_seq;
DROP TABLE IF EXISTS ds_stack;

-- CREATE TABLE ds_stack
CREATE SEQUENCE ds_stack_id_seq;
CREATE TABLE ds_stack (
  ds_stack_id integer NOT NULL DEFAULT nextval('ds_stack_id_seq') PRIMARY KEY,
  ds_name text NOT NULL,
  ds_description text,
  fk_ds_category_id integer,
  FOREIGN KEY (fk_ds_category_id) REFERENCES ds_category (ds_category_id)
);

-- DROP SEQUENCE
DROP SEQUENCE IF EXISTS ds_user_id_seq;
DROP TABLE IF EXISTS ds_user;

-- CREATE TABLE ds_stack
CREATE SEQUENCE ds_user_id_seq;
CREATE TABLE ds_user (
  ds_user_id integer NOT NULL DEFAULT nextval('ds_user_id_seq') PRIMARY KEY,
  ds_first_name text,
  ds_last_name text,
  ds_email text NOT NULL,
  ds_password text NOT NULL,
  ds_inactive boolean DEFAULT false,
  ds_created_date timestamp DEFAULT now()
);

-- INSERT TESTING USER
INSERT INTO ds_user(ds_first_name, ds_last_name, ds_email, ds_password) VALUES ('Pinja', 'Pynnönen', 'pinja.pynnonen@gmail.com','123456');
INSERT INTO ds_user(ds_first_name, ds_last_name, ds_email, ds_password) VALUES ('Thinh', 'Dinh', 'thinh.dinh@gmail.com','123456');