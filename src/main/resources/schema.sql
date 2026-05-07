DROP TABLE IF EXISTS "AUTHORS";
DROP TABLE IF EXISTS "BOOKS";


CREATE TABLE "AUTHORS" (
   "ID" bigint  DEFAULT nextval('authors_id_seq') NOT NULL,
   "name" text,
   "age" integer,
   CONSTRAINT "authors_pkey" PRIMARY KEY ("ID")
);

CREATE TABLE "BOOKS" (
     "isin" text NOT NULL,
     "title" text,
     "AUTHOR_ID" bigint,
     CONSTRAINT "books_pkey" PRIMARY KEY ("isin"),
     CONSTRAINT "fk_author" FOREIGN KEY(AUTHOR_ID)
         REFERENCES authors(ID)
);