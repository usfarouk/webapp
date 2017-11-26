# Steps require to run docker

1. Download docker from offical web site(OS specific version)
2. Install docker(find to install on official site documentation)
3. Type the docker comand to make sure every thinks is Ok

*The docker maven plugin has being add to this project to facilitate container creation
This plugin came with new goal for example: docker:build,docker:push and these goal are integrated with the maven project lifecycle.
So running maven install for example with also run the docker build command to package the application and its dependencies in a container that can be use later for integration for example.*


# NB:Using docker inside a project require additionnal disk space to hold images.

*To test that docker build is working type the following command and sure the command end up well.*

`$mvn install`
*If the command succeed(the image container the application was build), then you can show list of images by typing:*
`$docker images`
