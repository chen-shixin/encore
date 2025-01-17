ARG DOCKER_BASE_IMAGE
FROM ${DOCKER_BASE_IMAGE}

LABEL org.opencontainers.image.url="https://github.com/svt/encore"
LABEL org.opencontainers.image.source="https://github.com/svt/encore"

COPY build/libs/encore*.jar /app/encore.jar

WORKDIR /app

CMD ["java", "-jar", "encore.jar"]
