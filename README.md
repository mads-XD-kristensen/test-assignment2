# test-assignment2

## 1 Reflections
### 1.1 Computer mouse
- Jeg ville teste om musen virkede
- Dens vægt
- Dens holdbarhed
- Batteri levetid hvis den var trådløs
- Dens delay

### 1.2 Catastrophic failure
I 1960'erne afyrede NASA en ubemandet raket, The Mariner 1 space probe, som skulle samle data. Raketten gik ud af kurs og de fik den til at selvdestruere. De fandt ud af at der manglede et "-" i en linje kode og det var grunden til at raketten fik forkerte signaler og fløj ud af kurs. Heldigvis kostede det dem kun 18 millioner dollars (169 millioner hvis det var i dag).

Måske de skulle have lavet simulationer, men hvordan gør man det i 1960'erne? idk.

## 2 Two katas
I koden ligger der en "strings.feature" fil og der er en "stepDefinitions" fil (nederst i filen ligger også de funktioner jeg har gjort brug af)

Jeg har ikke lavet bowling game opgaven for jeg forstod den ikke helt

## 3 Investigation of tools
### 3.1 JUnit 5
- @Tag:
  - Purpose: Allows you to categorize tests. Tags can be used to selectively run a subset of tests based on their tags.
  - Usefulness: Helps in organizing and executing tests based on different criteria, such as functionality, performance, or any other category.

- @Disabled:
  - Purpose: Marks a test class or method as disabled or ignored.
  - Usefulness: Useful when a particular test is not ready to run or temporarily needs to be excluded from the test suite.

- @RepeatedTest:
  - Purpose: Specifies that a test method should be repeated a certain number of times.
  - Usefulness: Useful for testing scenarios where the same test needs to be executed multiple times to check for consistency or to identify intermittent failures.

- @BeforeEach and @AfterEach:
  - @BeforeEach
    - Purpose: Indicates that the annotated method should be executed before each test method in the class.
  - @AfterEach
    - Purpose: Indicates that the annotated method should be executed after each test method in the class.
  - Usefulness: Helps in setting up and tearing down the test environment, ensuring that each test starts with a known state and ends cleanly.

- @BeforeAll and @AfterAll:
  - @BeforeAll
    - Purpose: Indicates that the annotated method should be executed once before all test methods in the class.
  - @AfterAll
    - Purpose: Indicates that the annotated method should be executed once after all test methods in the class.
  - Usefulness: Useful for setting up and tearing down resources that are shared among all tests in a class.

- @DisplayName:
  - Purpose: Provides a custom display name for a test class or method.
  - Usefulness: Improves the readability of test reports and output by using a more descriptive and human-readable name.

- @Nested:
  - Purpose: Allows the grouping of tests within a test class, facilitating the creation of nested test structures.
  - Usefulness: Enhances test organization and readability by structuring related tests in a hierarchical manner.

- assumeFalse and assumeTrue:
  - assumeFalse Purpose: If the given condition is true, the test will fail.
  - assumeTrue Purpose: If the given condition is false, the test will fail.
  - Usefulness: These methods are used for conditional test execution.

## 3.2 Mocking frameworks
**Mockito vs spock**

De er begge to meget ens
Spock kan bruges til både java og groovy, og spock er et fuldt testing framework som fungere på egen hånd, mockito fungere kun når der også er JUnit.
Spock har bedre readability og der skal skrives mindre for at opnå det samme.

Jeg har ikke prøvet at arbejde med spock så jeg kan ikke sige om hvad jeg foretrækker, men at skulle skrive mindre lyder fedt.
