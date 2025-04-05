#  Hibernate Java-Based Config – Student Entity Demo 📚

Welcome to a clean, annotation-driven Hibernate project that skips the XML clutter and goes fully Java!  
This mini project shows how to configure Hibernate using **pure Java classes** with a simple `Student` entity to perform basic **CRUD operations**.

---

## 🚀 What’s Inside?

✅ Java-based Hibernate configuration (no XML required)  
✅ JPA annotations for mapping the `Student` entity  
✅ Seamless integration with MySQL  
✅ SessionFactory setup with pure Java code  
✅ Lightweight and beginner-friendly structure  

---

## 📦 Tech Stack

- **Java 21**
- **Hibernate ORM**
- **MySQL **
- **IDE**: Spring Tool Suite

---

🛠️ Project Setup
1️⃣ Clone the repository
git clone https://github.com/your-username/hibernate-java-student-demo.git


🗂️ Folder Structure

src/
 └── main/
     ├── java/
     │   └── com.yourapp/
     │       ├── entity/
     │       │   └── Student.java
     │       ├── util/
     │       │   └── HibernateUtil.java
     │       └── MainApp.java
🔍 Sample Console Output

Hibernate: insert into students (email, name) values (?, ?)

🧠 Why Java Config?

💡 Cleaner & type-safe configuration
💡 No need for bulky XML files
💡 Easier maintenance & modern approach

---

## 👨‍🎓 Student Entity (Sample)

```java
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
}
