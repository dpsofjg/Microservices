#####1. Подключение к серверу Eureka:

 http://localhost:8761

#####2. Подключение к ресурсам через Zuul Proxy

http://localhost:8762/one

http://localhost:8762/two

#####3. Запуск пректа


    mvn clean package
    docker-compose up
    
#####4. Проверка ресурсов
 
 
    docker stats
 