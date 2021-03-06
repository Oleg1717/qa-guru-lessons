# QA.GURU LESSONS

## Lessons list
|Main lessons|Additional lessons|
|----------------------------------------------------|----------------------------------------------------|
|[1. Вводное занятие. Сразу в бой!](#lesson-1)|[Профессионально работаем с IntelliJ IDEA Юрий Артамонов (JetBrains)]()|
|[2. Погружаемся в инструментарий и библиотеки. Станислав Васенков. Дмитрий Тучс.](#lesson-2)||  
|[3. Основы Java. Дмитрий Тучс.](#lesson-3)||
|[4. Selenide #1. Алексей Виноградов.](#lesson-4)||
|[5. Продолжаем разрабатывать автотесты. Больше возможностей.](#lesson-5)||  
|[6. Allure Reports. Артём Ерошенко.](#lesson-6)||
|[7. Работаем с файлами.](#lesson-7)||
|[8. Git. Github. Погружаемся. Дмитрий Тучс.](#lesson-8)||
|[9. Jenkins. Создаем первую задачу.](#lesson-9)||
|[10. Управляем параметрами в коде и в Jenkins.](#lesson-10)||
|[11. Станислав Васенков. Телеграм-бот. Отправляем уведомления о результатах прохождении автотестов.](#lesson-11)||
|[12. Учимся быстро разрабатывать готовые проекты для тестовых заданий.](#lesson-12)||
|[13. Selenoid. Роман Орлов.](#lesson-13)||
|[14. Библиотека Owner. Артём Ерошенко.](#lesson-14)||
|[15. Selenide #2. Дмитрий Тучс.](#lesson-15)||
|[16. REST API. Пишем автотесты с Rest-assured.](#lesson-16)||
|[17. REST API. Продолжаем изучать.](#lesson-17)||
|[18. REST API. Продолжаем изучать.](#lesson-18)||
|[19. SOAP API. Дмитрий Тучс](#lesson-19)||
|[20. Мобильная автоматизация #1. Разрабатываем автотесты с Browserstack.](#lesson-20)||
|[21. Мобильная автоматизация #2. Разрабатываем автотесты с эмулятором Android-устройства и на своем телефоне.](#lesson-21)||

## Lesson 1
### Вводное занятие. Сразу в бой!
1. Практика. Пишем первый автотест: Java / Gradle / JUnit5 / Selenide.
2. Изучаем готовый проект с инфраструктурой: Github / Jenkins / Allure Report / Allure TestOps / Selenoid / Телеграм-бот
### ДЗ
1. Установите необходимый инструментарий по инструкции https://wiki.qa.guru/pages/viewpage.action?pageId=327811
2. Скопируйте код из репозитория https://github.com/qa-guru/simple-google-search
3. Проект для нотификаций http://github.com/qa-guru/allure-notifications
4. Запустите автотест  
В поле ответа необходимо приложить скриншот пройденного автотеста.

## Additional lesson 1
### Профессионально работаем с IntelliJ IDEA Юрий Артамонов (JetBrains)
1. Основы
2. Git and Github
3. Docker
4. Базы данных
5. HTTP Client
6. Selenium
7. BDD Support

## Lesson 2
### Погружаемся в инструментарий и библиотеки. Станислав Васенков. Дмитрий Тучс
1. Git - самые основы
2. Теория: Gradle, JUnit5, Selenide.
3. Практика. Работаем с тренажером demoqa.com
4. Рассмотрим подробнее возможности Selenide и CSS/Xpath-селекторы
### ДЗ
1. Зарегистрируйте аккаунт на https://github.com
2. Создайте новый проект для домашнего задания https://github.com/new
3. Разработайте автотест на проверку формы https://demoqa.com/automation-practice-form
4. Запушьте код в свой репозиторий и дайте на него ссылку в качестве ответа на домашнее задание

## Lesson 3
### Основы Java. Дмитрий Тучс
1) src - main / src - test
2) Класс с точки зрения файлов
3) Класс с точки зрения Java
4) Метод main
5) Данные в классах (class fields)
6) Методы
7) Наследование
8) Статические данные и статические методы
9) Возврат значения из метода
10) Конструкторы
11) Передача значений (по ссылке / по значению)
12) Инкапсуляция (private public protected)
### ДЗ
1) Почитать по ссылкам и уложить у себя в голове;
2) Создать свой вариант класса, описывающее состояние и простое поведение объекта (выбрать любой из окружающего мира);
3) Показать через метод main: создание, работу с данными и методами объекта.

## Lesson 4
### Selenide #1. Алексей Виноградов
1. Лайвкодинг - тесты для GitHub
2. DOM для начинающих
3. Основные функции библиотеки Selenide (справочник-шпаргалка)
### ДЗ
1. Есть ли разница между $("h1 div"); и $("h1").$("div"); - может ли привести к тому что, поиск найдёт разные элементы?  
   Если может - приведите пример, когда.
2. Разработайте следующий автотест:
- Откройте страницу Selenide в Github
- Перейдите в раздел Wiki проекта
- Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
- Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
3. (опциональное) Запрограммируйте Drag&Drop с помощью Selenide.actions()
- Откройте https://the-internet.herokuapp.com/drag_and_drop
- Перенесите прямоугольник А на место В
- Проверьте, что прямоугольники действительно поменялись

## Lesson 5
### Продолжаем разрабатывать автотесты. Больше возможностей.
1. Добавляем в код PageObjects
2. Генерация рандомных значений для тестов - RandomUtils / JavaFaker
3. executeJavascript() - вызов javascript-кода из Selenide, делаем параметризированные тесты
4. ElementsCollection - работаем с коллекцией элементов
### ДЗ
1. Возьмите ваш код написанный для формы в рамках ДЗ ко второму занятию https://demoqa.com/automation-practice-form
2. Добавьте в ваш код PageObjects
3. Добавьте в ваш код генерацию рандомных значений используя Java Faker  
В поле ответа приложите ссылку на ваш репозиторий в GitHub
### Lesson branch
https://github.com/Oleg1717/qa-guru-lessons/tree/lesson5


## Lesson 6
### Allure Reports. Артём Ерошенко
1. Практика. Подключение Allure Reports и настройка отчетности о прохождении автотестов.
2. Практика. Построение более информативной отчетности с вложениями: прикладываем скриншоты, файлы, логи и другие вложения в отчет.
3. Теория. Обзор возможностей Allure Reports.
### ДЗ
Написать тест на проверку названия Issue в репозитории через Web-интерфейс.  
Этот тест представить в трех вариантах:
1. Чистый Selenide
2. Лямбда шаги через step (name, () -> {})
3. Шаги с аннотацией @Step
   В качестве ответа на задание приложите ссылку на свой репозиторий GitHub в поле ответа

## Lesson 7
### Работаем с файлами
1. Как скачать и прочитать файл
2. Проверяем контент в .txt, .pdf, .xls/.xlsx, .doc/.docx, .zip
### ДЗ
1. Создайте свои файлы:
- Текстовый (doc / docx)
- pdf
- xls / xlsx
- Архив zip c паролем.
2. Выгрузите их в свой репозиторий на GitHub.
3. Напишите тесты на проверку содержимого каждого из них.
4. Попробуйте отличные от Codeborne библиотеки для работы с pdf / xls
5. В качестве ответа приложите ссылку на свой репозиторий в GitHub.

## Lesson 8
### Git. Github. Погружаемся. Дмитрий Тучс
1. Еще раз повторим основы Git & Github.
2. Основы ветвления, pull requests.
3. Работа в парах: правим друг у друга код
### ДЗ
1. Взять любое предыдущее ДЗ
- создать branch
- сделать три изменения тремя коммитами
- сделать скрин git log, после чего обьединить три коммита в один общий.
- Сделать пулл реквест на бранче.
2. Разбиться на пары
- сделать пулл реквест в чужой репо , с какими-нибудь изменениями в коде
- провести CR - написать комментарий, апрувнуть изменения


## Lesson 9
### Jenkins. Создаем первую задачу
1. Практика. Создаем задачу (Job), связываем с репозиторием в Github, запускаем тесты удаленно.
2. Теория. Основы Jenkins.
3. Теория. Основы CI/CD.
4. Работа в парах: создаем друг другу джобы и запускаем чужой код
### ДЗ
1. Взять свой код для automation-practice-form
2. Добавить аттачи для Allure – скриншот, page source, console.log и видео
3. Cделать сборку в Jenkins  
В качестве ответа нужно приложить ссылку на Allure-отчет в Jenkins (с видео)

## Lesson 10
### Управляем параметрами в коде и в Jenkins.
1. Передаем параметры в код из командной строки
2. Прячем приватные данные с библиотекой owner
3. Передаем параметры из jenkins
### ДЗ
1. Доработать свой код  
   1.1 Передать из дженкинса адрес удаленного браузера  
   1.2 Спрятат логин/пароль к удаленному браузеру в .properties файл, считывать его нужно в коде с owner
2. Групповое дз  
   2.1 Сделать сборку в дженкинсе на код коллеги (тест должен успешно пройти)  
   2.2 Подготовить код, чтобы на ваши тесты коллега сделал сборку с дженкинс.

## Lesson 11
### Станислав Васенков. Телеграм-бот. Отправляем уведомления о результатах прохождении автотестов
1. Практика. Пишем телеграмм-бота.
2. Практика. Постобработка сборки. Настраиваем отправку уведомлений в Jenkins.
3. Теория. Обзор возможностей Telegram API.
### ДЗ
1. Создайте проект с любыми автотестами, либо возьмите уже созданный.
2. Создайте задачу в Jenkins
3. Зарегистрируйте бота в Telegram, создайте чат и добавьте бота в него.
4. Добавьте бота к вашему проекту.  
Для выполнения домашнего задания нужно приложить скриншот из телеграм-чата с нотификацией о прохождении автотестов в поле ответа.

## Lesson 12
### Учимся быстро разрабатывать готовые проекты для тестовых заданий
Набиваем руку небольшими проектами.
1. Находим интересную нам вакансию (hh.ru / linkedin / @qa_jobs)
2. Делаем небольшой проект:
- разрабатываем 5-10 простых автотестов на сайт из вакансии
- создаем задачу в jenkins,
- прячем секретные данные с owner (более развернуто будет в следующем занятии)
- настраиваем Allure-отчет, добавляем вложения:
    - снимки экрана,
    - логи браузера,
    - видеозапись теста,
- настраиваем нотификацию в telegram / slack.

По мере прохождения курса добавим сюда:
- автотесты на API
- тест-план Allure TestOps - с ручными и автоматизированными тестами
- интеграцию с Jira
3. Отправляем наш проект hr c сопроводительным письмом
###ДЗ
1. Выберите вакансию
2. Напишите на неё автотестов (5-10, простых, главное не тратьте на это много времени!)
3. Сделайте джобу в Jenkins, добавьте Allure отчёт, уведомления в чат Telegram, Selenoid.
4. Оформите всё со скриншотами в readme.md
   В поле ответа на задание приложите:

Ссылку на джобу в Jenkins, репозиторий с тестами на github, скриншот письма рекрутёру.
Если вы не находитесь в поиске работы, просто сбросьте всё вышеуказанное на ревью.

## Lesson 13
### Selenoid. Роман Орлов
1. Практика. Добавляем контейнеризацию к задаче в Jenkins.
2. Теория. Основы Docker. Selenoid

## Lesson 14
### Библиотека Owner. Артём Ерошенко
1. Правильно организуем хранение свойств (properties) в проекте с библиотекой Owner
2. Прячем секретные данные в Jenkins
### ДЗ
Конфигурация API тестов

**Сделать пример конфигурации для API тестов:**
1. Базовый url
2. Токен
3. Токен нужно передавать защищенно:
- Через файл на файловой системе
- Через системные property

**Конфигурация WEB тестов**  
Сделать пример конфигурации для WEB тестов:
1. Имя браузера
2. Версия браузера
3. Локальный или удаленный (RemoteWebDriver)

Сделать два вида конфигурационных файлов:
1. Для локального запуска на chrome
2. Для удаленного запуска на selenoid
3. Сделать возможность с помощью одной системной переменной переключать запуск с локального на удаленный.

**В качестве ответа на задание:**  
Ссылку на репозиторий в Github и  закомиченый конфиг файл

## Lesson 15
### Selenide #2. Дмитрий Тучс
Практика:
- Написание автотестов для Allure TestOps на Selenide.
- PageObjects & Components
- Java
- JUnit5 Extensions
### ДЗ
По ссылке доступна таблица для заполнения, где каждый сможет вписать свой сценарий на Allure TestOps, который вы будете автоматизировать. Табличка нужна для того, чтобы вы не пересекались по сценариям (могли видеть, что уже выбрано другими студентами).

Сценарий должен быть в виде тест-кейса. На выходе ожидается PR, где в описании будет продублированы тест-кейс(ы), которые автоматизированы в этом PR.

## Lesson 16
### REST API. Пишем автотесты с Rest-assured
1. Практика. Пишем тесты на REST API при помощи библиотеки Rest-assured
2. Теория. Основы HTTP-протокола, типы запросов, коды ответов.
### ДЗ
Разработайте 5 автотестов на запросы из https://reqres.in/  
Дайте код на ревью коллегам из своей группы. После ревью они должны поставить вашему репозиторию звездочку. К сдаче принимается дз с минимум 2мя звездами.

## Lesson 17
### REST API. Продолжаем изучать
1. Практика. Декомпозируем UI-автотест в несколько API-автотестов.
   Больше возможностей REST-assured
2. Изучаем вспомогательные инструменты:
- Postman,
- Charles/Fiddler,
- chrome dev tools (вкладка Network)
3. Теория. Больше про REST API.
### ДЗ
Сайт магазина http://demowebshop.tricentis.com/  
Исследовать сайт магазина, автоматизировать проверку ui-взаимодействия по api (разработать любой автотест)
Например: сделать тест на добавление товара в корзину и проверить количество товара в корзине по апи  
В помощь - https://github.com/autotests-cloud/example_project  
В качестве ответа на задание приложить ссылку на репозиторий в GitHub

## Lesson 18
### REST API. Продолжаем изучать
Разбор предыдущего урока

## Lesson 19
### SOAP API. Дмитрий Тучс
### ДЗ
Создать тест в SOAPUI с разными ассертами (скриптовыми и встоенными).  
Выгрузить в виде xml проекта.  
(ОПЦИОНАЛЬНО) Попробовать запустить его с помощью gradle (4.2) или maven ([пример](http://github.com/O5ten/soapui-maven-example))

## Lesson 20
### Мобильная автоматизация #1. Разрабатываем автотесты с Browserstack
1. Практика. Учимся пользоваться инспектором в Browserstack, разрабатываем первые автотесты на iOS / Android с Selenide
2. Практика. Browserstack-API. Забираем логи, видео.
3. Теория. Основы тестирования мобильных приложений.
### ДЗ
- Зарегистрировать аккаунт в browserstack
- Запустить автотест с примером из browserstack локально
- Разработать еще один автотест, используя инспектор browserstack (простейший тест)
- Вынести данные (логин, пароль, урл браузерстека и т.д.) в .properties с owner
- Сделать сборку в дженкинсе
- Добавить проект в TestOps

## Lesson 21
### Мобильная автоматизация #2. Разрабатываем автотесты с эмулятором Android-устройства и на своем телефоне
1. Настраиваем рабочее место:
  - Appium
  - Android Studio
  - Настраиваем переменные среды
2. Эмулируем Android устройство
3. Подключаем свой телефон
4. Практика. Разрабатываем автотесты с Appium.
5. Теория. Основы Appium.
### ДЗ
1. Установить android studio https://developer.android.com/studio
2. Прописать path:
  - Windows:
    - %ANDROID_HOME%\tools  
    - %ANDROID_HOME%\tools\bin
    - %ANDROID_HOME%\platform-tools  
    - Одной строкой, можно скопировать и добавить в конец Path: ;%ANDROID_HOME%\tools;%ANDROID_HOME%\tools\bin;%ANDROID_HOME%\platform-tools  

- Mac:
  - $ANDROID_HOME/tools
  - $ANDROID_HOME/tools/bin
  - $ANDROID_HOME/platform-tools
  - Одной строкой, можно скопировать и добавить в .bash_profile:  
export PATH=”${PATH}:/$ANDROID_HOME/tools:/$ANDROID_HOME/tools/bin:/$ANDROID_HOME/platform-tools”
3. Установить appium desktop https://github.com/appium/appium-desktop
4. В android studio -> SDK Manager скачать 11 андроид (если не скачан по умолчанию)
5. В AVD Manager скачать образ Pixel 4 для 11 андроида (если не скачан по умолчанию)
6. Запустить эмулятор телефона, опробовать кнопки и функционал
7. Открыть Appium Desktop, запустить server, проконектиться к эмулятору
8. Открыть в appium desktop инспектор, изучить его функционал, попробовать найти локатор
9. Разработать автотест на getting started в приложении википедии - пройти по 4м экранам, на каждом сделать проверку
10. Доработать возможность запуска на разных стендах (передать из командной строки -DdeviceHost=browserstack / selenoid / emulation / real

Для каждого сделать драйвер и конфиг с owner