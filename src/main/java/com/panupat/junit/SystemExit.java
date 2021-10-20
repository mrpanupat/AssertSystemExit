package com.panupat.junit;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SystemExit extends Throwable {
    private final Integer exitCode;
}
