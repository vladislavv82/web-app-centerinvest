# Этап 1: Сборка приложения с использованием Maven
FROM maven:latest AS stage1

WORKDIR /app
COPY pom.xml /app
# Кэширование зависимостей для ускорения повторных сборок
RUN mvn dependency:resolve

COPY . /app
RUN mvn clean
RUN mvn package -DskipTests

# Этап 2: Запуск приложения
FROM openjdk:17 as final

# Копирование JAR файла из этапа сборки в финальный образ
COPY --from=stage1 /app/target/*.jar app.jar

EXPOSE 9090

CMD ["java", "-jar", "/app.jar"]
