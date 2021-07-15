-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 19 May 2021, 22:33:23
-- Sunucu sürümü: 10.4.18-MariaDB
-- PHP Sürümü: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `prolab_2_proje_3`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `admin`
--

CREATE TABLE `admin` (
  `adminID` int(11) NOT NULL,
  `adminAd` text COLLATE utf8_turkish_ci NOT NULL,
  `adminEmail` text COLLATE utf8_turkish_ci NOT NULL,
  `adminŞifre` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `admin`
--

INSERT INTO `admin` (`adminID`, `adminAd`, `adminEmail`, `adminŞifre`) VALUES
(1, 'Rana', 'ranadudukabak@gmail.com', 'abc123'),
(2, 'Esra', 'esradinc@gmail.com', 'xyz123'),
(3, 'a', 'a', 'a');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `albüm`
--

CREATE TABLE `albüm` (
  `albümID` int(11) NOT NULL,
  `albümAd` text COLLATE utf8_turkish_ci NOT NULL,
  `albümSanatçı` text COLLATE utf8_turkish_ci NOT NULL,
  `albümTarih` date NOT NULL,
  `albümTür` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `albüm`
--

INSERT INTO `albüm` (`albümID`, `albümAd`, `albümSanatçı`, `albümTarih`, `albümTür`) VALUES
(4, 'Maya', 'Mabel Matiz', '2021-05-12', 'Pop'),
(6, 'A01', 'Vittorio Monti', '2001-05-04', 'Klasik\r\n'),
(7, 'Mesafe', 'Serdar Ortaç', '1991-05-18', 'Pop\r\n'),
(8, 'A02', 'Wolgang Amadeus Mozart', '2000-12-21', 'Klasik'),
(9, 'Maya', 'Mabel Matiz', '1991-05-10', 'Pop'),
(10, 'A03', 'J. S. Bach', '1980-11-12', 'Klasik'),
(11, 'Four Seasons', 'Antonio Vivaldi', '1991-05-11', 'Klasik'),
(12, 'A04', 'Ludwing van Beethoven', '1982-05-12', 'Klasik'),
(13, 'Yeni Ay', 'Sıla Gencoğlu', '2014-05-17', 'Pop'),
(14, 'B01', 'Yıldız Tilbe', '2011-05-24', 'Pop'),
(15, 'B02', 'Oğuzhan Koç', '2016-05-20', 'Pop'),
(16, 'C01', 'Charlie Parker', '1971-05-21', 'Jazz'),
(17, 'C02', 'James Morrison', '2002-01-16', 'Jazz'),
(18, 'C03', 'Louis Armstrong', '2002-03-12', 'Jazz'),
(19, 'C04', 'Billie Holiday', '2012-05-12', 'Jazz'),
(20, 'C05', 'Johnny Griffin', '1992-05-09', 'Jazz'),
(21, 'C06', 'Gerry Mulligan', '2011-05-06', 'Jazz'),
(22, 'C07', 'Benny Carter', '2013-05-11', 'Jazz'),
(23, 'A05', 'Piotr Ilich Tchaikovsky', '1991-05-16', 'Klasik'),
(24, 'A06', 'Niccolo Paganini', '1961-05-13', 'Klasik');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `etka_cüre`
--

CREATE TABLE `etka_cüre` (
  `şarkıID` int(11) NOT NULL,
  `şarkıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTarih` date NOT NULL,
  `şarkıSanatçı` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıAlbüm` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTür` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıSüre` float NOT NULL,
  `şarkıDinlenmeSayısı` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `furkan_yavuz`
--

CREATE TABLE `furkan_yavuz` (
  `şarkıID` int(11) NOT NULL,
  `şarkıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTarih` date NOT NULL,
  `şarkıSanatçı` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıAlbüm` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTür` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıSüre` float NOT NULL,
  `şarkıDinlenmeSayısı` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `gamze_dinç`
--

CREATE TABLE `gamze_dinç` (
  `şarkıID` int(11) NOT NULL,
  `şarkıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTarih` date NOT NULL,
  `şarkıSanatçı` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıAlbüm` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTür` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıSüre` float NOT NULL,
  `şarkıDinlenmeSayısı` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `jazz_müzik`
--

CREATE TABLE `jazz_müzik` (
  `şarkıID` int(11) NOT NULL,
  `şarkıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTarih` date NOT NULL,
  `şarkıSanatçı` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıAlbüm` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTür` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıSüre` float NOT NULL,
  `şarkıDinlenmeSayısı` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `jazz_müzik`
--

INSERT INTO `jazz_müzik` (`şarkıID`, `şarkıAd`, `şarkıTarih`, `şarkıSanatçı`, `şarkıAlbüm`, `şarkıTür`, `şarkıSüre`, `şarkıDinlenmeSayısı`) VALUES
(4, 'All The Things You Are', '2011-05-11', 'Charlie Parker', 'Null', 'Jazz', 3.45, 123),
(5, 'The Gypsy', '2011-05-28', 'Charlie Parker', 'C01', 'Jazz', 7.12, 111),
(6, 'Donna Lee', '2012-05-01', 'Charlie Parker', 'C01', 'Jazz', 8.13, 122),
(7, 'Yard Bird Suite', '2012-02-09', 'Charlie Parker', 'C01', 'Jazz', 3.52, 159),
(8, 'You Give Me Something', '2013-01-21', 'James Morrison', 'C02', 'Jazz', 6.56, 149),
(9, 'Broken Strings', '2013-10-09', 'James Morrison', 'C02', 'Jazz', 5.21, 169),
(10, 'I Won\'t Let You Go', '2014-06-29', 'James Morrison', 'C02', 'Jazz', 4.55, 225),
(11, 'What A Wonderful World', '2016-01-15', 'Louis Armstrong', 'C03', 'Jazz', 3.51, 150),
(12, 'Dream A Little Dream Of Me', '2013-05-24', 'Louis Armstrong', 'C03', 'Jazz', 5.11, 219),
(13, 'All Of Me', '2020-06-18', 'Billie Holiday', 'C04', 'Jazz', 4.44, 178),
(14, 'Strange Fruit', '2004-01-24', 'Billie Holiday', 'C04', 'Jazz', 2.13, 127),
(15, 'Smoke Stack', '2000-03-24', 'Johnny Griffin', 'C05', 'Jazz', 4.23, 167),
(16, 'Lullaby Of The Leaves', '1998-07-16', 'Gerry Mulligan', 'C06', 'Jazz', 5.32, 201),
(17, 'My Funny Valentine', '1989-08-26', 'Gerry Mulligan', 'C06', 'Jazz', 4.23, 199),
(18, 'Christmas In New Orleans', '2009-06-18', 'Benny Carter', 'C07', 'Jazz', 5.32, 155);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `klasik_müzik`
--

CREATE TABLE `klasik_müzik` (
  `şarkıID` int(11) NOT NULL,
  `şarkıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTarih` date NOT NULL,
  `şarkıSanatçı` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıAlbüm` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTür` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıSüre` float NOT NULL,
  `şarkıDinlenmeSayısı` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `klasik_müzik`
--

INSERT INTO `klasik_müzik` (`şarkıID`, `şarkıAd`, `şarkıTarih`, `şarkıSanatçı`, `şarkıAlbüm`, `şarkıTür`, `şarkıSüre`, `şarkıDinlenmeSayısı`) VALUES
(12, 'La Campanella', '1988-05-13', 'Niccolo Paganini', 'A06', 'Klasik', 4.06, 506),
(13, 'Spring', '1981-05-16', 'Antonio Vivaldi', 'Four Seasons', 'Klasik', 6.58, 95),
(14, 'Czardas', '1910-02-10', 'Vittorio Monti', 'A01', 'Klasik', 5.58, 78),
(15, 'Turkish March', '2015-12-18', 'Wolfgang Amadeus Mozart', 'A02', 'Klasik', 3.48, 156),
(16, 'St. Matthauspassion', '2020-12-12', 'J.S Bach', 'A03', 'Klasik', 3.57, 90),
(17, 'Summer', '1980-02-12', 'Antonio Vivaldi', 'Four Seasons', 'Klasik', 9.14, 299),
(18, 'Für Elise', '2020-12-12', 'Ludwig van Beethoven', 'A04', 'Klasik', 5.27, 105),
(19, 'Autumn', '2001-05-01', 'Antonio Vivaldi', 'Four Seasons', 'Klasik', 4.07, 345),
(20, 'Winter', '2001-05-26', 'Antonio Vivaldi', 'Four Seasons', 'Klasik', 4.11, 321),
(21, 'Eine Kleine Nachtmusik: Allegro', '1961-12-12', 'Wolfgang Amadeus Mozart', 'A02', 'Klasik', 1.25, 217),
(22, 'Toccata And Fugue In D Minor', '1990-07-19', 'J. S. Bach', 'A03', 'Klasik', 2.12, 222),
(23, 'Sleepers Awake', '1970-12-25', 'J. S. Bach', 'A03', 'Klasik', 5.22, 311),
(24, 'Symphony No. 5: I', '1988-09-17', 'Ludwig van Beethoven', 'A04', 'Klasik', 3.55, 118),
(25, 'Swan Lake', '1980-05-23', 'Piotr Ilich Tchaikovsky', 'A05', 'Klasik', 9.13, 125),
(26, 'Capriccio No.24', '1972-05-11', 'Niccolo Paganini', 'A06', 'Klasik', 3.14, 478);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanıcı`
--

CREATE TABLE `kullanıcı` (
  `kullanıcıID` int(11) NOT NULL,
  `kullanıcıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `kullanıcıSoyad` text COLLATE utf8_turkish_ci NOT NULL,
  `kullanıcıEmail` text COLLATE utf8_turkish_ci NOT NULL,
  `kullanıcıŞifre` text COLLATE utf8_turkish_ci NOT NULL,
  `kullanıcıAbonelikTür` text COLLATE utf8_turkish_ci NOT NULL,
  `kullanıcıÜlke` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `melisa_yılmaz`
--

CREATE TABLE `melisa_yılmaz` (
  `şarkıID` int(11) NOT NULL,
  `şarkıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTarih` date NOT NULL,
  `şarkıSanatçı` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıAlbüm` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTür` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıSüre` float NOT NULL,
  `şarkıDinlenmeSayısı` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `murat_gündüz`
--

CREATE TABLE `murat_gündüz` (
  `şarkıID` int(11) NOT NULL,
  `şarkıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTarih` date NOT NULL,
  `şarkıSanatçı` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıAlbüm` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTür` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıSüre` float NOT NULL,
  `şarkıDinlenmeSayısı` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `normal_kullanıcı`
--

CREATE TABLE `normal_kullanıcı` (
  `kullanıcıID` int(11) NOT NULL,
  `kullanıcıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `kullanıcıEmail` text COLLATE utf8_turkish_ci NOT NULL,
  `kullanıcıŞifre` text COLLATE utf8_turkish_ci NOT NULL,
  `kullanıcıÜlke` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `normal_kullanıcı`
--

INSERT INTO `normal_kullanıcı` (`kullanıcıID`, `kullanıcıAd`, `kullanıcıEmail`, `kullanıcıŞifre`, `kullanıcıÜlke`) VALUES
(1, 'Etka Cüre', 'etkacure@gmail.com', '12345', 'Türkiye'),
(2, 'Furkan Yavuz', 'furkanyavuz@gmail.com', '12345', 'Türkiye'),
(3, 'Gamze Dinç', 'gamze_dinç', '12345', 'Türkiye'),
(4, 'Melisa Yılmaz', 'melisayilmaz@gmail.com', '12345', 'Türkiye'),
(5, 'Murat Gündüz', 'muratgunduz@gmail.com', '12345', 'Türkiye');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `okan_demir`
--

CREATE TABLE `okan_demir` (
  `şarkıID` int(11) NOT NULL,
  `şarkıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTarih` date NOT NULL,
  `şarkıSanatçı` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıAlbüm` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTür` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıSüre` float NOT NULL,
  `şarkıDinlenmeSayısı` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `okan_demir`
--

INSERT INTO `okan_demir` (`şarkıID`, `şarkıAd`, `şarkıTarih`, `şarkıSanatçı`, `şarkıAlbüm`, `şarkıTür`, `şarkıSüre`, `şarkıDinlenmeSayısı`) VALUES
(2, 'Summer', '1981-05-16', 'Antonio Vivaldi', 'Four Seasons', 'Klasik', 9.14, 299),
(3, 'Autumn', '2001-05-01', 'Antonio Vivaldi', 'Four Seasons', 'Klasik', 4.07, 345),
(4, 'Sarışın', '2018-04-15', 'Mabel Matiz', 'Maya', 'Pop', 5.13, 105),
(5, 'All The Things You Are', '2011-05-11', 'Charlie Parker', 'C01', 'Jazz', 3.45, 123);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `onur_aksoy`
--

CREATE TABLE `onur_aksoy` (
  `şarkıID` int(11) NOT NULL,
  `şarkıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTarih` date NOT NULL,
  `şarkıSanatçı` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıAlbüm` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTür` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıSüre` float NOT NULL,
  `şarkıDinlenmeSayısı` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `pop_müzik`
--

CREATE TABLE `pop_müzik` (
  `şarkıID` int(11) NOT NULL,
  `şarkıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTarih` date NOT NULL,
  `şarkıSanatçı` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıAlbüm` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTür` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıSüre` float NOT NULL,
  `şarkıDinlenmeSayısı` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `pop_müzik`
--

INSERT INTO `pop_müzik` (`şarkıID`, `şarkıAd`, `şarkıTarih`, `şarkıSanatçı`, `şarkıAlbüm`, `şarkıTür`, `şarkıSüre`, `şarkıDinlenmeSayısı`) VALUES
(23, 'Dünyadan Uzak', '2021-05-31', 'Sakiler', 'Null', 'Pop', 4.07, 15),
(24, 'Efsane', '1910-02-10', 'David Garret', 'Null', 'Pop', 5.23, 21),
(25, 'Poşet', '2013-04-17', 'Serdar Ortaç', 'Mesafe', 'Pop', 4.07, 150),
(26, 'Sarışın', '2018-04-15', 'Mabel Matiz', 'Maya', 'Pop', 5.13, 105),
(27, 'Zor Değil', '2014-03-04', 'Mabel Matiz', 'Maya', 'Pop', 4.45, 98),
(28, 'Ya Bu İşler Ne', '2017-02-24', 'Mabel Matiz', 'Maya', 'Pop', 4.35, 75),
(29, 'A Canım', '2019-06-18', 'Mabel Matiz', 'Maya', 'Pop', 4.36, 101),
(30, 'Mendilimde Kırmızım Var', '2019-08-18', 'Mabel Matiz', 'Maya', 'Pop', 4.32, 85),
(31, 'Sarmaşık', '2019-01-25', 'Mabel Matiz', 'Maya', 'Pop', 4.39, 115),
(32, 'Ben Adam Olmam ', '2017-05-17', 'Serdar Ortaç', 'Mesafe', 'Pop', 3.39, 147),
(33, 'Karabiberim ', '2016-05-17', 'Serdar Ortaç', 'Mesafe', 'Pop', 3.32, 110),
(34, 'Reverans', '2018-11-17', 'Sıla Gencoğlu', 'Yeni Ay', 'Pop', 4.02, 118),
(35, 'Yabancı', '2013-09-21', 'Sıla Gencoğlu', 'Yeni Ay', 'Pop', 4.15, 164),
(36, 'Vaziyetler', '2014-06-20', 'Sıla Gencoğlu', 'Yeni Ay', 'Pop', 3.37, 152),
(37, 'Hediye', '2012-12-18', 'Sıla Gencoğlu', 'Yeni Ay', 'Pop', 3.39, 156),
(38, 'Vazgeçtim', '2012-11-18', 'Yıldız Tilbe', 'Null', 'Pop', 3.36, 250),
(39, 'Çat Kapı', '2010-07-12', 'Yıldız Tilbe', 'Null', 'Pop', 3.36, 215),
(40, 'Hesabıma Yazıyor', '2020-10-17', 'Oğuzhan Koç ', 'Null', 'Pop', 3.17, 148),
(41, 'Ahu', '2018-02-25', 'Mabel Matiz', 'Maya', 'Pop', 3.14, 100),
(42, 'Gitsem Diyorum', '2019-10-17', 'Oğuzhan Koç ', 'Null', 'Pop', 4.01, 112),
(43, 'Aşk Dediğin', '2020-09-17', 'Oğuzhan Koç ', 'Null', 'Pop', 3.22, 158);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `premium_kullanıcı`
--

CREATE TABLE `premium_kullanıcı` (
  `kullanıcıID` int(11) NOT NULL,
  `kullanıcıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `kullanıcıEmail` text COLLATE utf8_turkish_ci NOT NULL,
  `kullanıcıŞifre` text COLLATE utf8_turkish_ci NOT NULL,
  `kullanıcıÜlke` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `premium_kullanıcı`
--

INSERT INTO `premium_kullanıcı` (`kullanıcıID`, `kullanıcıAd`, `kullanıcıEmail`, `kullanıcıŞifre`, `kullanıcıÜlke`) VALUES
(1, 'Okan Demir', 'okandemir@gmail.com', 'abcde', 'Türkiye'),
(2, 'Onur Aksoy', 'onuraksoy@gmail.com', 'abcde', 'Türkiye'),
(3, 'Serra Şevval Kabak', 'serrasevvalkabak@gmail.com', 'abcde', 'Türkiye'),
(4, 'Sezen Kaya', 'sezenkaya@gmail.com', 'abcde', 'Türkiye'),
(5, 'Zehra Çelik', 'zehracelik@gmail.com', 'abcde', 'Türkiye');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `sanatçı`
--

CREATE TABLE `sanatçı` (
  `sanatçıID` int(11) NOT NULL,
  `sanatçıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `sanatçıÜlke` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `sanatçı`
--

INSERT INTO `sanatçı` (`sanatçıID`, `sanatçıAd`, `sanatçıÜlke`) VALUES
(1, 'Vittorio Monti', 'İtalya'),
(3, 'Serdar Ortaç', 'Türkiye'),
(4, 'Wolfgang Amadeus Mozart', 'Avusturya'),
(5, 'Mabel Matiz', 'Türkiye'),
(6, 'J. S. Bach', 'Almanya'),
(7, 'Antonio Vivaldi', 'İtalya'),
(8, 'Ludwig van Beethoven', 'Almanya'),
(9, 'Sıla Gencoğlu', 'Türkiye'),
(10, 'Yıldız Tilbe', 'Türkiye'),
(11, 'Oğuzhan Koç', 'Türkiye'),
(12, 'Charlie Parker', 'ABD'),
(13, 'James Morrison', 'UK'),
(14, 'Louis Armstrong', 'ABD'),
(15, 'Billie Holiday', 'ABD'),
(16, 'Johnny Griffin', 'ABD'),
(17, 'Gerry Mulligan', 'ABD'),
(18, 'Benny Carter', 'ABD'),
(19, 'Piotr Ilich Tchaikovsky', 'Rusya'),
(20, 'Niccolo Paganini', 'İtalya');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `serra_şevval_kabak`
--

CREATE TABLE `serra_şevval_kabak` (
  `şarkıID` int(11) NOT NULL,
  `şarkıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTarih` date NOT NULL,
  `şarkıSanatçı` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıAlbüm` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTür` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıSüre` float NOT NULL,
  `şarkıDinlenmeSayısı` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `sezen_kaya`
--

CREATE TABLE `sezen_kaya` (
  `şarkıID` int(11) NOT NULL,
  `şarkıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTarih` date NOT NULL,
  `şarkıSanatçı` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıAlbüm` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTür` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıSüre` float NOT NULL,
  `şarkıDinlenmeSayısı` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `zehra_çelik`
--

CREATE TABLE `zehra_çelik` (
  `şarkıID` int(11) NOT NULL,
  `şarkıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTarih` date NOT NULL,
  `şarkıSanatçı` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıAlbüm` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTür` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıSüre` float NOT NULL,
  `şarkıDinlenmeSayısı` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `şarkı`
--

CREATE TABLE `şarkı` (
  `şarkıID` int(11) NOT NULL,
  `şarkıAd` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTarih` date NOT NULL,
  `şarkıSanatçı` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıAlbüm` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıTür` text COLLATE utf8_turkish_ci NOT NULL,
  `şarkıSüre` float NOT NULL,
  `şarkıDinlenmeSayısı` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `şarkı`
--

INSERT INTO `şarkı` (`şarkıID`, `şarkıAd`, `şarkıTarih`, `şarkıSanatçı`, `şarkıAlbüm`, `şarkıTür`, `şarkıSüre`, `şarkıDinlenmeSayısı`) VALUES
(23, 'Czardas', '1910-02-10', 'Vittorio Monti', 'A01', 'Klasik', 5.58, 78),
(24, 'Poşet', '2013-04-17', 'Serdar Ortaç', 'Mesafe', 'Pop', 4.07, 150),
(25, 'Turkish March', '2015-12-18', 'Wolfgang Amadeus Mozart', 'A02', 'Klasik', 3.48, 156),
(26, 'Sarışın', '2018-04-15', 'Mabel Matiz', 'Maya', 'Pop', 5.13, 105),
(27, 'Zor Değil', '2014-03-04', 'Mabel Matiz', 'Maya', 'Pop', 4.45, 98),
(28, 'Ya Bu İşler Ne', '2017-02-24', 'Mabel Matiz', 'Maya', 'Pop', 4.35, 75),
(29, 'A Canım', '2019-06-18', 'Mabel Matiz', 'Maya', 'Pop', 4.36, 101),
(30, 'Mendilimde Kırmızım Var', '2019-08-18', 'Mabel Matiz', 'Maya', 'Pop', 4.32, 85),
(31, 'St. Matthauspassion', '2020-12-12', 'J. S. Bach ', 'A03', 'Klasik', 3.57, 90),
(32, 'Spring', '1980-02-12', 'Antonio Vivaldi', 'Four Seasons', 'Klasik', 6.58, 95),
(33, 'Für Elise', '2020-12-12', 'Ludwig van Beethoven', 'A04', 'Klasik', 5.27, 105),
(34, 'Sarmaşık', '2019-01-25', 'Mabel Matiz', 'Maya', 'Pop', 4.39, 115),
(35, 'Ben Adam Olmam ', '2017-05-17', 'Serdar Ortaç', 'Mesafe', 'Pop', 3.39, 147),
(36, 'Karabiberim', '2016-05-17', 'Serdar Ortaç', 'Mesafe', 'Pop', 3.32, 110),
(37, 'Reverans', '2018-11-17', 'Sıla Gencoğlu', 'Yeni Ay', 'Pop', 4.02, 118),
(38, 'Yabancı', '2013-09-21', 'Sıla Gencoğlu', 'Yeni Ay', 'Pop', 4.15, 164),
(39, 'Vaziyetler', '2014-06-20', 'Sıla Gencoğlu', 'Yeni Ay', 'Pop', 3.37, 152),
(40, 'Hediye', '2012-12-18', 'Sıla Gencoğlu', 'Yeni Ay', 'Pop', 3.39, 156),
(41, 'Vazgeçtim', '2012-11-18', 'Yıldız Tilbe', 'B01', 'Pop', 3.36, 250),
(42, 'Çat Kapı', '2010-07-12', 'Yıldız Tilbe', 'B01', 'Pop', 3.36, 215),
(43, 'Hesabıma Yazıyor', '2020-10-17', 'Oğuzhan Koç ', 'B02', 'Pop', 3.17, 148),
(44, 'Ahu', '2018-02-25', 'Mabel Matiz', 'Maya', 'Pop', 3.15, 100),
(45, 'Gitsem Diyorum', '2019-10-17', 'Oğuzhan Koç ', 'B02', 'Pop', 4.01, 112),
(46, 'Aşk Dediğin', '2020-09-17', 'Oğuzhan Koç ', 'B02', 'Pop', 3.22, 158),
(47, 'All The Things You Are', '2011-05-11', 'Charlie Parker', 'C01', 'Jazz', 3.45, 123),
(48, 'The Gypsy', '2011-05-28', 'Charlie Parker', 'C01', 'Jazz', 7.12, 111),
(49, 'Donna Lee', '2012-05-01', 'Charlie Parker', 'C01', 'Jazz', 8.13, 122),
(50, 'Yardbird Suite', '2012-02-09', 'Charlie Parker', 'C01', 'Jazz', 3.52, 159),
(51, 'You Give Me Something', '2013-01-21', 'James Morrison', 'C02', 'Jazz', 6.56, 149),
(52, 'Broken Strings', '2013-10-09', 'James Morrison', 'C02', 'Jazz', 5.21, 169),
(53, 'I Won\'t Let You Go', '2014-06-29', 'James Morrison', 'C02', 'Jazz', 4.55, 225),
(54, 'What A Wonderful World', '2016-01-15', 'Louis Armstrong', 'C03', 'Jazz', 3.51, 150),
(55, 'Dream A Little Dream Of Me', '2013-05-24', 'Louis Armstrong', 'C03', 'Jazz', 5.11, 219),
(56, 'All Of Me', '2020-06-18', 'Billie Holiday', 'C04', 'Jazz', 4.44, 178),
(57, 'Strange Fruit', '2004-01-24', 'Billie Holiday', 'C04', 'Jazz', 2.13, 127),
(58, 'Smoke Stack', '2000-03-24', 'Johnny Griffin', 'C05', 'Jazz', 4.23, 167),
(59, 'Lullaby Of The Leaves', '1998-07-16', 'Gerry Mulligan', 'C06', 'Jazz', 5.32, 201),
(60, 'My Funny Valentine', '1989-08-26', 'Gerry Mulligan', 'C06', 'Jazz', 4.23, 199),
(61, 'Christmas in New Orleans', '2009-06-18', 'Benny Carter', 'C07', 'Jazz', 5.32, 155),
(62, 'Summer', '1981-05-16', 'Antonio Vivaldi', 'Four Seasons', 'Klasik', 9.14, 299),
(63, 'Autumn', '2001-05-01', 'Antonio Vivaldi', 'Four Seasons', 'Klasik', 4.07, 345),
(64, 'Winter', '2001-05-26', 'Antonio Vivaldi', 'Four Seasons', 'Klasik', 4.11, 321),
(65, 'Swan Lake', '1980-05-23', 'Piotr Ilich Tchaikovsky', 'A05', 'Klasik', 9.13, 125),
(66, 'Symphony No. 5: I', '1988-09-17', 'Ludvig van Beethoven', 'A04', 'Klasik', 3.55, 118),
(67, 'Eine Kleine Nachtmusik: Allegro', '1961-12-12', 'Wolfgang Amadeus Mozart', 'A02', 'Klasik', 1.25, 217),
(68, 'Toccata And Fugue In D Minor', '1990-07-19', 'J. S. Bach', 'A03', 'Klasik', 2.12, 222),
(69, 'Sleepers Awake', '1970-12-25', 'J. S. Bach', 'A03', 'Klasik', 5.22, 301),
(70, 'La Campanella', '1988-05-13', 'Niccolo Paganini', 'A06', 'Klasik', 4.07, 506),
(71, 'Capriccio No.24', '1972-05-11', 'Niccolo Paganini', 'A06', 'Klasik', 3.14, 478);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adminID`);

--
-- Tablo için indeksler `albüm`
--
ALTER TABLE `albüm`
  ADD PRIMARY KEY (`albümID`);

--
-- Tablo için indeksler `etka_cüre`
--
ALTER TABLE `etka_cüre`
  ADD PRIMARY KEY (`şarkıID`);

--
-- Tablo için indeksler `furkan_yavuz`
--
ALTER TABLE `furkan_yavuz`
  ADD PRIMARY KEY (`şarkıID`);

--
-- Tablo için indeksler `gamze_dinç`
--
ALTER TABLE `gamze_dinç`
  ADD PRIMARY KEY (`şarkıID`);

--
-- Tablo için indeksler `jazz_müzik`
--
ALTER TABLE `jazz_müzik`
  ADD PRIMARY KEY (`şarkıID`);

--
-- Tablo için indeksler `klasik_müzik`
--
ALTER TABLE `klasik_müzik`
  ADD PRIMARY KEY (`şarkıID`);

--
-- Tablo için indeksler `kullanıcı`
--
ALTER TABLE `kullanıcı`
  ADD PRIMARY KEY (`kullanıcıID`);

--
-- Tablo için indeksler `melisa_yılmaz`
--
ALTER TABLE `melisa_yılmaz`
  ADD PRIMARY KEY (`şarkıID`);

--
-- Tablo için indeksler `murat_gündüz`
--
ALTER TABLE `murat_gündüz`
  ADD PRIMARY KEY (`şarkıID`);

--
-- Tablo için indeksler `normal_kullanıcı`
--
ALTER TABLE `normal_kullanıcı`
  ADD PRIMARY KEY (`kullanıcıID`);

--
-- Tablo için indeksler `okan_demir`
--
ALTER TABLE `okan_demir`
  ADD PRIMARY KEY (`şarkıID`);

--
-- Tablo için indeksler `onur_aksoy`
--
ALTER TABLE `onur_aksoy`
  ADD PRIMARY KEY (`şarkıID`);

--
-- Tablo için indeksler `pop_müzik`
--
ALTER TABLE `pop_müzik`
  ADD PRIMARY KEY (`şarkıID`);

--
-- Tablo için indeksler `premium_kullanıcı`
--
ALTER TABLE `premium_kullanıcı`
  ADD PRIMARY KEY (`kullanıcıID`);

--
-- Tablo için indeksler `sanatçı`
--
ALTER TABLE `sanatçı`
  ADD PRIMARY KEY (`sanatçıID`);

--
-- Tablo için indeksler `serra_şevval_kabak`
--
ALTER TABLE `serra_şevval_kabak`
  ADD PRIMARY KEY (`şarkıID`);

--
-- Tablo için indeksler `sezen_kaya`
--
ALTER TABLE `sezen_kaya`
  ADD PRIMARY KEY (`şarkıID`);

--
-- Tablo için indeksler `zehra_çelik`
--
ALTER TABLE `zehra_çelik`
  ADD PRIMARY KEY (`şarkıID`);

--
-- Tablo için indeksler `şarkı`
--
ALTER TABLE `şarkı`
  ADD PRIMARY KEY (`şarkıID`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `admin`
--
ALTER TABLE `admin`
  MODIFY `adminID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Tablo için AUTO_INCREMENT değeri `albüm`
--
ALTER TABLE `albüm`
  MODIFY `albümID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- Tablo için AUTO_INCREMENT değeri `etka_cüre`
--
ALTER TABLE `etka_cüre`
  MODIFY `şarkıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `furkan_yavuz`
--
ALTER TABLE `furkan_yavuz`
  MODIFY `şarkıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `gamze_dinç`
--
ALTER TABLE `gamze_dinç`
  MODIFY `şarkıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Tablo için AUTO_INCREMENT değeri `jazz_müzik`
--
ALTER TABLE `jazz_müzik`
  MODIFY `şarkıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Tablo için AUTO_INCREMENT değeri `klasik_müzik`
--
ALTER TABLE `klasik_müzik`
  MODIFY `şarkıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- Tablo için AUTO_INCREMENT değeri `kullanıcı`
--
ALTER TABLE `kullanıcı`
  MODIFY `kullanıcıID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Tablo için AUTO_INCREMENT değeri `melisa_yılmaz`
--
ALTER TABLE `melisa_yılmaz`
  MODIFY `şarkıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Tablo için AUTO_INCREMENT değeri `murat_gündüz`
--
ALTER TABLE `murat_gündüz`
  MODIFY `şarkıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `normal_kullanıcı`
--
ALTER TABLE `normal_kullanıcı`
  MODIFY `kullanıcıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Tablo için AUTO_INCREMENT değeri `okan_demir`
--
ALTER TABLE `okan_demir`
  MODIFY `şarkıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Tablo için AUTO_INCREMENT değeri `onur_aksoy`
--
ALTER TABLE `onur_aksoy`
  MODIFY `şarkıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `pop_müzik`
--
ALTER TABLE `pop_müzik`
  MODIFY `şarkıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- Tablo için AUTO_INCREMENT değeri `premium_kullanıcı`
--
ALTER TABLE `premium_kullanıcı`
  MODIFY `kullanıcıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Tablo için AUTO_INCREMENT değeri `sanatçı`
--
ALTER TABLE `sanatçı`
  MODIFY `sanatçıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Tablo için AUTO_INCREMENT değeri `serra_şevval_kabak`
--
ALTER TABLE `serra_şevval_kabak`
  MODIFY `şarkıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Tablo için AUTO_INCREMENT değeri `sezen_kaya`
--
ALTER TABLE `sezen_kaya`
  MODIFY `şarkıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `zehra_çelik`
--
ALTER TABLE `zehra_çelik`
  MODIFY `şarkıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `şarkı`
--
ALTER TABLE `şarkı`
  MODIFY `şarkıID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=73;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
