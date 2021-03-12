#!/usr/bin/env groovy
/* groovylint-disable CompileStatic, DuplicateNumberLiteral, LineLength */

/** common functions */
class Lib {

    /** PoC function for testing
    */
    static String sHello (String sName = '') {
        return 'Hello, ' + sName + '!'
    }

}
