import spock.lang.Specification

class LibTest1 extends Specification {
    def "SHello"() {
        setup:
            def sName = 'World'
        when:
            def result = Lib.sHello(sName)
        then:
            result == 'Hello, World!'
    }


    def "SHello"(String sName, String result) {
        expect:
            Lib.sHello(sName) == result
        where:
        sName | result
            'World' | 'Hello, World!'
            'Andrey' | 'Hello, Andrey!'
            'Ilya' | 'Ilya, Hello!'
    }
}
