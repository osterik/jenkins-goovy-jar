class LibTest extends GroovyTestCase{

    void testSHello(){
        assert Lib.sHello('World') == 'Hello, World!'
    }
}
