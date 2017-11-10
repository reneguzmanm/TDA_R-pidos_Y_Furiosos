-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 10-11-2017 a las 01:18:49
-- Versión del servidor: 5.7.19
-- Versión de PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `rapido_y_furiosodb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `automovil`
--

DROP TABLE IF EXISTS `automovil`;
CREATE TABLE IF NOT EXISTS `automovil` (
  `PATENTE_VEHICULO` varchar(10) NOT NULL,
  `RUT_CLIENTE` varchar(20) DEFAULT NULL,
  `ID_MODELO` int(11) DEFAULT NULL,
  `ID_COLOR_VEHICULO` bigint(20) NOT NULL,
  `NUM_MOTOR` varchar(20) DEFAULT NULL,
  `KILOMETRAJE` int(11) DEFAULT NULL,
  `ANO` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`PATENTE_VEHICULO`),
  KEY `FK_ESTA_PINTADO` (`ID_COLOR_VEHICULO`),
  KEY `FK_ES_DUENO` (`RUT_CLIENTE`),
  KEY `FK_PERTENECE` (`ID_MODELO`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `RUT_CLIENTE` varchar(20) NOT NULL,
  `ID_COMUNA` int(11) NOT NULL,
  `NOMBRE_CLIENTE` varchar(20) DEFAULT NULL,
  `APELLIDOP_CLIENTE` varchar(30) DEFAULT NULL,
  `APELLIDOM_CLIENTE` varchar(30) DEFAULT NULL,
  `DIRECCION_CLIENTE` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`RUT_CLIENTE`),
  KEY `FK_VIVE` (`ID_COMUNA`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `color`
--

DROP TABLE IF EXISTS `color`;
CREATE TABLE IF NOT EXISTS `color` (
  `ID_COLOR_VEHICULO` bigint(20) NOT NULL,
  `COLOR` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID_COLOR_VEHICULO`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comuna`
--

DROP TABLE IF EXISTS `comuna`;
CREATE TABLE IF NOT EXISTS `comuna` (
  `ID_COMUNA` int(11) NOT NULL AUTO_INCREMENT,
  `ID_PROVINCIA` int(11) NOT NULL,
  `NOMBRE_COMUNA` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_COMUNA`),
  KEY `FK_ESTA_UBICADA` (`ID_PROVINCIA`)
) ENGINE=MyISAM AUTO_INCREMENT=346 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `comuna`
--

INSERT INTO `comuna` (`ID_COMUNA`, `ID_PROVINCIA`, `NOMBRE_COMUNA`) VALUES
(1, 1, 'Arica'),
(2, 1, 'Camarones'),
(3, 2, 'General Lagos'),
(4, 2, 'Putre'),
(5, 3, 'Alto Hospicio'),
(6, 3, 'Iquique'),
(7, 4, 'Camiña'),
(8, 4, 'Colchane'),
(9, 4, 'Huara'),
(10, 4, 'Pica'),
(11, 4, 'Pozo Almonte'),
(12, 5, 'Antofagasta'),
(13, 5, 'Mejillones'),
(14, 5, 'Sierra Gorda'),
(15, 5, 'Taltal'),
(16, 6, 'Calama'),
(17, 6, 'Ollague'),
(18, 6, 'San Pedro de Atacama'),
(19, 7, 'María Elena'),
(20, 7, 'Tocopilla'),
(21, 8, 'Chañaral'),
(22, 8, 'Diego de Almagro'),
(23, 9, 'Caldera'),
(24, 9, 'Copiapó'),
(25, 9, 'Tierra Amarilla'),
(26, 10, 'Alto del Carmen'),
(27, 10, 'Freirina'),
(28, 10, 'Huasco'),
(29, 10, 'Vallenar'),
(30, 11, 'Canela'),
(31, 11, 'Illapel'),
(32, 11, 'Los Vilos'),
(33, 11, 'Salamanca'),
(34, 12, 'Andacollo'),
(35, 12, 'Coquimbo'),
(36, 12, 'La Higuera'),
(37, 12, 'La Serena'),
(38, 12, 'Paihuaco'),
(39, 12, 'Vicuña'),
(40, 13, 'Combarbalá'),
(41, 13, 'Monte Patria'),
(42, 13, 'Ovalle'),
(43, 13, 'Punitaqui'),
(44, 13, 'Río Hurtado'),
(45, 14, 'Isla de Pascua'),
(46, 15, 'Calle Larga'),
(47, 15, 'Los Andes'),
(48, 15, 'Rinconada'),
(49, 15, 'San Esteban'),
(50, 16, 'La Ligua'),
(51, 16, 'Papudo'),
(52, 16, 'Petorca'),
(53, 16, 'Zapallar'),
(54, 17, 'Hijuelas'),
(55, 17, 'La Calera'),
(56, 17, 'La Cruz'),
(57, 17, 'Limache'),
(58, 17, 'Nogales'),
(59, 17, 'Olmué'),
(60, 17, 'Quillota'),
(61, 18, 'Algarrobo'),
(62, 18, 'Cartagena'),
(63, 18, 'El Quisco'),
(64, 18, 'El Tabo'),
(65, 18, 'San Antonio'),
(66, 18, 'Santo Domingo'),
(67, 19, 'Catemu'),
(68, 19, 'Llaillay'),
(69, 19, 'Panquehue'),
(70, 19, 'Putaendo'),
(71, 19, 'San Felipe'),
(72, 19, 'Santa María'),
(73, 20, 'Casablanca'),
(74, 20, 'Concón'),
(75, 20, 'Juan Fernández'),
(76, 20, 'Puchuncaví'),
(77, 20, 'Quilpué'),
(78, 20, 'Quintero'),
(79, 20, 'Valparaíso'),
(80, 20, 'Villa Alemana'),
(81, 20, 'Viña del Mar'),
(82, 21, 'Colina'),
(83, 21, 'Lampa'),
(84, 21, 'Tiltil'),
(85, 22, 'Pirque'),
(86, 22, 'Puente Alto'),
(87, 22, 'San José de Maipo'),
(88, 23, 'Buin'),
(89, 23, 'Calera de Tango'),
(90, 23, 'Paine'),
(91, 23, 'San Bernardo'),
(92, 24, 'Alhué'),
(93, 24, 'Curacaví'),
(94, 24, 'María Pinto'),
(95, 24, 'Melipilla'),
(96, 24, 'San Pedro'),
(97, 25, 'Cerrillos'),
(98, 25, 'Cerro Navia'),
(99, 25, 'Conchalí'),
(100, 25, 'El Bosque'),
(101, 25, 'Estación Central'),
(102, 25, 'Huechuraba'),
(103, 25, 'Independencia'),
(104, 25, 'La Cisterna'),
(105, 25, 'La Granja'),
(106, 25, 'La Florida'),
(107, 25, 'La Pintana'),
(108, 25, 'La Reina'),
(109, 25, 'Las Condes'),
(110, 25, 'Lo Barnechea'),
(111, 25, 'Lo Espejo'),
(112, 25, 'Lo Prado'),
(113, 25, 'Macul'),
(114, 25, 'Maipú'),
(115, 25, 'Ñuñoa'),
(116, 25, 'Pedro Aguirre Cerda'),
(117, 25, 'Peñalolén'),
(118, 25, 'Providencia'),
(119, 25, 'Pudahuel'),
(120, 25, 'Quilicura'),
(121, 25, 'Quinta Normal'),
(122, 25, 'Recoleta'),
(123, 25, 'Renca'),
(124, 25, 'San Miguel'),
(125, 25, 'San Joaquín'),
(126, 25, 'San Ramón'),
(127, 25, 'Santiago'),
(128, 25, 'Vitacura'),
(129, 26, 'El Monte'),
(130, 26, 'Isla de Maipo'),
(131, 26, 'Padre Hurtado'),
(132, 26, 'Peñaflor'),
(133, 26, 'Talagante'),
(134, 27, 'Codegua'),
(135, 27, 'Coínco'),
(136, 27, 'Coltauco'),
(137, 27, 'Doñihue'),
(138, 27, 'Graneros'),
(139, 27, 'Las Cabras'),
(140, 27, 'Machalí'),
(141, 27, 'Malloa'),
(142, 27, 'Mostazal'),
(143, 27, 'Olivar'),
(144, 27, 'Peumo'),
(145, 27, 'Pichidegua'),
(146, 27, 'Quinta de Tilcoco'),
(147, 27, 'Rancagua'),
(148, 27, 'Rengo'),
(149, 27, 'Requínoa'),
(150, 27, 'San Vicente de Tagua Tagua'),
(151, 28, 'La Estrella'),
(152, 28, 'Litueche'),
(153, 28, 'Marchihue'),
(154, 28, 'Navidad'),
(155, 28, 'Peredones'),
(156, 28, 'Pichilemu'),
(157, 29, 'Chépica'),
(158, 29, 'Chimbarongo'),
(159, 29, 'Lolol'),
(160, 29, 'Nancagua'),
(161, 29, 'Palmilla'),
(162, 29, 'Peralillo'),
(163, 29, 'Placilla'),
(164, 29, 'Pumanque'),
(165, 29, 'San Fernando'),
(166, 29, 'Santa Cruz'),
(167, 30, 'Cauquenes'),
(168, 30, 'Chanco'),
(169, 30, 'Pelluhue'),
(170, 31, 'Curicó'),
(171, 31, 'Hualañé'),
(172, 31, 'Licantén'),
(173, 31, 'Molina'),
(174, 31, 'Rauco'),
(175, 31, 'Romeral'),
(176, 31, 'Sagrada Familia'),
(177, 31, 'Teno'),
(178, 31, 'Vichuquén'),
(179, 32, 'Colbún'),
(180, 32, 'Linares'),
(181, 32, 'Longaví'),
(182, 32, 'Parral'),
(183, 32, 'Retiro'),
(184, 32, 'San Javier'),
(185, 32, 'Villa Alegre'),
(186, 32, 'Yerbas Buenas'),
(187, 33, 'Constitución'),
(188, 33, 'Curepto'),
(189, 33, 'Empedrado'),
(190, 33, 'Maule'),
(191, 33, 'Pelarco'),
(192, 33, 'Pencahue'),
(193, 33, 'Río Claro'),
(194, 33, 'San Clemente'),
(195, 33, 'San Rafael'),
(196, 33, 'Talca'),
(197, 34, 'Arauco'),
(198, 34, 'Cañete'),
(199, 34, 'Contulmo'),
(200, 34, 'Curanilahue'),
(201, 34, 'Lebu'),
(202, 34, 'Los Álamos'),
(203, 34, 'Tirúa'),
(204, 35, 'Alto Biobío'),
(205, 35, 'Antuco'),
(206, 35, 'Cabrero'),
(207, 35, 'Laja'),
(208, 35, 'Los Ángeles'),
(209, 35, 'Mulchén'),
(210, 35, 'Nacimiento'),
(211, 35, 'Negrete'),
(212, 35, 'Quilaco'),
(213, 35, 'Quilleco'),
(214, 35, 'San Rosendo'),
(215, 35, 'Santa Bárbara'),
(216, 35, 'Tucapel'),
(217, 35, 'Yumbel'),
(218, 36, 'Chiguayante'),
(219, 36, 'Concepción'),
(220, 36, 'Coronel'),
(221, 36, 'Florida'),
(222, 36, 'Hualpén'),
(223, 36, 'Hualqui'),
(224, 36, 'Lota'),
(225, 36, 'Penco'),
(226, 36, 'San Pedro de La Paz'),
(227, 36, 'Santa Juana'),
(228, 36, 'Talcahuano'),
(229, 36, 'Tomé'),
(230, 37, 'Bulnes'),
(231, 37, 'Chillán'),
(232, 37, 'Chillán Viejo'),
(233, 37, 'Cobquecura'),
(234, 37, 'Coelemu'),
(235, 37, 'Coihueco'),
(236, 37, 'El Carmen'),
(237, 37, 'Ninhue'),
(238, 37, 'Ñiquen'),
(239, 37, 'Pemuco'),
(240, 37, 'Pinto'),
(241, 37, 'Portezuelo'),
(242, 37, 'Quillón'),
(243, 37, 'Quirihue'),
(244, 37, 'Ránquil'),
(245, 37, 'San Carlos'),
(246, 37, 'San Fabián'),
(247, 37, 'San Ignacio'),
(248, 37, 'San Nicolás'),
(249, 37, 'Treguaco'),
(250, 37, 'Yungay'),
(251, 38, 'Carahue'),
(252, 38, 'Cholchol'),
(253, 38, 'Cunco'),
(254, 38, 'Curarrehue'),
(255, 38, 'Freire'),
(256, 38, 'Galvarino'),
(257, 38, 'Gorbea'),
(258, 38, 'Lautaro'),
(259, 38, 'Loncoche'),
(260, 38, 'Melipeuco'),
(261, 38, 'Nueva Imperial'),
(262, 38, 'Padre Las Casas'),
(263, 38, 'Perquenco'),
(264, 38, 'Pitrufquén'),
(265, 38, 'Pucón'),
(266, 38, 'Saavedra'),
(267, 38, 'Temuco'),
(268, 38, 'Teodoro Schmidt'),
(269, 38, 'Toltén'),
(270, 38, 'Vilcún'),
(271, 38, 'Villarrica'),
(272, 39, 'Angol'),
(273, 39, 'Collipulli'),
(274, 39, 'Curacautín'),
(275, 39, 'Ercilla'),
(276, 39, 'Lonquimay'),
(277, 39, 'Los Sauces'),
(278, 39, 'Lumaco'),
(279, 39, 'Purén'),
(280, 39, 'Renaico'),
(281, 39, 'Traiguén'),
(282, 39, 'Victoria'),
(283, 40, 'Corral'),
(284, 40, 'Lanco'),
(285, 40, 'Los Lagos'),
(286, 40, 'Máfil'),
(287, 40, 'Mariquina'),
(288, 40, 'Paillaco'),
(289, 40, 'Panguipulli'),
(290, 40, 'Valdivia'),
(291, 41, 'Futrono'),
(292, 41, 'La Unión'),
(293, 41, 'Lago Ranco'),
(294, 41, 'Río Bueno'),
(295, 42, 'Ancud'),
(296, 42, 'Castro'),
(297, 42, 'Chonchi'),
(298, 42, 'Curaco de Vélez'),
(299, 42, 'Dalcahue'),
(300, 42, 'Puqueldón'),
(301, 42, 'Queilén'),
(302, 42, 'Quemchi'),
(303, 42, 'Quellón'),
(304, 42, 'Quinchao'),
(305, 43, 'Calbuco'),
(306, 43, 'Cochamó'),
(307, 43, 'Fresia'),
(308, 43, 'Frutillar'),
(309, 43, 'Llanquihue'),
(310, 43, 'Los Muermos'),
(311, 43, 'Maullín'),
(312, 43, 'Puerto Montt'),
(313, 43, 'Puerto Varas'),
(314, 44, 'Osorno'),
(315, 44, 'Puero Octay'),
(316, 44, 'Purranque'),
(317, 44, 'Puyehue'),
(318, 44, 'Río Negro'),
(319, 44, 'San Juan de la Costa'),
(320, 44, 'San Pablo'),
(321, 45, 'Chaitén'),
(322, 45, 'Futaleufú'),
(323, 45, 'Hualaihué'),
(324, 45, 'Palena'),
(325, 46, 'Aisén'),
(326, 46, 'Cisnes'),
(327, 46, 'Guaitecas'),
(328, 47, 'Cochrane'),
(329, 47, 'O\'higgins'),
(330, 47, 'Tortel'),
(331, 48, 'Coihaique'),
(332, 48, 'Lago Verde'),
(333, 49, 'Chile Chico'),
(334, 49, 'Río Ibáñez'),
(335, 50, 'Antártica'),
(336, 50, 'Cabo de Hornos'),
(337, 51, 'Laguna Blanca'),
(338, 51, 'Punta Arenas'),
(339, 51, 'Río Verde'),
(340, 51, 'San Gregorio'),
(341, 52, 'Porvenir'),
(342, 52, 'Primavera'),
(343, 52, 'Timaukel'),
(344, 53, 'Natales'),
(345, 53, 'Torres del Paine');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_orden`
--

DROP TABLE IF EXISTS `detalle_orden`;
CREATE TABLE IF NOT EXISTS `detalle_orden` (
  `ID_REP_O` int(11) NOT NULL,
  `NUM_ORDEN` int(11) NOT NULL,
  `FOLIO` int(11) NOT NULL,
  `CANTIDAD_REPUESTO_OR` smallint(6) DEFAULT NULL,
  `PRECIO_UNITARIO_OR` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_REP_O`),
  KEY `FK_RELATIONSHIP_19` (`FOLIO`),
  KEY `FK_SE_DETALLA` (`NUM_ORDEN`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_presupuesto`
--

DROP TABLE IF EXISTS `detalle_presupuesto`;
CREATE TABLE IF NOT EXISTS `detalle_presupuesto` (
  `ID_REP_P` int(11) NOT NULL,
  `NUM_PRESUPUESTO_CLIENTE` int(11) NOT NULL,
  `CANTIDAD_REPUESTO_P` smallint(6) DEFAULT NULL,
  `PRECIO_UNITARIO_P` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_REP_P`),
  KEY `FK_SE_COMPONE` (`NUM_PRESUPUESTO_CLIENTE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

DROP TABLE IF EXISTS `factura`;
CREATE TABLE IF NOT EXISTS `factura` (
  `FOLIO` int(11) NOT NULL AUTO_INCREMENT,
  `PRECIO_NETO` int(11) DEFAULT NULL,
  `PRECIO_IVA` int(11) DEFAULT NULL,
  `COSTO_IVA` int(11) DEFAULT NULL,
  `FECHA_EMISION` datetime DEFAULT NULL,
  `METODO_PAGO` varchar(20) DEFAULT NULL,
  `MANO_OBRA` int(11) DEFAULT NULL,
  PRIMARY KEY (`FOLIO`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marca`
--

DROP TABLE IF EXISTS `marca`;
CREATE TABLE IF NOT EXISTS `marca` (
  `ID_MARCA` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRE_MARCA` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID_MARCA`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mecanico`
--

DROP TABLE IF EXISTS `mecanico`;
CREATE TABLE IF NOT EXISTS `mecanico` (
  `RUT_MECANICO` varchar(20) NOT NULL,
  `ID_TALLER` int(11) DEFAULT NULL,
  `NOMBRE_MECANICO` varchar(20) DEFAULT NULL,
  `APELLIDO_MECANICO` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`RUT_MECANICO`),
  KEY `FK_TRABAJA` (`ID_TALLER`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modelo`
--

DROP TABLE IF EXISTS `modelo`;
CREATE TABLE IF NOT EXISTS `modelo` (
  `ID_MODELO` int(11) NOT NULL AUTO_INCREMENT,
  `ID_MARCA` int(11) DEFAULT NULL,
  `NOMBRE_MODELO` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID_MODELO`),
  KEY `FK_TIENE` (`ID_MARCA`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orden_servicio`
--

DROP TABLE IF EXISTS `orden_servicio`;
CREATE TABLE IF NOT EXISTS `orden_servicio` (
  `NUM_ORDEN` int(11) NOT NULL AUTO_INCREMENT,
  `PATENTE_VEHICULO` varchar(10) NOT NULL,
  `RUT_MECANICO` varchar(20) NOT NULL,
  `OBSERVACION_GRAL` varchar(500) DEFAULT NULL,
  `FECHA_INICIO` datetime DEFAULT NULL,
  `FECHA_TERMINO` datetime DEFAULT NULL,
  `ESTADO_ORDEN` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`NUM_ORDEN`),
  KEY `FK_ES_REPARADO` (`PATENTE_VEHICULO`),
  KEY `FK_REPARA` (`RUT_MECANICO`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `presupuesto`
--

DROP TABLE IF EXISTS `presupuesto`;
CREATE TABLE IF NOT EXISTS `presupuesto` (
  `NUM_PRESUPUESTO_CLIENTE` int(11) NOT NULL AUTO_INCREMENT,
  `PATENTE_VEHICULO` varchar(10) NOT NULL,
  `RUT_MECANICO` varchar(20) NOT NULL,
  `TOTAL_PRESUPUESTO` int(11) DEFAULT NULL,
  `DESCRIPCION_PRESUPUESTO` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`NUM_PRESUPUESTO_CLIENTE`),
  KEY `FK_REALIZA` (`RUT_MECANICO`),
  KEY `FK_SE_INGRESA` (`PATENTE_VEHICULO`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provincia`
--

DROP TABLE IF EXISTS `provincia`;
CREATE TABLE IF NOT EXISTS `provincia` (
  `ID_PROVINCIA` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRE_PROVINCIA` varchar(50) DEFAULT NULL,
  `ID_REGION` int(50) NOT NULL,
  PRIMARY KEY (`ID_PROVINCIA`)
) ENGINE=MyISAM AUTO_INCREMENT=54 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `provincia`
--

INSERT INTO `provincia` (`ID_PROVINCIA`, `NOMBRE_PROVINCIA`, `ID_REGION`) VALUES
(1, 'Arica', 1),
(2, 'Parinacota', 1),
(3, 'Iquique', 2),
(4, 'El Tamarugal', 2),
(5, 'Antofagasta', 3),
(6, 'El Loa', 3),
(7, 'Tocopilla', 3),
(8, 'Chañaral', 4),
(9, 'Copiapó', 4),
(10, 'Huasco', 4),
(11, 'Choapa', 5),
(12, 'Elqui', 5),
(13, 'Limarí', 5),
(14, 'Isla de Pascua', 6),
(15, 'Los Andes', 6),
(16, 'Petorca', 6),
(17, 'Quillota', 6),
(18, 'San Antonio', 6),
(19, 'San Felipe de Aconcagua', 6),
(20, 'Valparaiso', 6),
(21, 'Chacabuco', 7),
(22, 'Cordillera', 7),
(23, 'Maipo', 7),
(24, 'Melipilla', 7),
(25, 'Santiago', 7),
(26, 'Talagante', 7),
(27, 'Cachapoal', 8),
(28, 'Cardenal Caro', 8),
(29, 'Colchagua', 8),
(30, 'Cauquenes', 9),
(31, 'Curicó', 9),
(32, 'Linares', 9),
(33, 'Talca', 9),
(34, 'Arauco', 10),
(35, 'Bio Bío', 10),
(36, 'Concepción', 10),
(37, 'Ñuble', 10),
(38, 'Cautín', 11),
(39, 'Malleco', 11),
(40, 'Valdivia', 12),
(41, 'Ranco', 12),
(42, 'Chiloé', 13),
(43, 'Llanquihue', 13),
(44, 'Osorno', 13),
(45, 'Palena', 13),
(46, 'Aisén', 14),
(47, 'Capitán Prat', 14),
(48, 'Coihaique', 14),
(49, 'General Carrera', 14),
(50, 'Antártica Chilena', 15),
(51, 'Magallanes', 15),
(52, 'Tierra del Fuego', 15),
(53, 'Última Esperanza', 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `region`
--

DROP TABLE IF EXISTS `region`;
CREATE TABLE IF NOT EXISTS `region` (
  `id_region` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_region` varchar(64) NOT NULL,
  `region_ordinal` varchar(4) NOT NULL,
  PRIMARY KEY (`id_region`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `region`
--

INSERT INTO `region` (`id_region`, `nombre_region`, `region_ordinal`) VALUES
(1, 'Arica y Parinacota', 'XV'),
(2, 'Tarapacá', 'I'),
(3, 'Antofagasta', 'II'),
(4, 'Atacama', 'III'),
(5, 'Coquimbo', 'IV'),
(6, 'Valparaiso', 'V'),
(7, 'Metropolitana de Santiago', 'RM'),
(8, 'Libertador General Bernardo O\'Higgins', 'VI'),
(9, 'Maule', 'VII'),
(10, 'Biobío', 'VIII'),
(11, 'La Araucanía', 'IX'),
(12, 'Los Ríos', 'XIV'),
(13, 'Los Lagos', 'X'),
(14, 'Aisén del General Carlos Ibáñez del Campo', 'XI'),
(15, 'Magallanes y de la Antártica Chilena', 'XII');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repuesto`
--

DROP TABLE IF EXISTS `repuesto`;
CREATE TABLE IF NOT EXISTS `repuesto` (
  `ID_REPUESTO` int(11) NOT NULL AUTO_INCREMENT,
  `ID_MODELO` int(11) NOT NULL,
  `DESCRIPCION_REPUESTO` varchar(30) DEFAULT NULL,
  `STOCK_REPUESTO` int(11) DEFAULT NULL,
  `PRECIO_REPUESTO` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_REPUESTO`),
  KEY `FK_USA` (`ID_MODELO`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `taller`
--

DROP TABLE IF EXISTS `taller`;
CREATE TABLE IF NOT EXISTS `taller` (
  `ID_TALLER` int(11) NOT NULL AUTO_INCREMENT,
  `ID_COMUNA` int(11) NOT NULL,
  `DIRECCION_TALLER` varchar(20) DEFAULT NULL,
  `EMAIL_TALLER` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID_TALLER`),
  KEY `FK_SE_UBICA` (`ID_COMUNA`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telefono`
--

DROP TABLE IF EXISTS `telefono`;
CREATE TABLE IF NOT EXISTS `telefono` (
  `NUM_TELEFONO_CLI` varchar(20) NOT NULL,
  `ID_TALLER` int(11) DEFAULT NULL,
  PRIMARY KEY (`NUM_TELEFONO_CLI`),
  KEY `FK_SE_CONTACTA` (`ID_TALLER`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telefonos_cliente`
--

DROP TABLE IF EXISTS `telefonos_cliente`;
CREATE TABLE IF NOT EXISTS `telefonos_cliente` (
  `ID_TELEFONO_CLIENTE` varchar(15) NOT NULL,
  `RUT_CLIENTE` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_TELEFONO_CLIENTE`),
  KEY `FK_ES_CONTACTADO` (`RUT_CLIENTE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
