# Assert System Exit

The AssertSystemExit is the library for junit 5 to assert `System.exit()` code.

## Quick Start

Add dependency in `pom.xml`
```xml
<dependency>
    <groupId>com.panupat</groupId>
    <artifactId>junit.assertSystemExit</artifactId>
    <version>1.0</version>
    <scope>test</scope>
</dependency>
```

In test class add this block of code

```java
import static com.panupat.junit.AssertSystemExit.assertSystemExit;

@Test
void testLaunchJob() {
    // someMethod() will call System.exit(0);
    assertSystemExit(0, () -> someMethod());
}
```