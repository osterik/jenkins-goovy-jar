# How to build JAR artifact
1. Update version in `pom.xml`
2. Build with  
`mvn clean package`
3. Prepare files for deploy (update version too!)
```
    mvn install:install-file \
        -Dfile=target/library-0.0.1.jar \
        -DgroupId=jar.groovy.jenkins \
        -DartifactId=library \
        -Dversion=0.0.1 \
        -Dpackaging=jar \
        -DlocalRepositoryPath=repo \
        -DgeneratePom=true \
        -DcreateChecksum=true
```
4. Deploy to the "repo"  
`scp -r ./repo user@test.company.com:/var/www/test.company.com`

# How to use JAR artifact in Jenkins
```
@GrabResolver(name='library', root='https://test.company.com/repo/')
@Grab(group='jar.groovy.jenkins', module='library', version='0.0.1')

import Lib

println Lib.sHello('World')
```

**Dont't forget to update the version or to clean Jenkins cache(?)**
