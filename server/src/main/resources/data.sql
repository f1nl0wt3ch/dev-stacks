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