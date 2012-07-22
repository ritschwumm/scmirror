name			:= "scmirror"

organization	:= "de.djini"

version			:= "0.4.0"

scalaVersion	:= "2.9.2"

libraryDependencies	++= Seq(
	"de.djini"		%%	"scutil"	% "0.8.0"	% "compile",
	"org.specs2"	%%	"specs2"	% "1.11"	% "test"
)

scalacOptions	++= Seq("-deprecation", "-unchecked")
