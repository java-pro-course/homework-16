# Домашнее задание №16

> Ссылка на установку `Docker` на `Windows`: https://docs.docker.com/desktop/install/windows-install/

## Задача №1 (после установки `Docker`)
После установки `Docker` вам нужно зайти в `GitBash` и выполнить команду `docker -v` или `docker --version`.
Вам нужно сделать скрин результата этой команды и отправить его сюда. 

## Задача №2
В этой задаче вам необходимо склонировать несколько docker-образов (минимум три).
После этого выполните команду `docker images` и отправить скрин результата программы.
Вы можете взять любые docker-образы, а можете взять из моего списка:
1. `python`
2. `postgres`
3. `hello-world`
4. `ubuntu`
5. `mongo`

## Задача №3 _(опционально)_
Подготовительные команды и действия: 
1. Зарегистрируйтесь на https://hub.docker.com/
2. Выполните команду `docker login` и введите туда свои учетные данные. 

Возьмите свое приложение на `java`, которое вы делали на прошлом занятии и напишите для `Dockerfile`.

После этого соберите `image` с этим приложением и попробуйте запустить приложение через контейнер, 
а не через `IntelliJ IDEA`.

После проверки работоспособности можете запушить свой `image` и отправить на него ссылку.