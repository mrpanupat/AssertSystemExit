package com.panupat.junit;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.io.FileDescriptor;
import java.net.InetAddress;
import java.security.Permission;

@Getter
@RequiredArgsConstructor
public class DisallowExitSecurityManager extends SecurityManager {

    private final SecurityManager originSecurityManager;

    @Override
    @SneakyThrows
    public void checkExit(int statusCode) {
        throw new SystemExit(statusCode);
    }

    @Override
    public Object getSecurityContext() {
        return originSecurityManager == null ? null : originSecurityManager.getSecurityContext();
    }

    @Override
    public void checkPermission(Permission perm) {
        if (originSecurityManager != null) {
            originSecurityManager.checkPermission(perm);
        }
    }

    @Override
    public void checkPermission(Permission perm, Object context) {
        if (originSecurityManager != null) {
            originSecurityManager.checkPermission(perm, context);
        }
    }

    @Override
    public void checkCreateClassLoader() {
        if (originSecurityManager != null) {
            originSecurityManager.checkCreateClassLoader();
        }
    }

    @Override
    public void checkAccess(Thread t) {
        if (originSecurityManager != null) {
            originSecurityManager.checkAccess(t);
        }
    }

    @Override
    public void checkAccess(ThreadGroup g) {
        if (originSecurityManager != null) {
            originSecurityManager.checkAccess(g);
        }
    }

    @Override
    public void checkExec(String cmd) {
        if (originSecurityManager != null) {
            originSecurityManager.checkExec(cmd);
        }
    }

    @Override
    public void checkLink(String lib) {
        if (originSecurityManager != null) {
            originSecurityManager.checkLink(lib);
        }
    }

    @Override
    public void checkRead(FileDescriptor fd) {
        if (originSecurityManager != null) {
            originSecurityManager.checkRead(fd);
        }
    }

    @Override
    public void checkRead(String file) {
        if (originSecurityManager != null) {
            originSecurityManager.checkRead(file);
        }
    }

    @Override
    public void checkRead(String file, Object context) {
        if (originSecurityManager != null) {
            originSecurityManager.checkRead(file, context);
        }
    }

    @Override
    public void checkWrite(FileDescriptor fd) {
        if (originSecurityManager != null) {
            originSecurityManager.checkWrite(fd);
        }
    }

    @Override
    public void checkWrite(String file) {
        if (originSecurityManager != null) {
            originSecurityManager.checkWrite(file);
        }
    }

    @Override
    public void checkDelete(String file) {
        if (originSecurityManager != null) {
            originSecurityManager.checkDelete(file);
        }
    }

    @Override
    public void checkConnect(String host, int port) {
        if (originSecurityManager != null) {
            originSecurityManager.checkConnect(host, port);
        }
    }

    @Override
    public void checkConnect(String host, int port, Object context) {
        if (originSecurityManager != null) {
            originSecurityManager.checkConnect(host, port, context);
        }
    }

    @Override
    public void checkListen(int port) {
        if (originSecurityManager != null) {
            originSecurityManager.checkListen(port);
        }
    }

    @Override
    public void checkAccept(String host, int port) {
        if (originSecurityManager != null) {
            originSecurityManager.checkAccept(host, port);
        }
    }

    @Override
    public void checkMulticast(InetAddress maddr) {
        if (originSecurityManager != null) {
            originSecurityManager.checkMulticast(maddr);
        }
    }

    @Override
    public void checkPropertiesAccess() {
        if (originSecurityManager != null) {
            originSecurityManager.checkPropertiesAccess();
        }
    }

    @Override
    public void checkPropertyAccess(String key) {
        if (originSecurityManager != null) {
            originSecurityManager.checkPropertyAccess(key);
        }
    }

    @Override
    public void checkPrintJobAccess() {
        if (originSecurityManager != null) {
            originSecurityManager.checkPrintJobAccess();
        }
    }

    @Override
    public void checkPackageAccess(String pkg) {
        if (originSecurityManager != null) {
            originSecurityManager.checkPackageAccess(pkg);
        }
    }

    @Override
    public void checkPackageDefinition(String pkg) {
        if (originSecurityManager != null) {
            originSecurityManager.checkPackageDefinition(pkg);
        }
    }

    @Override
    public void checkSetFactory() {
        if (originSecurityManager != null) {
            originSecurityManager.checkSetFactory();
        }
    }

    @Override
    public void checkSecurityAccess(String target) {
        if (originSecurityManager != null) {
            originSecurityManager.checkSecurityAccess(target);
        }
    }

    @Override
    public ThreadGroup getThreadGroup() {
        return originSecurityManager == null ? null : originSecurityManager.getThreadGroup();
    }
}