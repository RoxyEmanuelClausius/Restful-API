/*
 Navicat Premium Data Transfer

 Source Server         : postgresql
 Source Server Type    : PostgreSQL
 Source Server Version : 160001 (160001)
 Source Host           : localhost:5432
 Source Catalog        : employedb
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 160001 (160001)
 File Encoding         : 65001

 Date: 05/02/2024 16:11:26
*/


-- ----------------------------
-- Sequence structure for mt_employe_emp_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."mt_employe_emp_id_seq";
CREATE SEQUENCE "public"."mt_employe_emp_id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

-- ----------------------------
-- Table structure for mt_employe
-- ----------------------------
DROP TABLE IF EXISTS "public"."mt_employe";
CREATE TABLE "public"."mt_employe" (
  "emp_id" int8 NOT NULL DEFAULT nextval('mt_employe_emp_id_seq'::regclass),
  "address" varchar(255) COLLATE "pg_catalog"."default",
  "date_of_birth" timestamp(6),
  "gender" varchar(255) COLLATE "pg_catalog"."default",
  "name" varchar(255) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of mt_employe
-- ----------------------------
INSERT INTO "public"."mt_employe" VALUES (2, 'bogor', '2001-04-16 07:00:00', 'Gey', 'Mincoy');
INSERT INTO "public"."mt_employe" VALUES (3, 'bekasi ato jogja', '2000-03-26 07:00:00', 'They', 'Roxy Emanuel');
INSERT INTO "public"."mt_employe" VALUES (1, 'bekasi ato jogja', '2000-03-26 07:00:00', 'Binary', 'Roxy Emanuel');
INSERT INTO "public"."mt_employe" VALUES (4, 'JKT', '2000-07-22 07:00:00', 'Binary', 'Aldo');

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."mt_employe_emp_id_seq"
OWNED BY "public"."mt_employe"."emp_id";
SELECT setval('"public"."mt_employe_emp_id_seq"', 4, true);

-- ----------------------------
-- Primary Key structure for table mt_employe
-- ----------------------------
ALTER TABLE "public"."mt_employe" ADD CONSTRAINT "mt_employe_pkey" PRIMARY KEY ("emp_id");
