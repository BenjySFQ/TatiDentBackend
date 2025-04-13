# Usa una imagen de Java como base
FROM eclipse-temurin:17-jdk-alpine

# Crea un directorio dentro del contenedor para la app
WORKDIR /app

# Copia el archivo .jar al contenedor
COPY target/ben-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto 8080 (puedes cambiarlo si usas otro)
EXPOSE 7000

# Comando para ejecutar la app usando la variable PORT del entorno
ENTRYPOINT ["sh", "-c", "java -Dserver.port=${PORT:-8080} -jar app.jar"]
