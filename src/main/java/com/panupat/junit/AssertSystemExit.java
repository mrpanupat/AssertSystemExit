package com.panupat.junit;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;

@UtilityClass
@SuppressWarnings("unused")
public class AssertSystemExit {

    @SneakyThrows
    public static void assertSystemExit(Integer expectedStatusCode, Executable executable) {
        DisallowExitSecurityManager disallowExitSecurityManager = new DisallowExitSecurityManager(System.getSecurityManager());
        System.setSecurityManager(disallowExitSecurityManager);

        Integer actualSystemExit = null;
        try {
            executable.execute();
        } catch (SystemExit systemExit) {
            actualSystemExit = systemExit.getExitCode();
        } finally {
            System.setSecurityManager(disallowExitSecurityManager.getOriginSecurityManager());
            assertEquals(
                    expectedStatusCode,
                    actualSystemExit,
                    "Expected exit code" + expectedStatusCode + " but actual was " + actualSystemExit + "."
            );
        }
    }
}
