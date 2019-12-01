JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
        App.java \
        DevIntern.java \
        IOHandler.java \
        OliObj.java \
        UIHandler.java
default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
