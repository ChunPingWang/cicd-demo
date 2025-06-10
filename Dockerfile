# 使用 OpenJDK 17 作为基础镜像
FROM openjdk:17-jdk-slim

# 设置工作目录
WORKDIR /app

# 复制 Gradle 包装器和构建文件
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .

# 给 gradlew 执行权限
RUN chmod +x ./gradlew

# 复制源代码
COPY src src

# 构建应用程序
RUN ./gradlew build -x test

# 暴露端口（Spring Boot 默认端口 8080）
EXPOSE 8080

# 运行应用程序
CMD ["java", "-jar", "build/libs/cicd-demo-0.0.1-SNAPSHOT.jar"] 