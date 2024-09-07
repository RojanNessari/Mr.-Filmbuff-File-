
# Movie Catalog Management System

This Java project is designed to help manage movie records from various CSV files, with operations such as partitioning movies by genre, serializing movie records into binary files, and allowing interactive navigation of the movie catalog. The project also demonstrates Exception Handling and File I/O techniques.

## Project Overview

The project consists of three parts:
1. **Partitioning Movie Records**: Partition the movie records into genre-based CSV files, identifying any syntax or semantic errors.
2. **Serialization of Movie Arrays**: Create and serialize arrays of movies from each genre-based CSV file.
3. **Deserialization and Navigation**: Deserialize the arrays and provide an interactive menu to navigate through the movie records.

## Features

- **Movie Class**: Implements `Serializable` with attributes like year, title, duration, genres, rating, score, director, actor 1, actor 2, and actor 3.
- **Error Handling**: Detects and handles various syntax and semantic errors in movie records.
- **CSV Processing**: Reads CSV files and validates records based on predefined rules.
- **Binary Serialization**: Converts valid movie records into binary files for efficient storage.
- **Interactive Navigation**: Allows users to navigate through the movie records by genre.

## Parts and Methods

### Part 1: Partition Movies by Genre
- **Method**: `do_part1()`
- **Description**: 
  - Reads movie records from CSV files.
  - Partitions valid records into 17 genre-based CSV files.
  - Records invalid entries in a separate `bad_movie_records.txt` file.
  - Produces a `part2_manifest.txt` file listing all genre-based CSV files.

### Part 2: Serialize Movie Arrays
- **Method**: `do_part2()`
- **Description**: 
  - For each genre-based CSV file, loads movie records into an array and serializes them into binary files.
  - Produces a `part3_manifest.txt` file listing all the binary files.

### Part 3: Deserialize and Navigate Movie Arrays
- **Method**: `do_part3()`
- **Description**: 
  - Deserializes the binary files into a 2D array of movies.
  - Provides an interactive menu for users to navigate through movie arrays by genre.

### Exception Handling
The following custom exceptions are implemented to handle various error types:
- `BadYearException`
- `BadTitleException`
- `BadGenreException`
- `BadScoreException`
- `BadDurationException`
- `BadRatingException`
- `BadNameException`
- `MissingQuotesException`
- `ExcessFieldsException`
- `MissingFieldsException`

## Requirements
- **CSV-Formatted Input Files**: Input data is provided in CSV format with movie records separated by commas.
- **Manifest Files**: 
  - `part1_manifest.txt`: Lists the names of all input movie files.
  - `part2_manifest.txt`: Lists the genre-based CSV files.
  - `part3_manifest.txt`: Lists the binary files for deserialization.

## Running the Program

### Prerequisites
- Java Development Kit (JDK) 8 or later.
- An IDE like IntelliJ IDEA, Eclipse, or any other text editor.

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/Movie-Catalog-Management.git
   ```
2. Compile and run the program using your IDE or terminal.

### Running the Program
1. Compile the Java files:
   ```bash
   javac *.java
   ```
2. Run the driver class:
   ```bash
   java MovieCatalogDriver
   ```

## Interactive Menu

The interactive menu allows the user to:
- Select a movie array to navigate.
- Navigate through the selected array of movies.
- Exit the program.

Example main menu:
```
-----------------------------
Main Menu
-----------------------------
s Select a movie array to navigate
n Navigate [selected genre] movies
x Exit
-----------------------------
Enter Your Choice:
```

## Author

- **Rojan Nessari**  
  *Concordia University, COMP 249, Winter 2024*
