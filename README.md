# MusicPlayer-Java

A simple and extensible desktop music player built in Java. This application allows users to play, organize, and manage their local music library with a user-friendly interface.

## Features

- Play popular music file formats (MP3, WAV, etc.)
- Create, edit, and manage playlists
- Basic playback controls: play, pause, stop, next, previous
- Display song information (title, artist, album, etc.)
- Organize songs by metadata
- Lightweight and efficient, with minimal dependencies

## Getting Started

### Prerequisites

- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-downloads.html) installed
- (Optional) [Maven](https://maven.apache.org/) or [Gradle](https://gradle.org/) for building from source

### Running the Application

1. Clone this repository:
    ```sh
    git clone https://github.com/maithilimukherjee/MusicPlayer-Java.git
    cd MusicPlayer-Java
    ```

2. Compile the project:
    - Using command line:
      ```sh
      javac -d bin src/**/*.java
      ```
    - Or use your preferred IDE to import and build the project.

3. Run the application:
    ```sh
    java -cp bin Main
    ```
    (Replace `Main` with the main class name if different.)

### Building with Maven

If a `pom.xml` is present, you can build with Maven:
```sh
mvn clean package
java -jar target/MusicPlayer-Java.jar
```

## Project Structure

```
src/
  └── main/
      └── java/
          └── [application packages]
README.md
LICENSE
```

## Usage

- Add music files to your library.
- Create playlists and arrange songs as desired.
- Use playback controls to listen to your favorite tracks.

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature-name`)
3. Commit your changes
4. Push to your fork and open a pull request

Bug reports and suggestions are also encouraged through [GitHub Issues](https://github.com/maithilimukherjee/MusicPlayer-Java/issues).
