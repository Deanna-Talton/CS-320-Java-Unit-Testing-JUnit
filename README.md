# CS-320-Software-Testing-and-Quality-Assurance

This repository contains a portfolio artifact from CS 320: Software Test, Automation, and Quality Assurance at Southern New Hampshire University. The included project demonstrates my ability to design and implement automated unit tests, validate software requirements, and verify program behavior using structured testing strategies.

The artifact focuses on testing Java-based Contact services by enforcing defined requirements and detecting defects through automated testing. The project emphasizes validating inputs, ensuring consistent program behavior, and using testing to confirm software reliability rather than relying on manual execution.

Skills Demonstrated: Unit Testing • Automated Testing • JUnit • Input Validation • Requirements Verification • Defect Detection • Java Software Quality Assurance

---

Reflection Journal

This project emphasized that software should not only run but also be verified to behave correctly. I ensured the program was functional by creating automated JUnit tests that validated requirements such as field length limits, null value restrictions, valid dates, and unique identifiers. Running the test suite after each code change allowed me to immediately identify defects and confirm that updates did not break existing functionality. Input validation also contributed to security by preventing unexpected or invalid data from entering the system, reducing potential runtime errors and misuse.

I incorporated user needs by translating written requirements into enforceable rules within the program. Each requirement became a validation condition in the constructors or service methods, and I created corresponding tests to confirm those behaviors occurred. Writing tests clarified expectations because each test represented a specific behavior the user required the software to follow. This approach ensured the program matched its specifications rather than relying on assumptions about how it should work.

When designing the software, I began by breaking the program into smaller components with clear responsibilities. Data classes stored information while service classes managed operations and updates. Testing was part of the design process rather than something added afterward. By writing tests and then implementing logic to satisfy them, I was able to detect errors earlier and isolate issues more easily. This project reinforced that structured testing improves maintainability and reliability and that automated testing is an essential part of professional software development.
