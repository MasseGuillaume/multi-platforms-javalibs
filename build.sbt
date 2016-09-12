val defaultNativeSettings = Seq(
  nativeClangOptions := Stream(
    "-I/nix/store/rxvzdlp5x3r60b02fk95v404y3mhs2in-boehm-gc-7.2f-dev/include",
    "-L/nix/store/bw1p8rairfwv2yif2g1cc0yg8hv25mnl-boehm-gc-7.2f/lib"
  )
)

val defaultSettings = Seq(
  scalaVersion := "2.11.8"
)

lazy val javalibs = crossProject2
  .settings(defaultSettings)
  .nativeSettings(defaultNativeSettings)

lazy val javalibsJs = javalibs.js
lazy val javalibsJVM = javalibs.jvm
lazy val javalibsNative = javalibs.native

lazy val javalanglib = crossProject2
  .settings(defaultSettings)
  .nativeSettings(defaultNativeSettings)

lazy val javalanglibJs = javalanglib.js
lazy val javalanglibJVM = javalanglib.jvm
lazy val javalanglibNative = javalanglib.native