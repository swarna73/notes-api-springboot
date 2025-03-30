
#  Notes API (Spring Boot)

A lightweight and extensible REST API for managing notes—built using **Java**, **Spring Boot**, and an in-memory **H2 database**. Users can create, edit, delete, tag, and search notes. This project is part of a hands-on journey to regain technical depth and showcase engineering leadership.

---

##  Features

-  Create new notes
-  Update existing notes
-  Delete notes
-  Search notes by keyword
-  Filter notes by tag
-  Built with clean architecture and REST best practices

---

## Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (can easily switch to PostgreSQL)
- **Maven**
- **Swagger/OpenAPI** (for API documentation)

---

##  API Endpoints

| Method | Endpoint              | Description                   |
|--------|-----------------------|-------------------------------|
| GET    | `/api/notes`          | Get all notes                 |
| POST   | `/api/notes`          | Create a new note             |
| PUT    | `/api/notes/{id}`     | Update an existing note       |
| DELETE | `/api/notes/{id}`     | Delete a note                 |
| GET    | `/api/notes/search`   | Search notes by keyword       |
| GET    | `/api/notes/tag/{tag}`| Get notes by tag              |

---

## ✅ Sample JSON (Request Body for POST/PUT)

```json
{
  "title": "Meeting Notes",
  "content": "Discussed Q1 OKRs and roadmap...",
  "tag": "work"
}



⸻

🛠️ How to Run Locally
	1.	Clone the repository:

git clone https://github.com/swarna73/notes-api-springboot.git
cd notes-api-springboot

	2.	Run the application:

./mvnw spring-boot:run

	3.	Access the API:

http://localhost:8080/api/notes

	4.	Explore Swagger UI (API Docs):

http://localhost:8080/swagger-ui.html



⸻

🎯 Future Enhancements
	•	🔐 Add JWT-based user authentication
	•	🧾 Add timestamps (createdAt, updatedAt)
	•	🗃️ Migrate from H2 to PostgreSQL
	•	🐳 Dockerize the app
	•	🧪 Add JUnit/Mockito tests

⸻

📚 Learning Purpose

This project is part of a self-guided learning path to return to a hands-on Engineering Manager role, with an emphasis on backend systems, clean architecture, and modern development practices.

⸻

📄 License

This project is licensed under the MIT License.



