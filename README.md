# Проект для домашки(для примера-Википедия)
<a target="_blank" href="https://ru.wikipedia.org/wiki/Заглавная_страница">Wikipedia</a>

## :pushpin: Содержание:

- [Технологии и инструменты](#rocket-технологии-и-инструменты)
- [Реализованные проверки](#-Реализованные-проверки)
- [Сборка в Jenkins](#earth_africa-Jenkins-job)
- [Запуск из терминала](#computer-Запуск-тестов-из-терминала)
- [Allure отчет](#-Тесты)
- [Отчет в Telegram](#-Уведомление-в-Telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#-Примеры-видео-о-прохождении-тестов)

## :rocket: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

## Реализованные проверки

- ✓ Проверка поиска.
- ✓ Проверка страницы авторизации.
- ✓ Проверка кнопок главной страницы.
- ✓ Проверка переключения заголовков.
- ✓ Проверка переключения языка.

## <img src="images/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/qahw13/">Сборка в Jenkins</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/qahw13/"><img src="images/jenkins_job.png" alt="Jenkins"/></a>
</p>

### :earth africa: Параметры сборки в Jenkins:

- browser (браузер, по умолчанию chrome)
- browserVersion (версия браузера, по умолчанию 91.0) 
- remoteUrl (Selenoid URL)
- remoteState (дефолтно-true, если false - возможность запускать локально)

## :computer: Запуск тестов из терминала

Локальный запуск:
```bash
gradle clean test
```

Удаленный запуск:
```bash
clean
test

-Duser=${USER}
-Dpass=${PASS}
-DremoteUrl=${REMOTE}
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSERVERSION}
```

## <img src="images/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/qahw13/">Allure report</a>

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_main.png">
</p>

### :classical_building: Тесты

<p align="center">
<img title="Allure Tests" src="images/allure_tests.png">
</p>

### Графики

<p align="center">
<img title="Allure Graphics" src="images/allure_graphics.png">
</p>

## <img src="images/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_telegram.png">
</p>



### <img src="images/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Примеры видео о прохождении тестов

<p align="center">
<img title="Selenoid Video" src="images/video1.gif" width="250" height="153"  alt="video"> 
</p>
