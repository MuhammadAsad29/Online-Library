# Online Library

**Mini Java console application** demonstrating a very small library system (add/show/issue/return books) implemented with a single class.

---

## What this repo contains (quick summary)

- Language: **Java** (single class: `Online_Library.Library`)
- Source: `src/Library.java` (declares `package Online_Library;`)
- Precompiled classes: `out/production/Online Library/Online_Library/*.class`
- IDE files: `.idea/`, `Online Library.iml`

---

## Requirements

- Java JDK (11+ recommended; project metadata shows JDK 20 but any modern JDK should work)

---

## Run the precompiled build (quick)

From the repository root run (Linux / macOS):

```bash
java -cp "out/production/Online Library" Online_Library.Library
```

On Windows (PowerShell or CMD — adjust quoting if needed):

```powershell
java -cp "out\production\Online Library" Online_Library.Library
```

> These commands use the included compiled classes in `out/production/Online Library`. The path contains a space so keep the quotes.

---

## Rebuild from source (recommended)

The source file declares `package Online_Library;` — the source file should live in a folder that matches the package name.

Steps (portable):

```bash
# make a clean build output
mkdir -p out

# ensure the source is in a directory matching its package
mkdir -p src/Online_Library
cp "Online Library/src/Library.java" src/Online_Library/Library.java

# compile into the 'out' directory
javac -d out src/Online_Library/Library.java

# run the program
java -cp out Online_Library.Library
```

On Windows, use equivalent commands (adjust paths/quotes).

---

## Expected behavior (what the program does)

- `addBook(String)` — add a book to internal array and print a confirmation like: `"Book Title" has been Added!`
- `showAvailableBooks()` — lists the currently available books
- `issueBook(String)` — removes/marks a book as issued (prints "The book has been issued!" or "This book does not exist")
- `returnBook(String)` — returns a previously issued book

You may see console output similar to (approximate):

```
"Some Book" has been Added!

Available books are:
1. Some Book
The book has been issued!

Available books are:
...

This book does not exist
```

---

## Project structure

```
Online Library/
├─ src/Library.java                # source (declares package Online_Library)
├─ out/production/Online Library/Online_Library/Library.class   # compiled class
├─ out/production/Online Library/Online_Library/Lib.class       # compiled helper class
├─ .idea/                          # IntelliJ project files
└─ Online Library.iml              # IntelliJ module file
```

---

## License & Author

```
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

Author: Muhammad Asad
```
