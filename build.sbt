name := "zentask"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings

val appDependencies = Seq(
  javaJdbc,
  javaEbean
)
