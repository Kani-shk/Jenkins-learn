# 🚀 Jenkins CI/CD Pipeline for Django Notes App

This project demonstrates a simple CI/CD pipeline using **Jenkins**, **Docker**, and **GitHub**, deploying a Django-based Notes application.

---

## 🔁 Pipeline Stages

- **Hello** – Welcome stage using Jenkins Shared Library  
- **Clone** – Clones Django app from GitHub  
- **Build** – Builds Docker image (`notes-app:latest`)  
- **Push** – Pushes image to Docker Hub using Jenkins credentials  
- **Deploy** – Runs the app using `docker compose`  

---

## 🔧 Requirements

- Jenkins with a configured agent (labeled `Node_k1`)  
- Docker & Docker Compose installed on the agent  
- Jenkins Shared Library named `Shared` with custom functions:
  - `hello()`
  - `clone(repo, branch)`
  - `docker_build(app, tag, user)`
  - `docker_push(app, tag, user)`

---

## 🔐 Jenkins Credentials

- **ID:** `DockerHub_cred`  
- **Type:** Username and Password  
- **Used for:** Logging in to Docker Hub inside the pipeline

---

## 🌐 Access

Once deployed, the application is accessible at:

```
http://<agent-ip>:8000
```

To get the IP of your Jenkins agent:
```bash
hostname -I
```

---

## 📦 Docker (Manual Usage)

```bash
docker build -t notes-app:latest .
docker run -d -p 8000:8000 notes-app:latest
```

---

## 🙋 Author

**Kanishk Sharma**  
🔗 [GitHub Profile](https://github.com/Kani-shk)
