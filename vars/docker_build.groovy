def call(ProjectName, ImageTag, DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
// this is to trigger pipeline
