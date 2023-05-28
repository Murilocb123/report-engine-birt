# Repositorio MVN - 2023

## Comando rodado para instalar o jar do birt
```sh
mvn install:install-file -DgroupId=br.com.reportengine.birt.runtime -DartifactId=birt-v4.13.0 -Dversion=4.13.0  -Dfile="D:/muril/OneDrive/Documents/repositories/microservices/lib/org.eclipse.birt.runtime_4.13.0-20230302.jar" -Dpackaging=jar -DlocalRepositoryPath=. -DcreateChecksum=true -DgeneratePom=true
```