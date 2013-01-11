name			:= "scmirror"

organization	:= "de.djini"

version			:= "0.10.0"

scalaVersion	:= "2.9.2"

libraryDependencies	++= Seq(
	"de.djini"		%%	"scutil"	% "0.14.0"	% "compile",
	"org.specs2"	%%	"specs2"	% "1.12.3"	% "test"
)

scalacOptions	++= Seq("-deprecation", "-unchecked")
