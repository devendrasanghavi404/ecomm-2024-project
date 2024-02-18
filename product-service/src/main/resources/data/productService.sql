-- H2 2.2.224;
;             
CREATE USER IF NOT EXISTS "SA" SALT '52a7ff7fc0886b2b' HASH '14088ac3f72cc40c78f25aa3b4bf5b2d63e2d7a3ccef6c967babd26bab04fd5b' ADMIN;         
CREATE MEMORY TABLE "PUBLIC"."TB_BRANDS"(
    "BRAND_ID" INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1 RESTART WITH 2) NOT NULL,
    "BRAND_DESCRIPTION" CHARACTER VARYING(255),
    "BRAND_NAME" CHARACTER VARYING(255)
);       
ALTER TABLE "PUBLIC"."TB_BRANDS" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_8" PRIMARY KEY("BRAND_ID");              
-- 1 +/- SELECT COUNT(*) FROM PUBLIC.TB_BRANDS;               
INSERT INTO "PUBLIC"."TB_BRANDS" VALUES
(1, 'Leading manufacturer of electronic devices', 'Lenovo');         
CREATE MEMORY TABLE "PUBLIC"."TB_CATEGORIES"(
    "CATEGORY_ID" INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1 RESTART WITH 2) NOT NULL,
    "CATEGORY_DESCRIPTION" CHARACTER VARYING(255),
    "CATEGORY_NAME" CHARACTER VARYING(255)
);          
ALTER TABLE "PUBLIC"."TB_CATEGORIES" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_E" PRIMARY KEY("CATEGORY_ID");       
-- 1 +/- SELECT COUNT(*) FROM PUBLIC.TB_CATEGORIES;           
INSERT INTO "PUBLIC"."TB_CATEGORIES" VALUES
(1, 'Devices powered by electricity', 'Electronics');            
CREATE MEMORY TABLE "PUBLIC"."TB_PRODUCTS"(
    "PRODUCT_ID" INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1 RESTART WITH 2) NOT NULL,
    "CREATED_AT" TIMESTAMP(6) WITH TIME ZONE,
    "IN_STOCK" BOOLEAN,
    "MODIFIED_AT" TIMESTAMP(6) WITH TIME ZONE,
    "PRICE" FLOAT(24),
    "PRODUCT_DESCRIPTION" CHARACTER VARYING(255),
    "PRODUCT_NAME" CHARACTER VARYING(255),
    "QUANTITY" INTEGER,
    "SKU" CHARACTER VARYING(255),
    "FK_BRAND_ID" INTEGER,
    "FK_CATEGORY_ID" INTEGER,
    "FK_SUB_CATEGORY_ID" INTEGER
);     
ALTER TABLE "PUBLIC"."TB_PRODUCTS" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_C" PRIMARY KEY("PRODUCT_ID");          
-- 1 +/- SELECT COUNT(*) FROM PUBLIC.TB_PRODUCTS;             
INSERT INTO "PUBLIC"."TB_PRODUCTS" VALUES
(1, TIMESTAMP WITH TIME ZONE '2024-02-18 10:37:01.629247+00', TRUE, TIMESTAMP WITH TIME ZONE '2024-02-18 10:37:01.629247+00', 1500.0, 'High-performance laptop for gaming and productivity', 'Laptop', 10, 'LT1001', 1, 1, 1);     
CREATE MEMORY TABLE "PUBLIC"."TB_SUBCATEGORIES"(
    "SUB_CATEGORY_ID" INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1 RESTART WITH 2) NOT NULL,
    "SUB_CAT_NAME" CHARACTER VARYING(255),
    "FK_CATEGORY_ID" INTEGER
);         
ALTER TABLE "PUBLIC"."TB_SUBCATEGORIES" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_A" PRIMARY KEY("SUB_CATEGORY_ID");
-- 1 +/- SELECT COUNT(*) FROM PUBLIC.TB_SUBCATEGORIES;        
INSERT INTO "PUBLIC"."TB_SUBCATEGORIES" VALUES
(1, 'Laptops', 1);            
ALTER TABLE "PUBLIC"."TB_SUBCATEGORIES" ADD CONSTRAINT "PUBLIC"."FK75H7IDL65RMU6YYQ4IGFM2CD8" FOREIGN KEY("FK_CATEGORY_ID") REFERENCES "PUBLIC"."TB_CATEGORIES"("CATEGORY_ID") NOCHECK;       
ALTER TABLE "PUBLIC"."TB_PRODUCTS" ADD CONSTRAINT "PUBLIC"."FK6NVJTMYXUK58NGSNAJHVTHGLY" FOREIGN KEY("FK_CATEGORY_ID") REFERENCES "PUBLIC"."TB_CATEGORIES"("CATEGORY_ID") NOCHECK;            
ALTER TABLE "PUBLIC"."TB_PRODUCTS" ADD CONSTRAINT "PUBLIC"."FK5FDTTI9MGGGX20VJ952D1JDHX" FOREIGN KEY("FK_BRAND_ID") REFERENCES "PUBLIC"."TB_BRANDS"("BRAND_ID") NOCHECK;      
ALTER TABLE "PUBLIC"."TB_PRODUCTS" ADD CONSTRAINT "PUBLIC"."FKMUWMDUM2FHUAKE3L1B40SU8H8" FOREIGN KEY("FK_SUB_CATEGORY_ID") REFERENCES "PUBLIC"."TB_SUBCATEGORIES"("SUB_CATEGORY_ID") NOCHECK; 
