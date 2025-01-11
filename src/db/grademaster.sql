--
-- PostgreSQL database dump
--

-- Dumped from database version 16.3
-- Dumped by pg_dump version 16.3

-- Started on 2025-01-11 11:15:10

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 221 (class 1259 OID 119886)
-- Name: grades; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.grades (
    studentid character varying(20) NOT NULL,
    subjectid integer NOT NULL,
    yearstudy character varying(20) NOT NULL,
    activity character varying(20) NOT NULL,
    periodtest character varying(30) NOT NULL,
    grade numeric(10,2)
);


ALTER TABLE public.grades OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 119838)
-- Name: rol; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.rol (
    id integer NOT NULL,
    rol_desc character varying(20) NOT NULL
);


ALTER TABLE public.rol OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 119837)
-- Name: rol_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.rol_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.rol_id_seq OWNER TO postgres;

--
-- TOC entry 4835 (class 0 OID 0)
-- Dependencies: 215
-- Name: rol_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.rol_id_seq OWNED BY public.rol.id;


--
-- TOC entry 218 (class 1259 OID 119845)
-- Name: subject; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.subject (
    id integer NOT NULL,
    namesubject character varying(30)
);


ALTER TABLE public.subject OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 119844)
-- Name: subject_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.subject_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.subject_id_seq OWNER TO postgres;

--
-- TOC entry 4836 (class 0 OID 0)
-- Dependencies: 217
-- Name: subject_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.subject_id_seq OWNED BY public.subject.id;


--
-- TOC entry 222 (class 1259 OID 119901)
-- Name: teacher_subject; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.teacher_subject (
    teacherid character varying(20) NOT NULL,
    subjectid integer NOT NULL
);


ALTER TABLE public.teacher_subject OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 119851)
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    id character varying(20) NOT NULL,
    name character varying(30),
    lastname character varying(30),
    password character varying(30),
    birthday date,
    address character varying(100),
    gender character varying(20),
    rol integer,
    status boolean
);


ALTER TABLE public.users OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 119876)
-- Name: yearlist; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.yearlist (
    studentid character varying(20) NOT NULL,
    yearstudy character varying(50),
    section character varying(20)
);


ALTER TABLE public.yearlist OWNER TO postgres;

--
-- TOC entry 4655 (class 2604 OID 119841)
-- Name: rol id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.rol ALTER COLUMN id SET DEFAULT nextval('public.rol_id_seq'::regclass);


--
-- TOC entry 4656 (class 2604 OID 119848)
-- Name: subject id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.subject ALTER COLUMN id SET DEFAULT nextval('public.subject_id_seq'::regclass);


--
-- TOC entry 4828 (class 0 OID 119886)
-- Dependencies: 221
-- Data for Name: grades; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.grades VALUES ('3', 9, 'FIRST_YEAR', 'TEST_1', 'FIRST_PERIOD', 15.00);
INSERT INTO public.grades VALUES ('3', 9, 'FIRST_YEAR', 'TEST_2', 'FIRST_PERIOD', 20.00);
INSERT INTO public.grades VALUES ('3', 9, 'FIRST_YEAR', 'TEST_3', 'FIRST_PERIOD', 12.00);
INSERT INTO public.grades VALUES ('3', 9, 'FIRST_YEAR', 'TEST_4', 'FIRST_PERIOD', 15.00);
INSERT INTO public.grades VALUES ('3', 9, 'FIRST_YEAR', 'TEST_5', 'FIRST_PERIOD', 18.00);
INSERT INTO public.grades VALUES ('1', 9, 'FIRST_YEAR', 'TEST_1', 'FIRST_PERIOD', 18.00);
INSERT INTO public.grades VALUES ('1', 9, 'FIRST_YEAR', 'TEST_2', 'FIRST_PERIOD', 17.00);
INSERT INTO public.grades VALUES ('1', 9, 'FIRST_YEAR', 'TEST_3', 'FIRST_PERIOD', 15.00);
INSERT INTO public.grades VALUES ('1', 9, 'FIRST_YEAR', 'TEST_4', 'FIRST_PERIOD', 20.00);
INSERT INTO public.grades VALUES ('1', 9, 'FIRST_YEAR', 'TEST_5', 'FIRST_PERIOD', 20.00);


--
-- TOC entry 4823 (class 0 OID 119838)
-- Dependencies: 216
-- Data for Name: rol; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.rol VALUES (1, 'PRINCIPAL');
INSERT INTO public.rol VALUES (2, 'TEACHER');
INSERT INTO public.rol VALUES (3, 'STUDENT');


--
-- TOC entry 4825 (class 0 OID 119845)
-- Dependencies: 218
-- Data for Name: subject; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.subject VALUES (9, 'MATHEMATICS');
INSERT INTO public.subject VALUES (10, 'ENGLISH');
INSERT INTO public.subject VALUES (11, 'SCIENCE');
INSERT INTO public.subject VALUES (12, 'HISTORY');
INSERT INTO public.subject VALUES (13, 'GEOGRAPHY');
INSERT INTO public.subject VALUES (14, 'PHYSICAL EDUCATION');
INSERT INTO public.subject VALUES (15, 'ART');
INSERT INTO public.subject VALUES (16, 'MUSIC');
INSERT INTO public.subject VALUES (17, 'BIOLOGY');
INSERT INTO public.subject VALUES (18, 'CHEMISTRY');
INSERT INTO public.subject VALUES (19, 'PHYSICS');
INSERT INTO public.subject VALUES (20, 'COMPUTER SCIENCE');


--
-- TOC entry 4829 (class 0 OID 119901)
-- Dependencies: 222
-- Data for Name: teacher_subject; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.teacher_subject VALUES ('118', 10);
INSERT INTO public.teacher_subject VALUES ('111', 11);
INSERT INTO public.teacher_subject VALUES ('112', 15);
INSERT INTO public.teacher_subject VALUES ('101', 14);
INSERT INTO public.teacher_subject VALUES ('116', 19);
INSERT INTO public.teacher_subject VALUES ('105', 9);


--
-- TOC entry 4826 (class 0 OID 119851)
-- Dependencies: 219
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.users VALUES ('3', 'Name_3', 'Lastname_3', 'password_3', '1990-01-04', 'Address_3', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('1', 'NAME_1', 'LASTNAME_1', 'password_1', '1990-01-02', 'ADDRESS_1', 'MALE', 3, true);
INSERT INTO public.users VALUES ('5', 'Name_5', 'Lastname_5', 'password_5', '1990-01-06', 'Address_5', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('7', 'Name_7', 'Lastname_7', 'password_7', '1990-01-08', 'Address_7', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('9', 'Name_9', 'Lastname_9', 'password_9', '1990-01-10', 'Address_9', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('11', 'Name_11', 'Lastname_11', 'password_11', '1990-01-12', 'Address_11', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('13', 'Name_13', 'Lastname_13', 'password_13', '1990-01-14', 'Address_13', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('15', 'Name_15', 'Lastname_15', 'password_15', '1990-01-16', 'Address_15', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('17', 'Name_17', 'Lastname_17', 'password_17', '1990-01-18', 'Address_17', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('19', 'Name_19', 'Lastname_19', 'password_19', '1990-01-20', 'Address_19', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('21', 'Name_21', 'Lastname_21', 'password_21', '1990-01-22', 'Address_21', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('23', 'Name_23', 'Lastname_23', 'password_23', '1990-01-24', 'Address_23', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('2', 'Name_2', 'Lastname_2', 'password_2', '1990-01-03', 'Address_2', 'MALE', 3, true);
INSERT INTO public.users VALUES ('4', 'Name_4', 'Lastname_4', 'password_4', '1990-01-05', 'Address_4', 'MALE', 3, true);
INSERT INTO public.users VALUES ('6', 'Name_6', 'Lastname_6', 'password_6', '1990-01-07', 'Address_6', 'MALE', 3, true);
INSERT INTO public.users VALUES ('8', 'Name_8', 'Lastname_8', 'password_8', '1990-01-09', 'Address_8', 'MALE', 3, true);
INSERT INTO public.users VALUES ('10', 'Name_10', 'Lastname_10', 'password_10', '1990-01-11', 'Address_10', 'MALE', 3, true);
INSERT INTO public.users VALUES ('12', 'Name_12', 'Lastname_12', 'password_12', '1990-01-13', 'Address_12', 'MALE', 3, true);
INSERT INTO public.users VALUES ('14', 'Name_14', 'Lastname_14', 'password_14', '1990-01-15', 'Address_14', 'MALE', 3, true);
INSERT INTO public.users VALUES ('16', 'Name_16', 'Lastname_16', 'password_16', '1990-01-17', 'Address_16', 'MALE', 3, true);
INSERT INTO public.users VALUES ('18', 'Name_18', 'Lastname_18', 'password_18', '1990-01-19', 'Address_18', 'MALE', 3, true);
INSERT INTO public.users VALUES ('20', 'Name_20', 'Lastname_20', 'password_20', '1990-01-21', 'Address_20', 'MALE', 3, true);
INSERT INTO public.users VALUES ('22', 'Name_22', 'Lastname_22', 'password_22', '1990-01-23', 'Address_22', 'MALE', 3, true);
INSERT INTO public.users VALUES ('24', 'Name_24', 'Lastname_24', 'password_24', '1990-01-25', 'Address_24', 'MALE', 3, true);
INSERT INTO public.users VALUES ('26', 'Name_26', 'Lastname_26', 'password_26', '1990-01-27', 'Address_26', 'MALE', 3, true);
INSERT INTO public.users VALUES ('28', 'Name_28', 'Lastname_28', 'password_28', '1990-01-29', 'Address_28', 'MALE', 3, true);
INSERT INTO public.users VALUES ('30', 'Name_30', 'Lastname_30', 'password_30', '1990-01-31', 'Address_30', 'MALE', 3, true);
INSERT INTO public.users VALUES ('32', 'Name_32', 'Lastname_32', 'password_32', '1990-02-02', 'Address_32', 'MALE', 3, true);
INSERT INTO public.users VALUES ('34', 'Name_34', 'Lastname_34', 'password_34', '1990-02-04', 'Address_34', 'MALE', 3, true);
INSERT INTO public.users VALUES ('36', 'Name_36', 'Lastname_36', 'password_36', '1990-02-06', 'Address_36', 'MALE', 3, true);
INSERT INTO public.users VALUES ('38', 'Name_38', 'Lastname_38', 'password_38', '1990-02-08', 'Address_38', 'MALE', 3, true);
INSERT INTO public.users VALUES ('40', 'Name_40', 'Lastname_40', 'password_40', '1990-02-10', 'Address_40', 'MALE', 3, true);
INSERT INTO public.users VALUES ('42', 'Name_42', 'Lastname_42', 'password_42', '1990-02-12', 'Address_42', 'MALE', 3, true);
INSERT INTO public.users VALUES ('44', 'Name_44', 'Lastname_44', 'password_44', '1990-02-14', 'Address_44', 'MALE', 3, true);
INSERT INTO public.users VALUES ('25', 'Name_25', 'Lastname_25', 'password_25', '1990-01-26', 'Address_25', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('27', 'Name_27', 'Lastname_27', 'password_27', '1990-01-28', 'Address_27', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('29', 'Name_29', 'Lastname_29', 'password_29', '1990-01-30', 'Address_29', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('31', 'Name_31', 'Lastname_31', 'password_31', '1990-02-01', 'Address_31', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('33', 'Name_33', 'Lastname_33', 'password_33', '1990-02-03', 'Address_33', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('35', 'Name_35', 'Lastname_35', 'password_35', '1990-02-05', 'Address_35', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('37', 'Name_37', 'Lastname_37', 'password_37', '1990-02-07', 'Address_37', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('39', 'Name_39', 'Lastname_39', 'password_39', '1990-02-09', 'Address_39', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('46', 'Name_46', 'Lastname_46', 'password_46', '1990-02-16', 'Address_46', 'MALE', 3, true);
INSERT INTO public.users VALUES ('48', 'Name_48', 'Lastname_48', 'password_48', '1990-02-18', 'Address_48', 'MALE', 3, true);
INSERT INTO public.users VALUES ('50', 'Name_50', 'Lastname_50', 'password_50', '1990-02-20', 'Address_50', 'MALE', 3, true);
INSERT INTO public.users VALUES ('52', 'Name_52', 'Lastname_52', 'password_52', '1990-02-22', 'Address_52', 'MALE', 3, true);
INSERT INTO public.users VALUES ('54', 'Name_54', 'Lastname_54', 'password_54', '1990-02-24', 'Address_54', 'MALE', 3, true);
INSERT INTO public.users VALUES ('56', 'Name_56', 'Lastname_56', 'password_56', '1990-02-26', 'Address_56', 'MALE', 3, true);
INSERT INTO public.users VALUES ('58', 'Name_58', 'Lastname_58', 'password_58', '1990-02-28', 'Address_58', 'MALE', 3, true);
INSERT INTO public.users VALUES ('60', 'Name_60', 'Lastname_60', 'password_60', '1990-03-02', 'Address_60', 'MALE', 3, true);
INSERT INTO public.users VALUES ('62', 'Name_62', 'Lastname_62', 'password_62', '1990-03-04', 'Address_62', 'MALE', 3, true);
INSERT INTO public.users VALUES ('64', 'Name_64', 'Lastname_64', 'password_64', '1990-03-06', 'Address_64', 'MALE', 3, true);
INSERT INTO public.users VALUES ('66', 'Name_66', 'Lastname_66', 'password_66', '1990-03-08', 'Address_66', 'MALE', 3, true);
INSERT INTO public.users VALUES ('68', 'Name_68', 'Lastname_68', 'password_68', '1990-03-10', 'Address_68', 'MALE', 3, true);
INSERT INTO public.users VALUES ('70', 'Name_70', 'Lastname_70', 'password_70', '1990-03-12', 'Address_70', 'MALE', 3, true);
INSERT INTO public.users VALUES ('72', 'Name_72', 'Lastname_72', 'password_72', '1990-03-14', 'Address_72', 'MALE', 3, true);
INSERT INTO public.users VALUES ('74', 'Name_74', 'Lastname_74', 'password_74', '1990-03-16', 'Address_74', 'MALE', 3, true);
INSERT INTO public.users VALUES ('76', 'Name_76', 'Lastname_76', 'password_76', '1990-03-18', 'Address_76', 'MALE', 3, true);
INSERT INTO public.users VALUES ('78', 'Name_78', 'Lastname_78', 'password_78', '1990-03-20', 'Address_78', 'MALE', 3, true);
INSERT INTO public.users VALUES ('80', 'Name_80', 'Lastname_80', 'password_80', '1990-03-22', 'Address_80', 'MALE', 3, true);
INSERT INTO public.users VALUES ('82', 'Name_82', 'Lastname_82', 'password_82', '1990-03-24', 'Address_82', 'MALE', 3, true);
INSERT INTO public.users VALUES ('84', 'Name_84', 'Lastname_84', 'password_84', '1990-03-26', 'Address_84', 'MALE', 3, true);
INSERT INTO public.users VALUES ('86', 'Name_86', 'Lastname_86', 'password_86', '1990-03-28', 'Address_86', 'MALE', 3, true);
INSERT INTO public.users VALUES ('88', 'Name_88', 'Lastname_88', 'password_88', '1990-03-30', 'Address_88', 'MALE', 3, true);
INSERT INTO public.users VALUES ('90', 'Name_90', 'Lastname_90', 'password_90', '1990-04-01', 'Address_90', 'MALE', 3, true);
INSERT INTO public.users VALUES ('92', 'Name_92', 'Lastname_92', 'password_92', '1990-04-03', 'Address_92', 'MALE', 3, true);
INSERT INTO public.users VALUES ('94', 'Name_94', 'Lastname_94', 'password_94', '1990-04-05', 'Address_94', 'MALE', 3, true);
INSERT INTO public.users VALUES ('96', 'Name_96', 'Lastname_96', 'password_96', '1990-04-07', 'Address_96', 'MALE', 3, true);
INSERT INTO public.users VALUES ('98', 'Name_98', 'Lastname_98', 'password_98', '1990-04-09', 'Address_98', 'MALE', 3, true);
INSERT INTO public.users VALUES ('100', 'Name_100', 'Lastname_100', 'password_100', '1990-04-11', 'Address_100', 'MALE', 3, true);
INSERT INTO public.users VALUES ('105', 'Edward', 'Jones', 'edward_#safe', '1997-09-17', '654 Cedar Circle', 'MALE', 2, true);
INSERT INTO public.users VALUES ('107', 'George', 'Martinez', 'george!secure', '1990-02-25', '432 Spruce Road', 'MALE', 2, true);
INSERT INTO public.users VALUES ('109', 'Ian', 'Rodriguez', 'ian#safe2023', '1985-12-14', '210 Sequoia Street', 'MALE', 2, true);
INSERT INTO public.users VALUES ('111', 'Kevin', 'Lopez', 'kevin$rock', '1994-05-30', '567 Chestnut Lane', 'MALE', 2, true);
INSERT INTO public.users VALUES ('113', 'Michael', 'Lewis', 'michael_#23', '1989-06-09', '890 Dogwood Path', 'MALE', 2, true);
INSERT INTO public.users VALUES ('115', 'Oscar', 'Hall', 'oscar#lock', '1987-09-05', '234 Poplar Point', 'MALE', 2, true);
INSERT INTO public.users VALUES ('117', 'Quinn', 'Young', 'quinn$secure', '1991-11-15', '876 Beech Boulevard', 'MALE', 2, true);
INSERT INTO public.users VALUES ('102', 'BOB', 'JOHNSON', 'securePass!45', '1988-03-22', '456 OAK AVENUE', 'MALE', 2, true);
INSERT INTO public.users VALUES ('103', 'CHARLIE', 'WILLIAMS', 'charlie$2023', '1992-11-08', '789 PINE LANE', 'MALE', 2, true);
INSERT INTO public.users VALUES ('101', 'Alice', 'Smith', 'password123', '1995-06-15', '123 Elm Street', 'FEMALE', 2, true);
INSERT INTO public.users VALUES ('104', 'Diana', 'Brown', 'diana@pass1', '2000-01-05', '321 Birch Boulevard', 'FEMALE', 2, true);
INSERT INTO public.users VALUES ('106', 'Fiona', 'Garcia', 'fionaPass!', '1993-04-12', '987 Maple Court', 'FEMALE', 2, true);
INSERT INTO public.users VALUES ('108', 'Hannah', 'Davis', 'hannah@pwd', '1998-08-19', '765 Redwood Drive', 'FEMALE', 2, true);
INSERT INTO public.users VALUES ('110', 'Julia', 'Hernandez', 'julia*123', '1999-07-23', '345 Aspen Trail', 'FEMALE', 2, true);
INSERT INTO public.users VALUES ('112', 'Laura', 'Clark', 'laura%secure', '2001-10-18', '678 Cypress Way', 'FEMALE', 2, true);
INSERT INTO public.users VALUES ('114', 'Nina', 'Walker', 'nina!pass', '1996-03-11', '901 Willow Bend', 'FEMALE', 2, true);
INSERT INTO public.users VALUES ('116', 'Paula', 'Allen', 'paula@safe', '2002-02-28', '543 Alder Avenue', 'FEMALE', 2, true);
INSERT INTO public.users VALUES ('118', 'Rachel', 'King', 'rachel123!', '1995-12-01', '129 Fir Street', 'FEMALE', 2, true);
INSERT INTO public.users VALUES ('120', 'Tina', 'Scott', 'tina#pass!', '1993-10-08', '345 Olive Lane', 'FEMALE', 2, true);
INSERT INTO public.users VALUES ('45', 'Name_45', 'Lastname_45', 'password_45', '1990-02-15', 'Address_45', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('47', 'Name_47', 'Lastname_47', 'password_47', '1990-02-17', 'Address_47', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('49', 'Name_49', 'Lastname_49', 'password_49', '1990-02-19', 'Address_49', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('51', 'Name_51', 'Lastname_51', 'password_51', '1990-02-21', 'Address_51', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('53', 'Name_53', 'Lastname_53', 'password_53', '1990-02-23', 'Address_53', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('55', 'Name_55', 'Lastname_55', 'password_55', '1990-02-25', 'Address_55', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('57', 'Name_57', 'Lastname_57', 'password_57', '1990-02-27', 'Address_57', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('59', 'Name_59', 'Lastname_59', 'password_59', '1990-03-01', 'Address_59', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('61', 'Name_61', 'Lastname_61', 'password_61', '1990-03-03', 'Address_61', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('63', 'Name_63', 'Lastname_63', 'password_63', '1990-03-05', 'Address_63', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('119', 'Sam', 'Wright', 'sam@2023', '1986-07-27', '890 Magnolia Drive', 'MALE', 2, true);
INSERT INTO public.users VALUES ('41', 'Name_41', 'Lastname_41', 'password_41', '1990-02-11', 'Address_41', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('43', 'Name_43', 'Lastname_43', 'password_43', '1990-02-13', 'Address_43', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('65', 'Name_65', 'Lastname_65', 'password_65', '1990-03-07', 'Address_65', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('67', 'Name_67', 'Lastname_67', 'password_67', '1990-03-09', 'Address_67', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('69', 'Name_69', 'Lastname_69', 'password_69', '1990-03-11', 'Address_69', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('71', 'Name_71', 'Lastname_71', 'password_71', '1990-03-13', 'Address_71', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('73', 'Name_73', 'Lastname_73', 'password_73', '1990-03-15', 'Address_73', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('75', 'Name_75', 'Lastname_75', 'password_75', '1990-03-17', 'Address_75', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('77', 'Name_77', 'Lastname_77', 'password_77', '1990-03-19', 'Address_77', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('79', 'Name_79', 'Lastname_79', 'password_79', '1990-03-21', 'Address_79', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('81', 'Name_81', 'Lastname_81', 'password_81', '1990-03-23', 'Address_81', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('83', 'Name_83', 'Lastname_83', 'password_83', '1990-03-25', 'Address_83', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('85', 'Name_85', 'Lastname_85', 'password_85', '1990-03-27', 'Address_85', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('87', 'Name_87', 'Lastname_87', 'password_87', '1990-03-29', 'Address_87', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('89', 'Name_89', 'Lastname_89', 'password_89', '1990-03-31', 'Address_89', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('91', 'Name_91', 'Lastname_91', 'password_91', '1990-04-02', 'Address_91', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('93', 'Name_93', 'Lastname_93', 'password_93', '1990-04-04', 'Address_93', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('95', 'Name_95', 'Lastname_95', 'password_95', '1990-04-06', 'Address_95', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('97', 'Name_97', 'Lastname_97', 'password_97', '1990-04-08', 'Address_97', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('99', 'Name_99', 'Lastname_99', 'password_99', '1990-04-10', 'Address_99', 'FEMALE', 3, true);
INSERT INTO public.users VALUES ('0', 'Admin', 'User', 'admin_secure@2023', '1980-01-01', '1 Main Street, City Center', 'M', 1, true);


--
-- TOC entry 4827 (class 0 OID 119876)
-- Dependencies: 220
-- Data for Name: yearlist; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.yearlist VALUES ('11', 'FIRST_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('13', 'FIRST_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('15', 'FIRST_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('17', 'FIRST_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('19', 'FIRST_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('21', 'FIRST_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('23', 'FIRST_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('2', 'FIRST_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('4', 'FIRST_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('6', 'FIRST_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('8', 'FIRST_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('10', 'FIRST_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('12', 'FIRST_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('14', 'FIRST_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('16', 'FIRST_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('18', 'SECOND_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('20', 'SECOND_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('22', 'SECOND_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('24', 'SECOND_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('26', 'SECOND_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('28', 'SECOND_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('30', 'SECOND_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('32', 'SECOND_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('34', 'SECOND_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('36', 'SECOND_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('38', 'SECOND_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('25', 'SECOND_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('40', 'SECOND_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('44', 'SECOND_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('42', 'SECOND_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('35', 'SECOND_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('33', 'SECOND_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('29', 'SECOND_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('27', 'SECOND_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('31', 'SECOND_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('37', 'THIRD_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('76', 'THIRD_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('84', 'THIRD_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('80', 'THIRD_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('92', 'THIRD_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('70', 'THIRD_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('86', 'THIRD_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('96', 'THIRD_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('47', 'THIRD_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('90', 'THIRD_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('82', 'THIRD_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('100', 'THIRD_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('53', 'THIRD_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('49', 'THIRD_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('51', 'THIRD_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('98', 'THIRD_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('57', 'THIRD_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('94', 'THIRD_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('61', 'THIRD_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('41', 'THIRD_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('88', 'FOURTH_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('63', 'FOURTH_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('69', 'FOURTH_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('73', 'FOURTH_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('43', 'FOURTH_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('67', 'FOURTH_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('71', 'FOURTH_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('77', 'FOURTH_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('59', 'FOURTH_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('75', 'FOURTH_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('65', 'FOURTH_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('81', 'FOURTH_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('79', 'FOURTH_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('87', 'FOURTH_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('95', 'FOURTH_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('89', 'FOURTH_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('83', 'FOURTH_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('55', 'FOURTH_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('48', 'FOURTH_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('66', 'FOURTH_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('39', 'FIFTH_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('78', 'FIFTH_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('93', 'FIFTH_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('72', 'FIFTH_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('68', 'FIFTH_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('64', 'FIFTH_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('91', 'FIFTH_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('45', 'FIFTH_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('74', 'FIFTH_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('85', 'FIFTH_YEAR', 'SECTION_B');
INSERT INTO public.yearlist VALUES ('46', 'FIFTH_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('52', 'FIFTH_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('50', 'FIFTH_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('97', 'FIFTH_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('62', 'FIFTH_YEAR', 'SECTION_C');
INSERT INTO public.yearlist VALUES ('54', 'FIFTH_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('56', 'FIFTH_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('99', 'FIFTH_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('58', 'FIFTH_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('60', 'FIFTH_YEAR', 'SECTION_D');
INSERT INTO public.yearlist VALUES ('9', 'FIRST_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('5', 'FIRST_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('1', 'FIRST_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('3', 'FIRST_YEAR', 'SECTION_A');
INSERT INTO public.yearlist VALUES ('7', 'FIRST_YEAR', 'SECTION_A');


--
-- TOC entry 4837 (class 0 OID 0)
-- Dependencies: 215
-- Name: rol_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.rol_id_seq', 1, false);


--
-- TOC entry 4838 (class 0 OID 0)
-- Dependencies: 217
-- Name: subject_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.subject_id_seq', 20, true);


--
-- TOC entry 4670 (class 2606 OID 119919)
-- Name: grades grades_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.grades
    ADD CONSTRAINT grades_pkey PRIMARY KEY (studentid, subjectid, yearstudy, activity, periodtest);


--
-- TOC entry 4658 (class 2606 OID 119843)
-- Name: rol rol_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.rol
    ADD CONSTRAINT rol_pkey PRIMARY KEY (id);


--
-- TOC entry 4660 (class 2606 OID 119850)
-- Name: subject subject_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.subject
    ADD CONSTRAINT subject_pkey PRIMARY KEY (id);


--
-- TOC entry 4672 (class 2606 OID 128135)
-- Name: teacher_subject teacher_subject_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.teacher_subject
    ADD CONSTRAINT teacher_subject_pkey PRIMARY KEY (teacherid);


--
-- TOC entry 4662 (class 2606 OID 128133)
-- Name: subject unq_namesub; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.subject
    ADD CONSTRAINT unq_namesub UNIQUE (namesubject);


--
-- TOC entry 4664 (class 2606 OID 119917)
-- Name: subject uq_nm; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.subject
    ADD CONSTRAINT uq_nm UNIQUE (namesubject);


--
-- TOC entry 4666 (class 2606 OID 119855)
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- TOC entry 4668 (class 2606 OID 119880)
-- Name: yearlist yearlist_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.yearlist
    ADD CONSTRAINT yearlist_pkey PRIMARY KEY (studentid);


--
-- TOC entry 4675 (class 2606 OID 119891)
-- Name: grades fk_gradestudentid; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.grades
    ADD CONSTRAINT fk_gradestudentid FOREIGN KEY (studentid) REFERENCES public.users(id);


--
-- TOC entry 4677 (class 2606 OID 119906)
-- Name: teacher_subject fk_idteachersubject; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.teacher_subject
    ADD CONSTRAINT fk_idteachersubject FOREIGN KEY (teacherid) REFERENCES public.users(id);


--
-- TOC entry 4673 (class 2606 OID 119856)
-- Name: users fk_rol; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT fk_rol FOREIGN KEY (rol) REFERENCES public.rol(id);


--
-- TOC entry 4676 (class 2606 OID 119896)
-- Name: grades fk_subjectid; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.grades
    ADD CONSTRAINT fk_subjectid FOREIGN KEY (subjectid) REFERENCES public.subject(id);


--
-- TOC entry 4678 (class 2606 OID 119911)
-- Name: teacher_subject fk_teachersubject; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.teacher_subject
    ADD CONSTRAINT fk_teachersubject FOREIGN KEY (subjectid) REFERENCES public.subject(id);


--
-- TOC entry 4674 (class 2606 OID 119928)
-- Name: yearlist fk_yearlist; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.yearlist
    ADD CONSTRAINT fk_yearlist FOREIGN KEY (studentid) REFERENCES public.users(id) ON UPDATE CASCADE ON DELETE CASCADE;


-- Completed on 2025-01-11 11:15:10

--
-- PostgreSQL database dump complete
--

