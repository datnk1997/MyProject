USE [master]
GO
/****** Object:  Database [Mobilezz]    Script Date: 12/10/2018 4:10:41 PM ******/
CREATE DATABASE [Mobilezz]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Mobilezz', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\Mobilezz.mdf' , SIZE = 3136KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Mobilezz_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\Mobilezz_log.ldf' , SIZE = 784KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [Mobilezz] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Mobilezz].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Mobilezz] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Mobilezz] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Mobilezz] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Mobilezz] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Mobilezz] SET ARITHABORT OFF 
GO
ALTER DATABASE [Mobilezz] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [Mobilezz] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [Mobilezz] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Mobilezz] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Mobilezz] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Mobilezz] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Mobilezz] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Mobilezz] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Mobilezz] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Mobilezz] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Mobilezz] SET  ENABLE_BROKER 
GO
ALTER DATABASE [Mobilezz] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Mobilezz] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Mobilezz] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Mobilezz] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Mobilezz] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Mobilezz] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Mobilezz] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Mobilezz] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Mobilezz] SET  MULTI_USER 
GO
ALTER DATABASE [Mobilezz] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Mobilezz] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Mobilezz] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Mobilezz] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [Mobilezz]
GO
/****** Object:  Table [dbo].[Cart]    Script Date: 12/10/2018 4:10:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cart](
	[Cartid] [int] IDENTITY(1,1) NOT NULL,
	[TotalPriceOfCart] [int] NULL,
	[Cusid] [int] NULL,
 CONSTRAINT [PK_Cart] PRIMARY KEY CLUSTERED 
(
	[Cartid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[CartDetail]    Script Date: 12/10/2018 4:10:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CartDetail](
	[CDid] [int] IDENTITY(1,1) NOT NULL,
	[Pid] [int] NULL,
	[Cartid] [int] NULL,
	[TotalPrice] [int] NULL,
	[Quanttity] [int] NULL,
 CONSTRAINT [PK_CartDetail] PRIMARY KEY CLUSTERED 
(
	[CDid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Categories]    Script Date: 12/10/2018 4:10:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Categories](
	[Cid] [int] IDENTITY(1,1) NOT NULL,
	[Cname] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Categories] PRIMARY KEY CLUSTERED 
(
	[Cid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Custommer]    Script Date: 12/10/2018 4:10:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Custommer](
	[Cusid] [int] IDENTITY(1,1) NOT NULL,
	[Cusname] [nvarchar](50) NULL,
	[Phone] [nvarchar](50) NULL,
	[Addr] [nvarchar](50) NULL,
	[Uname] [nchar](20) NULL,
	[Pword] [nchar](20) NULL,
 CONSTRAINT [FK_Custommer] PRIMARY KEY CLUSTERED 
(
	[Cusid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Product]    Script Date: 12/10/2018 4:10:41 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[Pid] [int] IDENTITY(1,1) NOT NULL,
	[Cid] [int] NOT NULL,
	[Pname] [nvarchar](50) NULL,
	[Note] [nvarchar](100) NULL,
	[Price] [int] NULL,
	[Piture] [nvarchar](100) NULL,
	[Manhinh] [nvarchar](50) NULL,
	[CPU] [nvarchar](50) NULL,
	[Hedieuhanh] [nvarchar](50) NULL,
	[Ram] [nvarchar](50) NULL,
	[Bonhotrong] [nvarchar](50) NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[Pid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[Cart] ON 

INSERT [dbo].[Cart] ([Cartid], [TotalPriceOfCart], [Cusid]) VALUES (1, 999, 20)
SET IDENTITY_INSERT [dbo].[Cart] OFF
SET IDENTITY_INSERT [dbo].[CartDetail] ON 

INSERT [dbo].[CartDetail] ([CDid], [Pid], [Cartid], [TotalPrice], [Quanttity]) VALUES (30, 2, 1, 0, 2)
SET IDENTITY_INSERT [dbo].[CartDetail] OFF
SET IDENTITY_INSERT [dbo].[Categories] ON 

INSERT [dbo].[Categories] ([Cid], [Cname]) VALUES (1, N'Iphone')
INSERT [dbo].[Categories] ([Cid], [Cname]) VALUES (2, N'SamSung')
INSERT [dbo].[Categories] ([Cid], [Cname]) VALUES (3, N'Sony')
INSERT [dbo].[Categories] ([Cid], [Cname]) VALUES (4, N'Oppo')
SET IDENTITY_INSERT [dbo].[Categories] OFF
SET IDENTITY_INSERT [dbo].[Custommer] ON 

INSERT [dbo].[Custommer] ([Cusid], [Cusname], [Phone], [Addr], [Uname], [Pword]) VALUES (20, N'nguyen khac dat', N'0963963963', N'Ha noi', N'datnk               ', N'123                 ')
INSERT [dbo].[Custommer] ([Cusid], [Cusname], [Phone], [Addr], [Uname], [Pword]) VALUES (21, N'nguyen minh hieu', N'093456456', N'Ha noi', N'hieunm              ', N'123                 ')
SET IDENTITY_INSERT [dbo].[Custommer] OFF
SET IDENTITY_INSERT [dbo].[Product] ON 

INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (1, 2, N'iphone 5', N'New 100% , Full Box', 70, N'themes/images/ladies/ip5.jpg', N'4 inch    ', N'Apple A6  ', N'IOS       ', N'1GB       ', N'16GB      ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (2, 1, N'Iphone 6', N'New 100% , Full Box', 100, N'themes/images/ladies/ip6.jpg', N'5,5 inch  ', N'Apple A9  ', N'IOS       ', N'2GB       ', N'32GB      ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (3, 1, N'Iphone 6S', N'New 100% , Full Box', 150, N'themes/images/ladies/ip6s.jpg', N'4,7 inch  ', N'Apple A9  ', N'IOS       ', N'2GB       ', N'16GB      ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (4, 2, N'SamSung Note 9', N'New 100% , Full Box', 990, N'themes/images/ladies/ssnote9.jpg', N'6.4 inch  ', N' Exynos   ', N'Android   ', N'6 GB      ', N'128 GB    ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (5, 3, N'Sony Xperia X', N'New 100% , Full Box', 300, N'themes/images/ladies/snx.jpg', N'5 inch    ', N'Snapdragon', N'Android   ', N'3 GB      ', N' 64 GB    ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (6, 4, N'OPPO FIND X', N'New 100% , Full Box', 800, N'themes/images/ladies/oppox.jpg', N'6.42 inch ', N'Snapdragon', N'Android   ', N'8 GB      ', N'256 GB    ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (35, 1, N'Iphone 4', N'New 100% , Full Box', 55, N'themes/images/ladies/ip4.jpg', N'4 inch    ', N'Apple A4  ', N'IOS       ', N'1GB       ', N'16GB      ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (36, 1, N'Iphone 4s', N'New 100% , Full Box', 60, N'themes/images/ladies/ip4s.jpg', N'4.5 inch  ', N'Apple A4', N'IOS       ', N'2GB       ', N'32GB      ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (37, 1, N'Iphone 6 PluS', N'New 100% , Full Box', 160, N'themes/images/ladies/ip6plus.jpg', N'4,7 inch  ', N'Apple A9  ', N'IOS       ', N'2GB       ', N'16GB      ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (38, 2, N'SamSung J4', N'New 100% , Full Box', 100, N'themes/images/ladies/ssj4.jpg', N'6.4 inch  ', N' Exynos   ', N'Android   ', N'6 GB      ', N'128 GB    ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (39, 3, N'Sony Xperia 5', N'New 100% , Full Box', 300, N'themes/images/ladies/sn5.jpg', N'5 inch    ', N'Snapdragon', N'Android   ', N'3 GB      ', N' 64 GB    ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (40, 4, N'OPPO F1', N'New 100% , Full Box', 150, N'themes/images/ladies/oppof1.jpg', N'6.42 inch ', N'Snapdragon', N'Android   ', N'8 GB      ', N'256 GB    ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (42, 1, N'Iphone 7', N'New 100% , Full Box', 300, N'themes/images/ladies/ip7.jpg', N'4 inch    ', N'Apple A4  ', N'IOS       ', N'1GB       ', N'16GB      ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (43, 1, N'Iphone 7s', N'New 100% , Full Box', 350, N'themes/images/ladies/ip7s.jpg', N'4.5 inch  ', N'Apple A4', N'IOS       ', N'2GB       ', N'32GB      ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (44, 1, N'Iphone 7s PluS', N'New 100% , Full Box', 380, N'themes/images/ladies/ip7splus.jpg', N'4,7 inch  ', N'Apple A9  ', N'IOS       ', N'2GB       ', N'16GB      ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (45, 2, N'SamSung J5', N'New 100% , Full Box', 150, N'themes/images/ladies/ssj5.jpg', N'6.4 inch  ', N' Exynos   ', N'Android   ', N'6 GB      ', N'128 GB    ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (46, 3, N'Sony Xperia 6', N'New 100% , Full Box', 330, N'themes/images/ladies/sn6.png', N'5 inch    ', N'Snapdragon', N'Android   ', N'3 GB      ', N' 64 GB    ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (47, 4, N'OPPO F1s', N'New 100% , Full Box', 180, N'themes/images/ladies/oppof1s.jpg', N'6.42 inch ', N'Snapdragon', N'Android   ', N'8 GB      ', N'256 GB    ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (48, 4, N'OPPO Pro', N'New 100% , Full Box', 350, N'themes/images/ladies/oppopro.jpg', N'6.42 inch ', N'Snapdragon', N'Android   ', N'8 GB      ', N'256 GB    ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (49, 1, N'Iphone 8', N'New 100% , Full Box', 500, N'themes/images/ladies/ip8.jpg', N'4 inch    ', N'Apple A4  ', N'IOS       ', N'1GB       ', N'16GB      ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (50, 1, N'Iphone 8s', N'New 100% , Full Box', 550, N'themes/images/ladies/ip8s.jpg', N'4.5 inch  ', N'Apple A4', N'IOS       ', N'2GB       ', N'32GB      ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (51, 1, N'Iphone 8s PluS', N'New 100% , Full Box', 600, N'themes/images/ladies/ip8splus.jpg', N'4,7 inch  ', N'Apple A9  ', N'IOS       ', N'2GB       ', N'16GB      ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (52, 2, N'SamSung S6', N'New 100% , Full Box', 200, N'themes/images/ladies/sss6.jpg', N'6.4 inch  ', N' Exynos   ', N'Android   ', N'6 GB      ', N'128 GB    ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (53, 3, N'Sony Xperia 8', N'New 100% , Full Box', 330, N'themes/images/ladies/sn8.jpg', N'5 inch    ', N'Snapdragon', N'Android   ', N'3 GB      ', N' 64 GB    ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (54, 4, N'OPPO F3s', N'New 100% , Full Box', 250, N'themes/images/ladies/oppof3s.jpg', N'6.42 inch ', N'Snapdragon', N'Android   ', N'8 GB      ', N'256 GB    ')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (55, 1, N'Iphone X', N'99%', 10, N'themes/images/ladies/ip6.jpg', N'5,5', N'Ax', N'IOS', N'6gb', N'128GB')
INSERT [dbo].[Product] ([Pid], [Cid], [Pname], [Note], [Price], [Piture], [Manhinh], [CPU], [Hedieuhanh], [Ram], [Bonhotrong]) VALUES (58, 1, N'Iphone X1', N'99%', 10, N'themes/images/ladies/ip6.jpg', N'5,5', N'Ax', N'IOS', N'6gb', N'128GB')
SET IDENTITY_INSERT [dbo].[Product] OFF
ALTER TABLE [dbo].[Cart]  WITH CHECK ADD  CONSTRAINT [FK_Cart_Custommer] FOREIGN KEY([Cusid])
REFERENCES [dbo].[Custommer] ([Cusid])
GO
ALTER TABLE [dbo].[Cart] CHECK CONSTRAINT [FK_Cart_Custommer]
GO
ALTER TABLE [dbo].[CartDetail]  WITH CHECK ADD  CONSTRAINT [FK_CartDetail_Cart] FOREIGN KEY([Cartid])
REFERENCES [dbo].[Cart] ([Cartid])
GO
ALTER TABLE [dbo].[CartDetail] CHECK CONSTRAINT [FK_CartDetail_Cart]
GO
ALTER TABLE [dbo].[CartDetail]  WITH CHECK ADD  CONSTRAINT [FK_CartDetail_Product] FOREIGN KEY([Pid])
REFERENCES [dbo].[Product] ([Pid])
GO
ALTER TABLE [dbo].[CartDetail] CHECK CONSTRAINT [FK_CartDetail_Product]
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [FK_Product_Categories] FOREIGN KEY([Cid])
REFERENCES [dbo].[Categories] ([Cid])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [FK_Product_Categories]
GO
USE [master]
GO
ALTER DATABASE [Mobilezz] SET  READ_WRITE 
GO
