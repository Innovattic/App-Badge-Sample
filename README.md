This is the sample for the app badge gradle plugin.

The plugin can be found here:
https://github.com/Innovattic/App-Badge

It relies on the `mavenLocal` gradle repository to locate the app badge plugin -
so you need to first ensure that the plugin is published at the local repository on your machine.

You can do this by running the publish task in the app badge plugin project:
`./gradlew publishToMavenLocal`

See the readme in the plugin repo for more information.
