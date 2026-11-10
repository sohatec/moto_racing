# Dùng JDK 21 bản nhẹ của Amazon
FROM amazoncorretto:21-alpine
# Tạo thư mục làm việc trong container
WORKDIR /app
# Copy file JAR từ thư mục out của IntelliJ vào container
# ĐỔI TÊN: Thay "moto_racing_jar" và "moto_racing.jar" bằng tên thật của bạn
COPY out/artifacts/moto_racing_jar/moto_racing.jar /app/moto_racing.jar
# Lệnh chạy ứng dụng khi container khởi động
ENTRYPOINT ["java", "-jar", "/app/moto_racing.jar"]