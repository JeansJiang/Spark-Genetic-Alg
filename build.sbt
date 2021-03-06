name := "GeneticAlgoritm_Spark"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions := Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8")

resolvers += "spray repo" at "http://repo.spray.io"

val sparkVersion = "1.6.0"

libraryDependencies ++= Seq(
  "org.apache.spark"  %% "spark-core"    % sparkVersion ,
  "org.apache.spark"  %% "spark-graphx"  % sparkVersion ,
  "org.apache.spark"  %% "spark-mllib"   % sparkVersion ,
  "org.apache.spark"  %% "spark-sql"     % sparkVersion
)
