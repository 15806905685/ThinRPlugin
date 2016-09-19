package com.mogujie.thinR;

public class ThinRExtension {

    public boolean skipThinR = false
    public boolean skipThinRDebug = true
    public int logLevel = 2


    @Override
    public String toString() {
        String str =
                """
                skipThinR: ${skipThinR}
                skipThinRDebug: ${skipThinRDebug}
                logLevel: ${logLevel}
                """
        return str
    }
}
