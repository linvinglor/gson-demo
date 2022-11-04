load("@rules_java//java:defs.bzl", "java_library", "java_binary")

java_library(
    name = "java-maven-lib",
    srcs = glob(["src/main/java/com/demo/*.java"]),
     deps = ["@maven//:com_google_code_gson_gson"],
)

java_binary(
  name = "gson",
  main_class = "com.demo.GsonDemo",
  runtime_deps = [":java-maven-lib"],
)