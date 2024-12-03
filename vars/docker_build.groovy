def call(ProjectName, ImageTag, DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}

// this does not concern the demo pipeline
