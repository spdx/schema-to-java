# schema-to-java
Generates Java classes from the SPDX Schema

on linux
to open terminal:- alt+ ctrl+ t

commands to perform conversion:
$ mvn jibx:schema-codegen

To customized generated classes:
From terminal:
$ java -cp Downloads/jibx/lib/jibx-tools.jar org.jibx.schema.codegen.CodeGen --import-docs=true --show-schema=false --delete-annotations=true --prefer-inline=true --use-inner=true -t schema-to-java/src/main/source-code -w schema-to-java/src/main/config/spdx-schema.xsd







