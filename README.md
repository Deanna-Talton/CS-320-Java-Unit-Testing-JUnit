# CS-320-Software-Testing-and-Quality-Assurance

This repository contains a portfolio artifact from CS 320: Software Test, Automation, and Quality Assurance at Southern New Hampshire University. The included project demonstrates my ability to design and implement automated unit tests, validate software requirements, and verify program behavior using structured testing strategies.

The artifact focuses on testing Java-based Contact services by enforcing defined requirements and detecting defects through automated testing. The project emphasizes validating inputs, ensuring consistent program behavior, and using testing to confirm software reliability rather than relying on manual execution.

Skills Demonstrated: Unit Testing • Automated Testing • JUnit • Input Validation • Requirements Verification • Defect Detection • Java Software Quality Assurance

---

## **Reflection Journal**

This project emphasized that software quality depends on verification, not just execution. I ensured the program was functional by developing automated JUnit tests that validated requirements such as field length limits, null value restrictions, valid dates, and unique identifiers. Running the test suite after each change allowed me to immediately detect defects and confirm that updates did not break previously working features. Instead of manually checking behavior, the automated tests consistently verified the same conditions each time the program was modified. Input validation also improved security by preventing unexpected or invalid data from entering the system, reducing the likelihood of runtime errors and improper use.

I incorporated user needs by translating written requirements into enforceable program behavior. Each requirement became a specific rule implemented in constructors or service methods, and I created corresponding test cases to confirm those rules were followed. Writing the tests required me to clearly interpret what the user or specification actually expected, rather than assuming how the program should behave. The tests acted as proof that the software met its intended purpose, and they provided documentation for the system’s expected behavior.

When designing the software, I approached development by separating responsibilities into manageable components. Data classes stored information while service classes handled operations and validation. Testing was part of the design process rather than something performed after coding was complete. Writing tests alongside implementation helped identify logical errors earlier and simplified debugging because failing tests pointed directly to incorrect behavior. Through this project I learned that testing supports maintainability, since future changes can be made with confidence that existing functionality will continue to work.

Overall, this work changed how I view programming. Instead of thinking of code as finished once it runs, I now see reliable software as code that has been verified. Automated testing allows developers to safely modify and improve programs while reducing the risk of introducing new defects. The project demonstrated that structured testing, requirement validation, and automation are essential parts of professional software development and quality assurance.

