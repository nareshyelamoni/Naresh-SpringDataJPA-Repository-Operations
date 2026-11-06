# Spring Data JPA Repository Operations

## Project Overview

This project demonstrates different repository operations using Spring Data JPA and Spring Boot. It focuses on retrieving records by ID, searching records using Query by Example (QBE), and deleting multiple records using batch operations.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- MySQL
- Maven
- Eclipse IDE

## Project Features

### 1. Search Vaccine by ID
- Retrieves a vaccine record using its primary key.
- Uses `getReferenceById()` from JpaRepository.

### 2. Search Vaccine by Given Information (Query by Example)
- Searches vaccine records based on the provided object properties.
- Uses `Example.of()` to create an Example object.
- Uses `findAll()` to retrieve matching records.

### 3. Delete Vaccine Records by Multiple IDs
- Retrieves records using multiple IDs with `findAllById()`.
- Checks whether matching records exist.
- Deletes multiple records using `deleteAllByIdInBatch()`.

## Project Structure

```text
SpringDataJpaRepository
│
├── src/main/java
│   └── com.naresh
│       ├── SpringDataJpaRepositoryApplication.java
│       ├── model
│       │   └── Vaccine.java
│       ├── repo
│       │   └── IvaccineRepo.java
│       └── service
│           ├── IVaccineService.java
│           └── VaccineService.java
│
├── src/main/resources
│   └── application.properties
│
├── src/test/java
├── pom.xml
└── README.md
```

## Repository Methods Used

| Repository Method | Purpose |
|---|---|
| `getReferenceById()` | Retrieves an entity reference by ID |
| `findAll()` | Retrieves matching records |
| `findAllById()` | Retrieves multiple records using IDs |
| `deleteAllByIdInBatch()` | Deletes multiple records in a batch |

## Query by Example (QBE)

Query by Example is a feature of Spring Data JPA that allows searching database records using an example entity object.

Example:

```java
Vaccine vac = new Vaccine("Rabies", "Bharat Biotech", 950.00);

Example<Vaccine> example = Example.of(vac);

List<Vaccine> list = repo.findAll(example);
```

The non-null properties of the example object are used as matching criteria by default.

## Sample Vaccine Information

| Vaccine Name | Company | Cost |
|---|---|---:|
| Rabies | Bharat Biotech | 950.00 |

## Learning Outcomes

- Understanding JpaRepository and its built-in methods.
- Retrieving database records using primary keys.
- Implementing Query by Example (QBE).
- Performing batch delete operations.
- Understanding the Service and Repository layers.
- Integrating Spring Boot with MySQL using Hibernate.

## Author

**Naresh Yelamoni**

Java Backend Developer

GitHub: [nareshyelamoni](https://github.com/nareshyelamoni)
