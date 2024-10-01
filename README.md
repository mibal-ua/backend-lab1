# Backend Laboratory Work 1

This is a backend laboratory work project developed by **Mykhailo Balakhon**, a student of group **IM-22**. The project is a RESTful web service that provides a `/healthcheck` endpoint, created using **Java (Spring Framework)**.

## How to Run

To run the project locally, ensure you have `Docker`, `Java 17`, and `Maven` installed on your machine. Then, follow these steps after cloning the repository:

1. Open the terminal and navigate to the project directory.
2. Build the project using Maven:
    ```bash
    mvn clean package
    ```
3. Build a Docker image:
    ```bash
    docker build -t backend-lab1:latest .
    ```

4. Build and run using Docker Compose:
    ```bash
    docker-compose build
    ```
    ```bash
    docker-compose up
    ```

5. Open your browser and send a GET HTTP request to:
   ```
   https://localhost:7070/healthcheck
   ```

## Deployment

The service is deployed on **Render** at:

```
https://backend-lab1-nsve.onrender.com/healthcheck
```

Access this URL to perform the health check.
