#requires java 11
# -d => directory in which modules will be created
# --module-source-path => root directory of the modules
# $(find . -name "*.java") => list .java files as input to create modules
javac -d mods --module-source-path . $(find . -name "*.java")
