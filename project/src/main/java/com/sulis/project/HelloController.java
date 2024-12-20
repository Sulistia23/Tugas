package com.sulis.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return """
<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blog Pribadi</title>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&family=Poppins:wght@400;600&display=swap" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <style>
        /* Global Styling */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Poppins', sans-serif;
            background-color: #f7f8fa;
            overflow-x: hidden;
            scroll-behavior: smooth;
        }

        /* Background Animation */
        .background {
            position: absolute;
            top: 0;
            left: 0;
            height: 100%;
            width: 100%;
            background: linear-gradient(45deg, #6a89cc, #f2d7d5);
            animation: gradient 6s ease infinite;
            z-index: -1;
        }
        @keyframes gradient {
            0% { background: linear-gradient(45deg, #6a89cc, #f2d7d5); }
            50% { background: linear-gradient(45deg, #f2d7d5, #6a89cc); }
            100% { background: linear-gradient(45deg, #6a89cc, #f2d7d5); }
        }

        /* Header */
        header {
            background: rgba(0, 0, 0, 0.5);
            color: white;
            padding: 80px 0;
            text-align: center;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
            z-index: 1;
        }
        header h1 {
            font-size: 3.5rem;
            font-weight: 700;
            letter-spacing: 2px;
            text-transform: uppercase;
            animation: fadeIn 2s ease-out;
        }
        @keyframes fadeIn {
            0% { opacity: 0; }
            100% { opacity: 1; }
        }

        /* Section Styling */
        .container {
            width: 90%;
            margin: 60px auto;
        }

        .bio-section {
            margin: 40px 0;
        }

        .bio-section h2 {
            color: #4682b4;
            font-size: 2.2rem;
            text-align: center;
            margin-bottom: 20px;
            border-bottom: 3px solid #4682b4;
            padding-bottom: 10px;
            animation: slideIn 1s ease-out;
        }
        @keyframes slideIn {
            0% { transform: translateY(-20px); opacity: 0; }
            100% { transform: translateY(0); opacity: 1; }
        }

        /* Card Design */
        .bio-card {
            background: white;
            border-radius: 12px;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
            margin-bottom: 30px;
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .bio-card:hover {
            transform: translateY(-10px);
            box-shadow: 0 20px 40px rgba(0, 0, 0, 0.1);
        }

        .bio-card table, .bio-card ul {
            padding: 20px;
            width: 100%;
        }

        .bio-card table th, .bio-card table td {
            padding: 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        .bio-card table th {
            background-color: #4682b4;
            color: white;
            text-transform: uppercase;
        }

        .bio-card ul li {
            font-size: 16px;
            padding: 12px 0;
            line-height: 1.6;
            transition: color 0.3s ease;
        }

        .bio-card ul li:hover {
            color: #4682b4;
        }

        .bio-card ul li i {
            color: #4682b4;
            margin-right: 10px;
        }

        footer {
            background-color: #4682b4;
            color: white;
            padding: 30px 0;
            text-align: center;
            position: relative;
            bottom: 0;
            width: 100%;
            box-shadow: 0 -4px 15px rgba(0, 0, 0, 0.1);
        }
        footer p {
            margin: 0;
        }

        /* Button Design */
        .cta-button {
            display: inline-block;
            padding: 15px 30px;
            margin-top: 20px;
            background-color: #4682b4;
            color: white;
            font-size: 1.1rem;
            border-radius: 25px;
            text-decoration: none;
            text-transform: uppercase;
            letter-spacing: 1px;
            transition: background-color 0.3s ease;
        }

        .cta-button:hover {
            background-color: #3b6a98;
        }

        /* Media Query for Mobile */
        @media (max-width: 768px) {
            header h1 {
                font-size: 2.5rem;
            }
            .bio-section h2 {
                font-size: 1.8rem;
            }
            .bio-card {
                margin-bottom: 20px;
            }
            .container {
                width: 95%;
            }
        }
    </style>
</head>
<body>

<div class="background"></div>

<header>
    <h1>BIODATA</h1>
</header>

<div class="container">
    <section class="bio-section">
        <h2>Informasi Pribadi</h2>
        <div class="bio-card">
            <table>
                <tr>
                    <th>Nama</th>
                    <td>Dwi Sulistiawati</td>
                </tr>
                <tr>
                    <th>Tempat, Tanggal Lahir</th>
                    <td>OKU Timur, 10 Oktober 2004</td>
                </tr>
                <tr>
                    <th>Alamat</th>
                    <td>Palembang</td>
                </tr>
                <tr>
                    <th>Email</th>
                    <td><i class="fas fa-envelope"></i> dwisulistiawati1010@gmail.com</td>
                </tr>
                <tr>
                    <th>Nomor Telepon</th>
                    <td><i class="fas fa-phone"></i> +62826362789</td>
                </tr>
            </table>
        </div>
    </section>

    <section class="bio-section">
        <h2>Riwayat Pendidikan</h2>
        <div class="bio-card">
            <table>
                <tr>
                    <th>Tahun</th>
                    <th>Institusi</th>
                    <th>Keterangan</th>
                </tr>
                <tr>
                    <td>2010 - 2016</td>
                    <td>MINU Sumber Mulyo</td>
                    <td>SD</td>
                </tr>
                <tr>
                    <td>2016 - 2018</td>
                    <td>MTS Nurussalam</td>
                    <td>MTS</td>
                </tr>
                <tr>
                    <td>2018 - 2022</td>
                    <td>MA Nurussalam</td>
                    <td>SMA</td>
                </tr>
                <tr>
                    <td>2023 - 2026</td>
                    <td>Universitas Nahdlatul Ulama</td>
                    <td>Sarjana</td>
                </tr>
            </table>
        </div>
    </section>

    <section class="bio-section">
        <h2>Pengalaman Kerja</h2>
        <div class="bio-card">
            <ul>
                <li><i class="fas fa-briefcase"></i> Posisi: Web Developer di Perusahaan A (2026 - Sekarang)</li>
                <li><i class="fas fa-briefcase"></i> Posisi: Frontend Developer di Perusahaan B (2025-2026)</li>
            </ul>
        </div>
    </section>

    <div class="text-center">
        <a href="mailto:dwisulistiawati1010@gmail.com" class="cta-button">Kontak Saya</a>
    </div>
</div>
<footer>
                """;
    }
}
