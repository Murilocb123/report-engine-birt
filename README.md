# Repositorio MVN - 2023

## Comando rodado para instalar o jar do birt
```sh
mvn install:install-file -DgroupId=org.eclipse.birt.runtime -DartifactId=birt-v4.13.0 -Dversion=4.13.0  -Dfile=./repository/org/eclipse/birt/runtime/org.eclipse.birt.runtime_4.13.0-20230302.jar -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=./repository -DcreateChecksum=true
```